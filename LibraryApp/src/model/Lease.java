/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.Date;



public class Lease {
    RegisteredUser user;
    BookCopy copy;
    Date startlease;
    Date endlease;
    String state;
    Library library;
    
    Lease(RegisteredUser user,BookCopy copy){
        this.user = user;
        this.copy = copy;
        this.startlease = new Date();
        state = "active";
    }
    
    public String getUsername(){
        return user.getUsername();
    }
    
    public String getTitle(){
        return copy.getTitle();
    }
    
    public Date getDate(){
        return startlease;
    }
    
    public String getState(){
        return state;
    }
}
