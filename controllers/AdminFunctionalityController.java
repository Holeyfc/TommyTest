/**
 * 
 */
package controllers;
import entity.*;
import controllers.*;

/**
 * @author nhoberg001
 *
 */
public class AdminFunctionalityController {
  
  /**
   * 
   */
  public LogonController logger;
  public DatabaseController database;
  
  public AdminFunctionalityController() 
  {
    this.database = new DatabaseController();
  }
  
  public void deactivateUser()
  {
    this.database.editUser();
  }
  /**
   * 
   */
  
  /**
   * java.lang.String school, java.lang.String state, java.lang.String location,
   java.lang.String control, int numberOfStudents, double percentFemales, double SATVerbal, double SATMath,
   double expenses, double percentFinancialAid, int numberOfApplicants, double percentAdmitted, 
   double percentEnrolled, int academicsScale, int socialScale, int qualityOfLifeScale
   */
  
  public void addNewUniversity(University university)
  {
    this.database.addUniversity(university);
  }
  
  /**
   * 
   * @param username
   * @param password
   */
  public int addNewUser(User user) //necessimos paramatinos
  {
    return this.database.addUser(user);
  }
  
  
  /**
   * 
   */
  public int deleteUser(String username)
  {
   return this.database.deleteUser(username);
  }
  
  /**
   * 
   * @param username
   */
  public void editUniversity(String username) //necessimos paramatinos
  {}
  
  /**
   * 
   * @param username
   * @param oldPassword
   * @param newPassword
   */
  public void resetUsersPassword(String username, String newPassword)
  {
    this.database.changePassword(username, newPassword);  
  }
  
  /**
   * UC16
   * @param uniName
   */
  public int deleteUniversity(String uniName)
  {
    return this.database.deleteUniversity(uniName);
  }
  
  /**
   * 
   * @return
   */
  
  public java.lang.String[][] getListOfUsers()
  {
    return this.database.getUsers();
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
