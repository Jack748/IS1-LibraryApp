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
public class Librarian {
    String firstName;
    String lastName;
    String username;
    String password;
    int id;
    Address address;
    
    Librarian(String firstName, String lastName, String username, String password, String street, int number, int floor, String city, int id){
        this.firstName=firstName;
        this.lastName=lastName;
        this.username = username;
        this.password = password;
        this.id = id;
        this.address=new Address(street, number, floor, city);  
    }
    
    public String getName(){
        return(firstName+" "+lastName);
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
}
