package model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Ludo
 */
public class Address {
    String street;
    int number;
    int floor; 
    String city;
    
    Address(String street, int number, int floor, String city){
        this.street=street;
        this.number=number;
        this.floor=floor;
        this.city=city;
    }
    
    public void Update(String street, int number, int floor, String city){
        this.street=street;
        this.number=number;
        this.floor=floor;
        this.city=city;
    }
    
}
