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
public class RegisteredUser{
    String firstName;
    String lastName;
    String username;
    String password;
    Address address;
    
    RegisteredUser(String firstName, String lastName, String username, String password, String street, int number, int floor, String city){
        this.firstName=firstName;
        this.lastName=lastName;
        this.username = username;
        this.password = password;
        this.address= new Address(street, number, floor, city);  
    }
    
    public String getName(){
        return(firstName);
    }
    
    public String getLname(){
        return lastName;
    }
    
    public String getUsername(){
        return username;
    }
    
    public String getPassword(){
        return password;
    }
    public String getAddress(){
        return(address.street+" "+address.number+" "+address.floor+" "+address.city);
    }
    public String getStreet(){
        return(address.street);
    }
    public String getCity(){
        return(address.city);
    }
    public int getNumber(){
        return(address.number);
    }
    public int getFloor(){
        return(address.floor);
    }
    
    public void UpdateProfile(String firstName, String lastName, String username, String password, String street, int number, int floor, String city){
        this.firstName=firstName;
        this.lastName=lastName;
        this.username = username;
        this.password = password;
        this.address.Update(street, number, floor, city);
    }
}
