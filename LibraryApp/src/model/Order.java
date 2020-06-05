package model;

public class Order {
    RegisteredUser user;
    BookCopy copy;
    int n_queque;
    Library library;
    
    Order(RegisteredUser user, BookCopy copy, int queque){
        this.user = user;
        this.copy = copy;
        this.n_queque= queque;
    }
    
    public RegisteredUser getUser(){
        return user;
    }
    
    public BookCopy getCopy(){
        return copy;
    }
    
    public int getNumberQueque(){
        return n_queque;
    }
}
