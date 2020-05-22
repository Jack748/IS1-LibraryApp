package model;

import model.RegisteredUser;
import model.BookCopy;
public class Order {
    RegisteredUser user;
    BookCopy copy;
    String state;
    Library library;
    
    Order(RegisteredUser user, BookCopy copy, String state){
        this.user = user;
        this.copy = copy;
        this.state = state;
    }
    
    public RegisteredUser getUser(){
        return user;
    }
    
    public BookCopy getCopy(){
        return copy;
    }
    
    public String getState(){
        return state;
    }
}
