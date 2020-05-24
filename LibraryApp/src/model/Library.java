package model;


import java.util.ArrayList;
/**
 *
 * @author ludov
 */
public class Library {
    public ArrayList<RegisteredUser> users;
    public ArrayList<Librarian> librarians;
    public ArrayList<Book> books;
    public ArrayList<Lease> leases;
    public Library(){
        users = new ArrayList<RegisteredUser>();
        librarians = new ArrayList<Librarian>();
        books = new ArrayList<Book>();
        leases = new ArrayList<Lease>(); 
    }
    
    public void addRegUser(String fname, String lname, String username, String password, String street, int number, int floor, String city){
        users.add(new RegisteredUser(fname, lname, username, password, street, number, floor, city));
    }
    
    public void addLibrarian(String fname, String lname, String username, String password, String street, int number, int floor, String city){
        int new_id;
        if(this.librarians.isEmpty())
            new_id =0;
        else
           new_id = librarians.get(librarians.size() - 1).id + 1;

        librarians.add(new Librarian(fname, lname, username, password, street, number, floor, city, new_id));
    }
    public void addBook(String title,String category,int year,String author,String condition,String format){
        int new_id;
        if(this.books.isEmpty())
            new_id =0;
        else
           new_id =((BookCopy)books.get(books.size() - 1)).id + 1;

        books.add(new BookCopy(title,category,year,author,condition,format,new_id));
    }
    
    public void addLease(RegisteredUser user, BookCopy copy){
        leases.add(new Lease(user,copy));
        System.out.println(leases.get(0));
    }
   
    
    
    
    
}

