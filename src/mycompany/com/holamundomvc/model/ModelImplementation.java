/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycompany.com.holamundomvc.model;

import java.util.ResourceBundle;

/**
 * Model implementation for getting the greeting from a properties file.
 * @author jmarturi
 */
public class ModelImplementation {
    /**
     * This method returns a string containing a greeting  from a 
     * properties file.
     * @return The String containing the greeting
     */
    public String getGreeting(){
        return ResourceBundle.getBundle("data").getString("GREETING");
    }
    
}
