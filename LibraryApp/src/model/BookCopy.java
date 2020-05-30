/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import model.Book;
/**
 *
 * @author ludov
 */
public class BookCopy extends Book{
    int id;
    String condition;
    String format;
    
    BookCopy(String title,String category,int year,String author,String condition,String format,int id){
        this.title = title;
        this.category = title;
        this.year = year;
        this.author =author;
        this.condition = condition;
        this.format = format;
        this.id = id;
    }
    
    public String getFormat(){
        return format;
    }
    public String getCondition(){
        return condition;
    }
    
    public int getId(){
        return id;
    }
            
}
