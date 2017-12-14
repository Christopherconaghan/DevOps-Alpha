/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airlinebookingsystem;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author christopher
 */
public class AdminTest {
    
    public AdminTest() {

    }
    
    @BeforeClass
    public static void setUpClass() {
       Admin  a1 = new Admin ("chris", "conaghan", "chris@gmai.com", 1234);

    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getEmployeeID method, of class Admin.
     */
    
   
    
    @Test
    public void testGetEmployeeID() {
        System.out.println("getEmployeeID");
        int expResult = 123;
        int result = Admin.getEmployeeID();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getFirstName method, of class Admin.
     */
    @Test
    public void testGetFirstName() {
        System.out.println("getFirstName");
        Admin instance = null;
        String expResult = "";
        String result = instance.getFirstName();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getLastName method, of class Admin.
     */
    @Test
    public void testGetLastName() {
        System.out.println("getLastName");
        Admin instance = null;
        String expResult = "";
        String result = instance.getLastName();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getEmail method, of class Admin.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Admin instance = null;
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPhoneNo method, of class Admin.
     */
    @Test
    public void testGetPhoneNo() {
        System.out.println("getPhoneNo");
        Admin instance = null;
        int expResult = 0;
        int result = instance.getPhoneNo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFirstName method, of class Admin.
     */
    @Test
    public void testSetFirstName() {
        System.out.println("setFirstName");
        String FirstName = "";
        Admin instance = null;
        instance.setFirstName(FirstName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLastName method, of class Admin.
     */
    @Test
    public void testSetLastName() {
        System.out.println("setLastName");
        String LastName = "";
        Admin instance = null;
        instance.setLastName(LastName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class Admin.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        Admin instance = null;
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPhoneNo method, of class Admin.
     */
    @Test
    public void testSetPhoneNo() {
        System.out.println("setPhoneNo");
        int phoneNo = 0;
        Admin instance = null;
        instance.setPhoneNo(phoneNo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Admin.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Admin instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    


    
}
