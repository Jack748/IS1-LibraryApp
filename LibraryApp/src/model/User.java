/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ludov
 */
public abstract class User {
    String firstName;
    String lastName;
    String username;
    String password;
    Address address;
    
    public String getName(){
        return firstName;
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
}
