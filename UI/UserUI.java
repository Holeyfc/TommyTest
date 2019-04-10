package UI;
import controllers.*;
import Entity.*;
/**
 * @author holyfan
 * @version 1.0
 */
public class UserUI 
{
  
  UserFunctionalityController user;
  LogonController logger;
  
  /**
   * take user to display user's list page
   */
  public void displayUsersList()
  {
  }
  
  /**
   * take the user to return list page
   */
  public void returnList()
  {
  }
  
  /**
   * 
   */
  public void searchForUser(String username)
  {
    this.user.searchForUser(username);
  }
  
  /**
   * 
   */
  public void saveSchool(String username, String uniName)
  {
    int passFail = this.user.saveSchool(username, uniName);
    if(passFail == 1)
    {}
    else
    {}
    
  }
  
  /**
   * 
   */
 // public void viewProfile()
 // {
 // 
 /// }
  
  /**
   * 
   */
  public int editProfile(User user)
  {
   return this.user.editProfile(user);
  }
  
  
  /**
   * 
   */
  public void login(String username, String password)
  {
    this.user.login(username, password);
  }
  
  /**
   * 
   */
  public void logout()
  {
    this.logger.logout();
  }
}
