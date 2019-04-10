package Entity;
import javax.swing.JOptionPane;
import java.util.*;

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
  public void viewUniversities()
  {

	ArrayList<University> schools = lib.getListOfUniversities();

    for(int i = 0; i < schools.size(); i++)
    {
     System.out.println(schools.get(i).toString());
    }
    
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
	  String name = JOptionPane.showInputDialog("please enter the schools name");
	    String state = JOptionPane.showInputDialog("please enter the schools state");
	    String location = JOptionPane.showInputDialog("please enter the schools location");
	    String control = JOptionPane.showInputDialog("please enter the schools control");
	    String numOfStudents2 = JOptionPane.showInputDialog("please enter the schools number of students");
	    String percentFemale2 = JOptionPane.showInputDialog("please enter the schools percent female");
	    String satVerbal2 = JOptionPane.showInputDialog("please enter the schools verbal sat");
	    String satMath2 = JOptionPane.showInputDialog("please enter the schools math sat");
	    String expenses2 = JOptionPane.showInputDialog("please enter the schools expenses");
	    String percentFinancialAid2 = JOptionPane.showInputDialog("please enter the schools percent financial aid");
	    String numOfApplicants2 = JOptionPane.showInputDialog("please enter the schools number of applicants");
	    String percentAdmitted2 = JOptionPane.showInputDialog("please enter the schools percent admitted");
	    String percentEnrolled2 = JOptionPane.showInputDialog("please enter the schools percent enrolled");
	    String academicScale2 = JOptionPane.showInputDialog("please enter the schools academic scale");
	    String socialScale2 = JOptionPane.showInputDialog("please enter the schools social scale");
	    String qualityOfLifeScale2 = JOptionPane.showInputDialog("please enter the schools quality of life scale");
	    
	    int numOfStudents = -10;
		double percentFemale = -10;
		double satVerbal = -10;
		double satMath = -10;
		double expenses = -10;
		double percentFinancialAid = -10;
		int numOfApplicants = -10;
		double percentAdmitted = -10;
		double percentEnrolled = -10;
		int academicScale = -10;
		int socialScale = -10;
		int qualityOfLifeScale;
	    
	    if(!numOfStudents2.equals(""))
	    {
	     numOfStudents = Integer.parseInt(numOfStudents2);
	    }
	    else
	    {
	     numOfStudents = -1;
	    }
	    if(!percentFemale2.equals(""))
	    {
	     percentFemale = Double.parseDouble(percentFemale2);
	    }
	    else
	    {
	     percentFemale = -1;
	    }
	    if(!satVerbal2.equals(""))
	    {
	     satVerbal = Double.parseDouble(satVerbal2);
	    }
	    else
	    {
	     satVerbal = -1;
	    }
	    if(!satMath2.equals(""))
	    {
	     satMath = Double.parseDouble(satMath2);
	    }
	    else
	    {
	     satMath = -1;
	    }
	    if(!expenses2.equals(""))
	    {
	     expenses = Double.parseDouble(expenses2);
	    }
	    else
	    {
	     expenses = -1;
	    }
	    if(!percentFinancialAid2.equals(""))
	    {
	     percentFinancialAid = Double.parseDouble(percentFinancialAid2);
	    }
	    else
	    {
	    percentFinancialAid = -1;
	    }
	    if(!numOfApplicants2.equals(""))
	    {
	     numOfApplicants = Integer.parseInt(numOfApplicants2);
	    }
	    else 
	    {
	    numOfApplicants = -1;
	    }
	    if(!percentAdmitted2.equals(""))
	    {
	     percentAdmitted = Double.parseDouble(percentAdmitted2);
	    }
	    else
	    {
	    percentAdmitted = -1;
	    }
	    if(!percentEnrolled2.equals(""))
	    {
	     percentEnrolled = Double.parseDouble(percentEnrolled2);
	    }
	    else
	    {
	     percentEnrolled = -1;
	    }
	    if(!academicScale2.equals(""))
	    {
	     academicScale = Integer.parseInt(academicScale2);
	    }
	    else
	    {
	     academicScale = -1;
	    }
	    if(!socialScale2.equals(""))
	    {
	     socialScale = Integer.parseInt(socialScale2);
	    }
	    else 
	    {
	     socialScale = -1;
	    }
	    if(!qualityOfLifeScale2.equals(""))
	    {
	     qualityOfLifeScale = Integer.parseInt(qualityOfLifeScale2);
	    }
	    else
	    {
	     qualityOfLifeScale = -1;
	    }
	    
	    University sPC = new University(name, state, location, control, numOfStudents, percentFemale, satVerbal, satMath,
	    		expenses, percentFinancialAid, numOfApplicants, percentAdmitted, 
	    		percentEnrolled, academicScale, socialScale, qualityOfLifeScale);
	    		
    
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