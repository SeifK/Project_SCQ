/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Seif Khaled
 */
public class NewJFrameTest {
    
    public NewJFrameTest() {
        Login L1 = new Login();
        String outputU = L1.username("admin"); // Default username is set to 'admin'
        String outputP = L1.username("pass"); // Default password is set to 'password'
        String message = "Username/Password isn't correct!"; // Error message
        assertEquals(message, "admin", outputU); //Change the word "admin" for a different test case
        assertEquals(message, "pass", outputP); // Change the word "password" for a different test case
    }

    @Test
    public void testMain() {
    }
    
}
