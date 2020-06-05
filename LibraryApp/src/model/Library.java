package model;



import java.time.LocalDate;
import java.util.ArrayList;
/**
 *
 * @author ludov
 */
public class Library {
    public ArrayList<RegisteredUser> users;
    public RegisteredUser logged;
    public ArrayList<Librarian> librarians;
    public ArrayList<Book> books;
    public ArrayList<Lease> leases;
    public ArrayList<Order> orders;
    public Library(){
        users = new ArrayList<RegisteredUser>();
        librarians = new ArrayList<Librarian>();
        books = new ArrayList<Book>();
        leases = new ArrayList<Lease>();
        orders = new ArrayList<Order>();
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
    
    public void addOrder(RegisteredUser user,BookCopy book){
        
        int cnt = 0;
        int c;
        Order test;
        for(c=0;c< orders.size();c++){
            test = orders.get(c);
            if(test.getCopy().getId()== book.getId())
                cnt++;
        }    
        orders.add(new Order(user,book,cnt));
        
    }
    
    public void addBook(String title,String category,int year,String author,String condition,String format){
        int new_id;
        if(this.books.isEmpty())
            new_id =0;
        else
           new_id =((BookCopy)books.get(books.size() - 1)).id + 1;

        books.add(new BookCopy(title,category,year,author,condition,format,new_id));
    }
    
    public void addLease(RegisteredUser user, BookCopy copy,LocalDate start,LocalDate end){
        leases.add(new Lease(user,copy,start,end));       
    }
    
    public RegisteredUser findUser(String username){
        int c;
        RegisteredUser test;
        for(c=0;c< users.size();c++){
            test = users.get(c);
            if(test.getUsername().equals(username))
                return test;
        }
        return null;
    }
    
    public BookCopy findBook(int bookid){
        int c;
        BookCopy test;
        for(c=0;c< books.size();c++){
            test = (BookCopy) books.get(c);
            if(test.getId() == bookid)
                return test;
        }
        return null;
    }
    
    public ArrayList<Lease> MyLeases(RegisteredUser user){
       ArrayList<Lease> myleases = new ArrayList<Lease>();
       int c;
       Lease test;
       for(c=0;c<leases.size();c++){
            test = leases.get(c);
            if(test.user.getUsername().equals(user.getUsername())){
                myleases.add(test);
            }
        }
       return myleases;
    }
    
    public boolean BookAvaible(BookCopy copy){
        int c;
        Lease test;
        for(c=0;c<leases.size();c++){
            test = leases.get(c);
            if(test.getState().equals("active")&& test.getIdBook() == copy.getId() ){
                return false;
            }
        }
        return true;
    }
   
    
    
    
    
}

