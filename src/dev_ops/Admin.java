/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev_ops;

/**
 *
 * @author corey
 */
public class Admin {
    
    // create variables
    public static int EmployeeID = 123;
    public String FirstName;
    public String LastName;
    public String email;
    public int phoneNo;
    
    //constructor

    public Admin(String FirstName, String LastName, String email, int phoneNo) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.email = email;
        this.phoneNo = phoneNo;
    }

    // create getters and setters
    public static int getEmployeeID() {
        return EmployeeID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    @Override
    public String toString() {
        return "Admin{" + "FirstName=" + FirstName + ", LastName=" + LastName + ", email=" + email + ", phoneNo=" + phoneNo + '}';
    }
    
    
    
}
