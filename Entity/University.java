package entity;
import dblibrary.project.csci230.*;
import controllers.*;
/**
 * @author holeyfan
 * @version 1.0
 */
public class University extends UniversityController
{
  
  public String name, state, location, control, emphases;
  public int numOfStudents, numApplicants;
  public double finAid, perAdmitted, percentFemale, satVerbal, satMath, expenses, perEnrolled;
  public int academicScale, socialScale, lifeScale;
  
  
  /**
   * get the details of the university given in the parameter
   * @param name
   */
  public University(String name, String state, String location, String control, int numOfStudents, double percentFemale,
		  double satVerbal, double satMath, double expenses, double finAid, int numApplicants, double perAdmitted,
		  double perEnrolled, int academicScale, int socialScale, int lifeScale)
  {
    this.name = name;
    this.state = state;
    this.location = location;
    this.control = control;
    this.numOfStudents = numOfStudents;
    this.percentFemale = percentFemale;
    this.satVerbal = satVerbal;
    this.satMath = satMath;
    this.expenses = expenses;
    this.finAid = finAid;
    this.numApplicants = numApplicants;
    this.perAdmitted = perAdmitted;
    this.perEnrolled = perEnrolled;
    this.academicScale = academicScale;
    this.socialScale = socialScale;
    this.lifeScale = lifeScale;
}
  public void getDetails(String name)
  {
  }
  
  public void viewSearchResults()
  {
  }
  
  public String getName()
  {
  return this.name;
  }
  
  public void setName(String name)
  {
  this.name = name;
  }
  
  
  public String getState()
  {
  return this.state;
  }
  public void setState(String state)
  {
  this.state = state;
  }
  
  
  public String getLocation()
  {
  return this.location;
  }
  public void setLocation(String location)
  {
  this.location = location;
  }
  
  
  public String getControl()
  {
  return this.control;
  }
  public void setControl(String control)
  {
  this.control = control;
  }
  
    public int getNumOfStudents()
  {
  return this.numOfStudents;
  }
  public void setNumOfStudents(int numOfStudents)
  {
  this.numOfStudents = numOfStudents;
  }
  
  public String getEmphases()
  {
  return this.emphases;
  }
  public void setEmphasis(String emphases)
  {
  this.emphases = emphases;
  }
  
  
  public double getPercentFemale()
  {
  return this.percentFemale;
  }
  public void setPercentFemale(double percentFemale)
  {
  this.percentFemale = percentFemale;
  }
  
  public double getSatVerbal()
  {
  return this.satVerbal;
  }
  public void setSatVerbal(double satVerbal)
  {
  this.satVerbal = satVerbal;
  }
  
  
  public double getSatMath()
  {
  return this.satMath;
  }
  public void setSatMath(double satMath)
  {
  this.satMath = satMath;
  }
  
  public double getExpenses()
  {
  return this.expenses;
  }
  public void setExpenses(double expenses)
  {
  this.expenses = expenses;
  }
  
  
  public double getFinAid()
  {
  return this.finAid;
  }
  public void setFinAid(double finAid)
  {
  this.finAid = finAid;
  }
  
  
  public int getNumApplicants()
  {
  return this.numApplicants;
  }
  public void setNumApplicants(int numApplicants)
  {
  this.numApplicants = numApplicants;
  }
  
  public double getPerAdmitted()
  {
  return this.perAdmitted;
  }
  public void setPerAdmitted(double perAdmitted)
  {
  this.perAdmitted = perAdmitted;
  }
  
    public double getPerEnrolled()
  {
  return this.perEnrolled;
  }
  public void setPerEnrolled(double perEnrolled)
  {
  this.perEnrolled = perEnrolled;
  }
  
  
  public int getAcademicScale()
  {
  return this.academicScale;
  }
  public void setAcademicScale(int academicScale)
  {
  this.academicScale = academicScale;
  }
  
  
  public int getSocialScale()
  {
  return this.socialScale;
  }
  public void setSocialScale(int socialScale)
  {
  this.socialScale = socialScale;
  }
  
  
  public int getLifeScale()
  {
  return this.lifeScale;
  }
  
  public void setLifeScale()
  {
  //this.lifeScale = lifeScale;
  }

  
}
