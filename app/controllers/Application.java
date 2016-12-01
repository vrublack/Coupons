package controllers;

import models.Business;
import models.IPLocation;
import models.PasswordHash;
import play.Logger;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.formdata.LoginFormData;
import play.mvc.Security;
import views.html.Index;
import views.html.Login;
import views.html.Profile;
import views.html.RegisterBusiness;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Implements the controllers for this application.
 */
public class Application extends Controller
{

    private IPLocation ipLocation = new IPLocation();

    // user token mapping to business email
    private Map<String, String> loggedInBusinesses = new HashMap<>();

    public Application() throws IOException
    {
    }

    /**
     * Provides the Index page.
     *
     * @return The Index page.
     */
    public Result index()
    {

        String city = ipLocation.getCityName(request().remoteAddress());
        System.out.println("Request from city: " + city);

        if (request().cookies().get("user_token") != null)
        {
            String userToken = request().cookies().get("user_token").value();
            System.out.println("Request from user with token: " + userToken);

            if (loggedInBusinesses.containsKey(userToken))
            {
                System.out.println("User has also business account with email: " + loggedInBusinesses.get(userToken));
            }
        }

        return ok(Index.render("Home", Secured.isLoggedIn(ctx()), Secured.getUserInfo(ctx())));
    }

    public Result businessSignup()
    {
        return ok(RegisterBusiness.render());
    }

    public Result postBusinessSignup() throws InvalidKeySpecException, NoSuchAlgorithmException
    {
        DynamicForm dynamicForm = Form.form().bindFromRequest();
        String name = dynamicForm.get("name");
        String email = dynamicForm.get("email");
        String plaintextPw = dynamicForm.get("password");
        String hashedPw = PasswordHash.createHash(plaintextPw);
        Business b = new Business(email, name, hashedPw);
        b.save();
        System.out.println("Business added.");
        // go to home page
        return redirect(routes.Application.index());
    }


    /**
     * Provides the Login page (only to unauthenticated users).
     *
     * @return The Login page.
     */
    public Result login()
    {
        Form<LoginFormData> formData = Form.form(LoginFormData.class);
        return ok(Login.render("Login", Secured.isLoggedIn(ctx()), Secured.getUserInfo(ctx()), formData));
    }

    /**
     * Processes a login form submission from an unauthenticated user.
     * First we bind the HTTP POST data to an instance of LoginFormData.
     * The binding process will invoke the LoginFormData.validate() method.
     * If errors are found, re-render the page, displaying the error data.
     * If errors not found, render the page with the good data.
     *
     * @return The Index page with the results of validation.
     */
    public Result postLogin()
    {

        // Get the submitted form data from the request object, and run validation.
        Form<LoginFormData> formData = Form.form(LoginFormData.class).bindFromRequest();

        String email = formData.data().get("email");
        String submittedPw = formData.data().get("password");

        Business match = Business.find.where().eq("bemail", email).findUnique();

        if (match == null)
            return unauthorized("Unknown email");

        if (request().cookies().get("user_token") == null)
        {
            return unauthorized("No user token");
        }

        String userToken = request().cookies().get("user_token").value();

        // check password
        try
        {
            if (PasswordHash.validatePassword(submittedPw, match.getPassword()))
            {
                // update mapping
                loggedInBusinesses.put(userToken, email);
                System.out.println("Logged in: " + email);
                return redirect(routes.Application.index());
            } else
            {
                return unauthorized("Wrong password");
            }

        } catch (NoSuchAlgorithmException | InvalidKeySpecException e)
        {
            e.printStackTrace();
        }

        return internalServerError("Unexpected error");
    }

    /**
     * Logs out (only for authenticated users) and returns them to the Index page.
     *
     * @return A redirect to the Index page.
     */
    @Security.Authenticated(Secured.class)
    public Result logout()
    {
        session().clear();
        return redirect(routes.Application.index());
    }

    /**
     * Provides the Profile page (only to authenticated users).
     *
     * @return The Profile page.
     */
    @Security.Authenticated(Secured.class)
    public Result profile()
    {
        return ok(Profile.render("Profile", Secured.isLoggedIn(ctx()), Secured.getUserInfo(ctx())));
    }

}
