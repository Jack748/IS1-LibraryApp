package model;


import model.Address;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ludov
 */
public class RegisteredUser extends User{
    RegisteredUser(String firstName, String lastName, String username, String password, String street, int number, int floor, String city){
        this.firstName=firstName;
        this.lastName=lastName;
        this.username = username;
        this.password = password;
        this.address= new Address(street, number, floor, city);  
    }
    
  
    
    public void UpdateProfile(String firstName, String lastName, String username, String password, String street, int number, int floor, String city){
        this.firstName=firstName;
        this.lastName=lastName;
        this.username = username;
        this.password = password;
        this.address.Update(street, number, floor, city);
    }
}
