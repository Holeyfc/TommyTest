/**
 * Admin confirms that the account exist
 */
package UI;
import entity.*;
import controllers.*;
/**
 * @author HoleyFanClub
 * @version 2.0
 *
 */
public class AdminUI extends Admin {
  
  public AdminFunctionalityController adFuncController = new AdminFunctionalityController();
  
  public AdminUI() {
    
  }
  
  /**
   * Confirms that the user is correct and the password is correct, the account exist
   */
  public void confirmMessage()
  {
    
    System.out.println("Successful Login!");
  }
  
  
  /**
   * Confirms that there is no account or the user or password is incorrect
   */
  public void failMessage()
  {
    
    System.out.println("Try again"); 
    
  }
  
  /**
   * 
   */
  public void viewListOfUsers()
  {
    int j = 0;
    String[][] users = this.adFuncController.getListOfUsers();
    for (int i =0;  i < users.length; i++)
    {
      for(;j < 5; j++)
      {
        System.out.print(users[i][j] + "   ");
      }
      System.out.print("\n");
    }
  }
  
  /**
   * 
   */
  public void addNewUser(User user)
  {
    int passFail =this.adFuncController.addNewUser(user); 
    if(passFail == 0)
    {System.out.println("Your attempt to add a new user was successful");}
    else
    {System.out.println("Your attmept to add a new user failed");}
  }
  
  /**
   * 
   */
  public void deleteUser(String username)
  {
  int passFail = this.adFuncController.deleteUser(username);
      if(passFail == 0)
    {System.out.println("Your attempt to delete a user was successful");}
    else
    {System.out.println("Your attmept to delete a user failed");}
  }
  
  /**
   * 
   */
  public void changePassword(String username, String password)
  {
    this.adFuncController.resetUsersPassword(username, password);
  }
  
  /**
   * UC16
   */
  public void deleteUniversity(String uniName)
  {
    int passFail = this.adFuncController.deleteUniversity(uniName);
    if(passFail == 0)
    {System.out.println("Your attempt to add a new user was successful");}
    else
    {System.out.println("Your attmept to add a new user failed");}
  }
  
  
  /**
   * 
   */
  public void login(String username, String password)
  {
    this.adFuncController.login(username, password);
  }
}