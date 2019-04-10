package entity;
import controllers.*;
import UI.*;
//@Author HoleyFanClub
//@version 1.0
public class User extends Account2{
  
  private String password;
  public String username, firstName, lastName;
  private char type;
  private char status;
  UI.UserUI userUI;
  
  
  public User(String firstName, String lastName, String username, String password, char type, char status)
  {
    this.username = username;
    this.password = password;
    this.firstName = firstName;
    this.lastName = lastName;
    this.type = type;
    this.status = status;
  }
  
  public String getFirst()
  {return this.firstName;}
  
  public void setFirst(String firster)
  {this.firstName = firster;}
  
  public String getLast()
  {return this.lastName;}
  
  public void setLast(String laster)
  {this.lastName = laster;}
  
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }
  public char getType() {
    return type;
  }
  public void setType(char type) {
    this.type = type;
  }
  public char getStatus() {
    return status;
  }
  public void setStatus(char status) {
    this.status = status;
  }
  
  public void viewProfile()
  {
    System.out.println("username: " + username + " password: " + password + " type: " + type + " status: " + status); 
  }
  
  public void editProfile()
  {
  int j = this.userUI.editProfile(this);
  if (j == 0)
  {
  System.out.println("Your attempt to edit your profile was sucessful");
  }
  else
  {
  System.out.println("Your attempt to edit your profile was unsucessful");
  }
  }
  
  
}
