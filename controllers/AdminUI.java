/**
 * Admin confirms that the account exist
 */
package controllers;

import entity.Admin;
import entity.User;

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
 public String confirmMessage()
 {
   String message = "Successfuul login";
   return message;
 }
 
 
 /**
  * Confirms that there is no account or the user or password is incorrect
  */
 public String failMessage()
 {
   String message = "Try again";
  return message;
  
 }

 public void viewListOfUsers()
 {
   int j = 0;
   String[][] users = this.adFuncController.getListOfUsers();
     for (int i =0;  i < users.length; i++)
   {
     for(;j < 5; j++)
     {
   System.out.println(users[i][j]);
   }
   }
 }
 
 public void addNewUser(User user)
 {
  int passFail =this.adFuncController.addNewUser(user); 
  if(passFail == 0)
  {System.out.println("Your attempt to add a new user was successful");}
  else
  {System.out.println("Your attmept to add a new user failed");}
 }
 
 public void changePassword(String username, String password)
 {
 this.adFuncController.resetUsersPassword(username, password);
 }
 
}