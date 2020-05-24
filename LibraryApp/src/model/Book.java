
package model;

/**
 *
 * @author ludov
 */
public abstract class Book {
    String title;
    String category;
    int year;
    String author;
    
    public void setTitle(String title){
        this.title = title;
    }
    
    public void setCategory(String category){
        this.category = category;
    }
    
    public void setYear(int year){
        this.year= year;
    }
    
    public void setAuthor(String author){
        this.author = author;
    }
    
    public String getTitle(){
        return title;
    }
    
    public String getCategory(){
        return category;
    }
    
    public int getYear(){
        return year;
    }
    
    public String getAuthor(){
        return author;
    }
    

}
