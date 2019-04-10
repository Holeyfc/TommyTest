package entity;
import UI.*;
import controllers.*;

/**
 * @author HoleyFanClub
 * @version 2.0
 *
 */
public class Admin extends Account2
{
  
  
  private String password;
  public String userName;
  private char type;
  private char status;
  
  AdminFunctionalityController afc = new AdminFunctionalityController();
  UniversityController uc;
  DatabaseController lib = new DatabaseController();
  LogonController usr;
  University university;
  /**
   * creating an admin account
   * @param userName the user name
   * @param password the password of the account
   * param type the account type, admin or student
   */
  public Admin() 
  {
    usr = new LogonController();
  }
  
  public String getPassword()
  {
	  return password;
  }
  public char getType()
  {
	  return type;
  }
  public char getStatus()
  {
	  return status;
  }
  /**
   * logout of the account
   * @param admin the account to be log out
   */
  public void logout()
  {
    //log out of the account
    usr.logout();
  }
  
  /**
   * login to the account
   * @param userName the userName
   * @param password the password
   * @param type the accoun't type, admin or student
   */
  public void login(String userName, String password)
  {
	//if username and password is correct/matches the library info
	//it will log the user in
    //if (userName.equals(lib.getUsers()) && password.equals(lib.getUsers()))
    //{
    //this.afc.login(userName, password);
  //}
    //if information is not correct, print out an error message
    //else
    //{
    	//System.out.println("Invalid username or password, please try again.");
    //}

    }
  
  /**
   * view the list of universities
   * @param university the universities to view
   */
  public void viewUniversities(University university)
  {

	//if (university.equals(lib.getListOfUniversities()))

    //for(int i = 0; i < university.length(); i++)
    //{
      //for(int j = 0; j < university[i].length; j++)
      //{
       // System.out.println(university[i][j]);
      //}
    //}
    
  }
  
  /**
   * view the list of user
   */
  public void viewUsers()
  {
    String[][] users = this.lib.getUsers();
    for(int i = 0; i < users.length; i++)
    {
      for(int j = 0; j < users[i].length; j++)
      {
        System.out.println(users[i][j]);
      }
      
    }
  }
  /**
   * add a new user
   * @param user the user
   */
  public void addNewUser()
  {
    User user = new User("first" , "last" , "user", "pass", 'u' , 'y');
    System.out.println("user first added");
    
    //add a new user
    this.afc.addNewUser(user);
  }
  
  /**
   * reset the user's password
   * @param user the account's password to be change
   */
  public void resetUserPassword()
  {
    this.afc.resetUsersPassword("juser", "lpassword");
    System.out.println("Password has been changed.");
  }
  
  /**
   * add a new university
   */
  public void addNewUniversity()
  {
    University sPC = new University("SAINT PAUL COLLEGE");
    System.out.println("SAINT PAUL COLLEGE added");
    
    //add a new university
    this.afc.addNewUniversity(sPC);
    
  }
  
  /**
   * edit the information of the university
   */
  public void editUniversityInfo()
  {
    //edit a university's information
    this.afc.editUniversity("BROWN");
    System.out.println("University information has been update.");
  }
  
  /**
   * delete school
   */
  public void deleteSchool()
  {
    //delete the university
    this.afc.deleteUniversity("SAINT PAUL COLLEGE");
    System.out.println("University has been deleted.");
  }
  
  /**
   * save the statistic of school searched  
   */
  public void saveSchoolSearchStatistics()
  {
     System.out.println("schools have been organized by alphabetical order, location, and quality of life scale");
  }
  
  public void deactivateUser()
  {
    this.afc.deactivateUser();
    System.out.println("first deactivated");
  }
  
  /**
   * delete user's account
   */
  public void deleteUser()
  {
    afc.deleteUser("lUser");
    System.out.println("The user has been deleted.");
  }
  
  
  /**
   * view the profile of an account
   */
  public void viewProfile()
  {
    String[][] users = this.lib.getUsers();
    for(int i = 0; i < users.length; i++)
    {
      for(int j = 0; j < users[i].length; j++)
      {
        System.out.println(users[i][j]);
      }
      
    }
    
    
    
  }
}