//@author HoleyFanClub
//@version 2.0
package entity;

import dblibrary.project.csci230.*;
import javax.swing.*;
import controllers.*;
public class Account2 {
  
  String password;
  String username;
  char status;
  char type;
  DatabaseController lib;
  SearchController search;
  LogonController log;
  
  public Account2()
  {
    String username = "x";
    String password = "x";
    char status = 'a';
    char type = 'u';
    lib = new DatabaseController();
    search = new SearchController();
    log = new LogonController();
    
  }
  public void logout()
  {
    log.logout();
  }
  
  public void login()
  {
   
    System.out.println("juser"); 
    log.login("juser", "jpass");
    System.out.println("luser");
    log.login("luser", "jpass");
    System.out.println("nadmin");
    log.login("nadmin", "jpass");
    System.out.println("bad password");
    log.login("nadmin" , "1324");
    System.out.println("bad username");
    log.login("1234", "1234");
    
  }
  
  public void viewSavedUniversities()
  {
    String[][] schools = this.lib.getUsernamesWithSavedSchools();
    for(int i = 0; i < schools.length; i++)
    {
      for(int j = 0; j < schools[i].length; j++)
      {
        System.out.println(schools[i][j]);
      }
    }
  }
  
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
  
  public void search()
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
    

	search.searchUniversities(name, state, location, control, numOfStudents, percentFemale, satVerbal, satMath, expenses, percentFinancialAid, numOfApplicants, percentAdmitted,
    		percentEnrolled, academicScale, socialScale, qualityOfLifeScale);
    
  }
  
  public void viewSearchResults()
  {
    search.searchResults();
  }
  
  
  public void saveUniversity()
  {
   System.out.println("saving a new school to juser" + this.lib.saveSchool("juser", "HARVARD"));
   System.out.println("saving an already saved school to luser" + this.lib.saveSchool("luser", "BROWN")); 
   System.out.println("trying to save a school to a nonexistent user" + this.lib.saveSchool("nadmin", "BROWN"));
  }
  
  public void sortUniversityByCriteria()
  {
  }
  
  public void searchOthersSchools()
  {
    String[][] usersAndSchools = lib.getUsernamesWithSavedSchools();
    for(int i = 0; i < usersAndSchools.length; i++)
    {
      if(usersAndSchools[i][0].equals("juser"))
         {
           System.out.println("juser's schools");
           for(int j = 0; j < usersAndSchools[i].length; j++)
           {
             System.out.println(usersAndSchools[i][j]);
           }
         }
    }
  }
  public void editProfile()
  {
    this.lib.editProfile();
    System.out.println("user first has changed to user first2");
  }
  
}



