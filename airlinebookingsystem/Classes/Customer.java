/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airlinebookingsystem.Classes;

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
    public int clientID;
    public String FirstName = "";
    public String LastName = "";
    public String address = "";
    public String email = "";
    public int phoneNo;
    public String CardDetails = "";
    public String password = "";
    
    //constructors
    public Customer (int cID, String Fn, String Ln, String Ad,String Em, int Pn, String Cd, String Pw ){
        
        clientID = cID;
        FirstName = Fn;
        LastName = Ln;
        address = Ad;
        email = Em;
        phoneNo = Pn;
        CardDetails = Cd;
        password = Pw; 
       
        
    }

    // create getters and setters
    public int getClientID() {
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

    public int getPhoneNo() {
        return phoneNo;
    }

    public String getCardDetails() {
        return CardDetails;
    }
    
    public String getPassword(){
        return password;
    }
    
    public void setClientId(int ClientId){
        this.clientID = ClientId;
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

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setCardDetails(String CardDetails) {
        this.CardDetails = CardDetails;
    }
    
    public void setPassword(String password){
        this.password = password;
    }

    @Override
    public String toString() {
        return "Customer{"+"Clientid="+clientID+", FirstName=" + FirstName + ", LastName=" + LastName + ", address=" + address + ", email=" + email + ", phoneNo=" + phoneNo + ", CardDetails=" + CardDetails +"password="+ password + '}';
    }
    
}