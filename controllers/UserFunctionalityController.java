/**
 * 
 */
package controllers;
import Entity.*;

/**
 * @author nhoberg001
 *
 */
public class UserFunctionalityController {
  
  /**
   * 
   */
  
  public LogonController logger;
  public DatabaseController database;
  
  public UserFunctionalityController() {
    this.database = new DatabaseController();
  }
  
  
  /**
   * 
   * @param username
   */
  public int editProfile(User user)
  {
   return this.database.editProfile(user);
  }
  
  /**
   * 
   */
  public void getUniversity(String uniName)
  {
    this.database.getUniversity(uniName);
  }
  
  /**
   * 
   * @param username
   */
  public void searchUsersSavedSchools(String username)
  {}
  
  /**
   * 
   */
  public void getUniversity()
  {}
  
  
  /**
   * UC8
   */
  public int saveSchool(String username, String uniName)
  {
    return this.database.saveSchool(username, uniName);
  }
  
  /**
   * 
   */
  public void searchForUser(String username)
  {
    
  }
  
  /**
   * 
   */
  public void logout()
  {
    this.logger.logout();
  }
  
  /**
   * 
   */
  public void login(String username, String password)
  {
    this.logger.login(username, password);
  }
  
}
