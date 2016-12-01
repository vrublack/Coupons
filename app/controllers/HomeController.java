package controllers;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.Transaction;
import play.mvc.*;
import play.data.*;
import static play.data.Form.*;

import models.*;

import javax.inject.Inject;
import javax.persistence.PersistenceException;

/**
 * Manage a database of coupons
 */
public class HomeController  extends Controller {

    private FormFactory formFactory;

    @Inject
    public HomeController(FormFactory formFactory) {
        this.formFactory = formFactory;
    }

    /**
     * This result directly redirect to application home.
     */
    public Result GO_HOME = Results.redirect(
            routes.HomeController.list(0, "name", "asc", "")
    );

    /**
     * Handle default path requests, redirect to coupons list
     */
    public Result index() {
        return GO_HOME;
    }

    /**
     * Display the paginated list of coupons.
     *
     * @param page Current page number (starts from 0)
     * @param sortBy Column to be sorted
     * @param order Sort order (either asc or desc)
     * @param filter Filter applied on coupon names
     */
    public Result list(int page, String sortBy, String order, String filter) {
        return ok(
                views.html.list.render(
                        Coupon.page(page, 10, sortBy, order, filter),
                        sortBy, order, filter
                )
        );
    }

    /**
     * Display the 'edit form' of a existing Coupon.
     *
     * @param id Id of the coupon to edit
     */
    public Result edit(Long id) {
        Form<Coupon> couponForm = formFactory.form(Coupon.class).fill(
                Coupon.find.byId(id)
        );
        return ok(
                views.html.editForm.render(id, couponForm)
        );
    }

    /**
     * Handle the 'edit form' submission
     *
     * @param id Id of the computer to edit
     */
    public Result update(Long id) throws PersistenceException {
        Form<Coupon> couponForm = formFactory.form(Coupon.class).bindFromRequest();
        if(couponForm.hasErrors()) {
            return badRequest(views.html.editForm.render(id, couponForm));
        }

        Transaction txn = Ebean.beginTransaction();
        try {
            Coupon savedCoupon = Coupon.find.byId(id);
            if (savedCoupon != null) {
                Coupon newCouponData = couponForm.get();
                savedCoupon.description = newCouponData.description;
                savedCoupon.promocode = newCouponData.promocode;
                savedCoupon.discountRate = newCouponData.discountRate;
                savedCoupon.name = newCouponData.name;
                savedCoupon.expirationDate = newCouponData.expirationDate;
                savedCoupon.bemail = newCouponData.bemail;

                savedCoupon.update();
                flash("success", "Coupon " + couponForm.get().name + " has been updated");
                txn.commit();
            }
        } finally {
            txn.end();
        }

        return GO_HOME;
    }

    /**
     * Display the 'new computer form'.
     */
    public Result create() {
        Form<Coupon> computerForm = formFactory.form(Coupon.class);
        return ok(
                views.html.createForm.render(computerForm)
        );
    }

    /**
     * Handle the 'new computer form' submission
     */
    public Result save() {
        Form<Coupon> couponForm = formFactory.form(Coupon.class).bindFromRequest();
        if(couponForm.hasErrors()) {
            return badRequest(views.html.createForm.render(couponForm));
        }
        couponForm.get().save();
        flash("success", "Coupon " + couponForm.get().name + " has been created");
        return GO_HOME;
    }

    /**
     * Handle computer deletion
     */
    public Result delete(Long id) {
        Coupon.find.ref(id).delete();
        flash("success", "Coupon has been deleted");
        return GO_HOME;
    }


}
