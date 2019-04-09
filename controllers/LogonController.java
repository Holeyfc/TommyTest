/**
 * 
 */
package controllers;


/**
 * @author nhoberg001
 *
 */
public class LogonController {
  
  UserFunctionalityController UFC;
  AdminFunctionalityController AFC;
  
  public DatabaseController database;
  
  public LogonController() {
    this.database = new DatabaseController();
  }
  
  /**
   * UC1
   * @param username
   * @param password
   * @param type is either active or inactive
   */
  public void login(String username, String password)
  {
    boolean user = false;
    boolean pass = false;
    boolean act = false;
    int bool = 0;
    String[][] users = this.database.getUsers();
//    for(int i = 0; i < users.length; i++)
//    {
//      for(int j = 0; j < users[i].length; j++)
//      {
//        System.out.println(users[i][j]);
//      }
//    }
    for (int i = 0; i < users.length; i++)
    {
      if (users[i][2].equals(username))
      {
        user = true;
        if (users[i][3].equals(password))
        {
          pass = true;
          if (users[i][5].equals("Y"))
          {
            act = true;
            System.out.println("Login successful"); 
            bool++;
          }
        }
      }
    }
    if(user == false)
    {
      System.out.println("login unsuccessful because the user wasnt found");
      return;
    }
    if(pass == false)
    {
      System.out.println("login unsuccessful due to invalid password");
      return;
    }
    if(act == false)
    {
      System.out.println("login unsuccessful due to account being inactive");
      return;
    }
    
  }
  
  //from communication
  //public User findByMemberName()
  /**
   * 
   */
  public void logout()
  {
    System.out.println("successfull logout");
  }
  
}
