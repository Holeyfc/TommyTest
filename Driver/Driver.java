package Driver;

import javax.swing.*;
import entity.*;
import UI.*;
import controllers.*;
import dblibrary.project.csci230.*;

import java.io.*;

// Color
import java.awt.*;

// MouseEvent
import java.awt.event.*;

// JLabel, JPanel
import javax.swing.*;

// GRect, GLabel
import acm.graphics.*;

// GraphicsProgram
import acm.program.*;
//file, file not found exception
import java.io.*;
import java.util.*;
import java.lang.*;

public class Driver implements ActionListener{
  UniversityDBLibrary lib;
  JFrame frame;
  JButton uc1, uc2, uc3, uc4, uc5, uc6, uc7, uc8, uc9, uc10, uc11, uc12, uc13, uc14, uc15, uc16, uc17, uc18, uc19, uc20, uc21;
  JPanel panel;
  Account2 account2 = new Account2();
  Admin admin = new Admin();
  public static void main(String[] args)
  {
    new Driver();
  }
  
  public Driver()
  {
    this.panel = new JPanel(new GridLayout(21, 1));
    this.frame = new JFrame("demo");
    this.frame.setSize(1000,1000);
    this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    //creation center for all of the buttons
    this.uc1 = new JButton("uc1: login");
    this.uc2 = new JButton("uc2: view saved universities (extends uc3)");
    this.uc3 = new JButton("uc3: view profile (extends uc1)");
    this.uc4 = new JButton("uc4: view list of universities (admin only, extends uc1)");
    this.uc5 = new JButton("uc5: search (extends uc1)");
    this.uc6 = new JButton("uc6: search results (extends uc5)");
    this.uc7 = new JButton("uc7: view university (extends uc6)");
    this.uc8 = new JButton("uc8: save university (includes uc7)");
    this.uc9 = new JButton("uc9: view list of users (admin only, extends uc1)");
    this.uc10 = new JButton("uc10: add new user (extends uc9)");
    this.uc11 = new JButton("uc11: reset user's password (extends uc9)");
    this.uc12 = new JButton("uc12: add new univerlity (extends uc4)");
    this.uc13 = new JButton("uc13: edit university's information (extends uc4)");
    this.uc14 = new JButton("uc14: deactivate user(extends uc9)");
    this.uc15 = new JButton("uc15: sort university by criteria (extends uc2)");
    this.uc16 = new JButton("uc16: delete school from database (extends uc4)");
    this.uc17 = new JButton("uc17: save school search statistics");
    this.uc18 = new JButton("uc18: search for other student's saved schools (extends uc1)");
    this.uc19 = new JButton("uc19: delete user (extends uc9)");
    this.uc20 = new JButton("uc20: logout (extends uc1)");
    this.uc21 = new JButton("uc21: edit user (extends uc3)");
    
    this.uc1.addActionListener(this);
    this.uc2.addActionListener(this);
    this.uc3.addActionListener(this);
    this.uc4.addActionListener(this);
    this.uc5.addActionListener(this);
    this.uc6.addActionListener(this);
    this.uc7.addActionListener(this);
    this.uc8.addActionListener(this);
    this.uc9.addActionListener(this);
    this.uc10.addActionListener(this);
    this.uc11.addActionListener(this);
    this.uc12.addActionListener(this);
    this.uc13.addActionListener(this);
    this.uc14.addActionListener(this);
    this.uc15.addActionListener(this);
    this.uc16.addActionListener(this);
    this.uc17.addActionListener(this);
    this.uc18.addActionListener(this);
    this.uc19.addActionListener(this);
    this.uc20.addActionListener(this);
    this.uc21.addActionListener(this);
    
    
    
    //all buttons must be added to a panel
    this.panel.add(this.uc1);
    this.panel.add(this.uc2);
    this.panel.add(this.uc3);
    this.panel.add(this.uc4);
    this.panel.add(this.uc5);
    this.panel.add(this.uc6);
    this.panel.add(this.uc7);
    this.panel.add(this.uc8);
    this.panel.add(this.uc9);
    this.panel.add(this.uc10);
    this.panel.add(this.uc11);
    this.panel.add(this.uc12);
    this.panel.add(this.uc13);
    this.panel.add(this.uc14);
    this.panel.add(this.uc15);
    this.panel.add(this.uc16);
    this.panel.add(this.uc17);
    this.panel.add(this.uc18);
    this.panel.add(this.uc19);
    this.panel.add(this.uc20);
    this.panel.add(this.uc21);
    
    //the frame is set to be visible and the panel is added to the center
    this.frame.add(this.panel, BorderLayout.CENTER);
    this.frame.setVisible(true);
    
  }
  public void actionPerformed(ActionEvent event)
  {
    
    if(this.uc1 == event.getSource())
    {
      account2.login();
    }
    else if(this.uc2 == event.getSource())
    {
      account2.viewSavedUniversities();
    }
    else if(this.uc3 == event.getSource())
    {
      account2.viewProfile();
    }
    
    else if(this.uc5 == event.getSource())
    {
      account2.search();
    }
    else if(this.uc6 == event.getSource())
    {
      account2.viewSearchResults();
    }
    
    else if(this.uc8 == event.getSource())
    {
      account2.saveUniversity();
    }
    else if(this.uc9 == event.getSource())
    {
      admin.viewUsers();
    }
    else if(this.uc10 == event.getSource())
    {
      admin.addNewUser();
    }
    else if(this.uc11 == event.getSource())
    {
      admin.resetUserPassword();
    }
    else if(this.uc12 == event.getSource())
    {
      admin.addNewUniversity();
    }
    else if(this.uc13 == event.getSource())
    {
      admin.editUniversityInfo();
    }
    else if(this.uc14 == event.getSource())
    {
      admin.deactivateUser();
    }
    else if(this.uc15 == event.getSource())
    {
      admin.saveSchoolSearchStatistics();
    }
    else if(this.uc16 == event.getSource())
    {
      admin.deleteSchool();
    }
    else if(this.uc17 == event.getSource())
    {
      admin.saveSchoolSearchStatistics();
    }
    else if(this.uc18 == event.getSource())
    {
      account2.searchOthersSchools();
    }
    else if(this.uc19 == event.getSource())
    {
      admin.deleteUser();
    }
    else if(this.uc20 == event.getSource())
    {
      account2.logout();
    }
    else if(this.uc21 == event.getSource())
    {
      account2.editProfile();
    }
  }
  
  
  
}
