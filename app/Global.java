import models.UserInfoDB;
import play.Application;
import play.GlobalSettings;


public class Global extends GlobalSettings {

  /**
   * @param app The application.
   */
  public void onStart(Application app) {
    // UserInfoDB.addUserInfo("John Smith", "smith@example.com", "password");
  }
}
