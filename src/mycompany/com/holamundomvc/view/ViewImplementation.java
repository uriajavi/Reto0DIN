/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycompany.com.holamundomvc.view;

/**
 * View implementation to show greeting in a text type UI.
 * @author Javier Martín Uría
 */
public class ViewImplementation implements View{
    /**
     * Shows a greeting in UI.
     * @param greeting A String containing the greeting to be shown.
     */
    public void showGreeting (String greeting){
        System.out.println(greeting);
    }
}
