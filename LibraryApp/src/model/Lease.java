/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.Date;
import java.time.LocalDate;
import java.time.ZoneId;




public class Lease {
    RegisteredUser user;
    BookCopy copy;
    LocalDate startlease;
    LocalDate endlease;
    String state;
    Library library;
    
    Lease(RegisteredUser user,BookCopy copy,LocalDate start,LocalDate end){
        this.user = user;
        this.copy = copy;
        if(start == null)
            this.startlease = LocalDate.now();
        if(end == null)
            this.endlease = null;
        this.state = "active";
    }
    
    public String getUsername(){
        return user.getUsername();
    }
    
    public int getIdBook(){
        return copy.getId();
    }
    
    public LocalDate getDate(){
        return startlease;
    }
    
    public String getState(){
        return state;
    }
}
