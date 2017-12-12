/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airlinebookingsystem;

/**
 *
 * @author christopher
 */

/**
 *
 * @author corey
 */
public class Customer {
    
    //variables
    public static int clientID = 123;
    public String FirstName = "";
    public String LastName = "";
    public String address = "";
    public String email = "";
    public int contactNo = 0;
    public String CardDetails = "";
    
    //constructors
    public Customer (String Fn, String Ln, String Ad,String Em, String Cd, int Cn ){
        
        FirstName = Fn;
        LastName = Ln;
        address = Ad;
        email = Em;
        contactNo = Cn;
        CardDetails = Cd;
        clientID ++;
        
    }

    // create getters and setters
    public static int getClientID() {
        return clientID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public int getContactNo() {
        return contactNo;
    }

    public String getCardDetails() {
        return CardDetails;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setContactNo(int contactNo) {
        this.contactNo = contactNo;
    }

    public void setCardDetails(String CardDetails) {
        this.CardDetails = CardDetails;
    }

    @Override
    public String toString() {
        return "Customer{" + "FirstName=" + FirstName + ", LastName=" + LastName + ", address=" + address + ", email=" + email + ", contactNo=" + contactNo + ", CardDetails=" + CardDetails + '}';
    }
    
}