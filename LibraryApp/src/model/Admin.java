package model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ludov
 */
public class Admin extends User {
    int id;
    
    Admin(String firstName, String lastName, String username, String password, String street, int number, int floor, String city, int id){
        this.firstName=firstName;
        this.lastName=lastName;
        this.username = username;
        this.password = password;
        this.id = id;
        this.address=new Address(street, number, floor, city);  
    }
}
