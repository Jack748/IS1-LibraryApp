package file;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import model.Library;
import model.RegisteredUser;
import model.Librarian;
import model.BookCopy;
/**
 *
 * @author ludov
 */
public class LibraryFile {
    String users_dir ="users.text";
    String librarians_dir ="librarians.text";
    
    public void saveUsers(Library library){
                int i;
                FileWriter file_new = null;
	        PrintWriter pw = null;
	        try
	        {
	            file_new = new FileWriter("users.txt");
	            pw = new PrintWriter(file_new);
	            int c;
                    pw.write(library.users.size()+"\n");
                    RegisteredUser reg_user;

                    for(c=0;c<library.users.size();c++){
                        reg_user =(RegisteredUser) library.users.get(c);  
                        pw.write(reg_user.getName()+" "+reg_user.getUsername()+" "+reg_user.getPassword()+" "+reg_user.getStreet()+" "+reg_user.getNumber()+" "+reg_user.getFloor()+" "+reg_user.getCity()+"\n");    	
	            }
	            
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	           try {
	           if (null != file_new)
	              file_new.close();
	           } catch (Exception e2) {
	              e2.printStackTrace();
	           }
	        }
    }
    
    public void saveBooks(Library library){
                int i;
                FileWriter file_new = null;
	        PrintWriter pw = null;
	        try
	        {
	            file_new = new FileWriter("books.txt");
	            pw = new PrintWriter(file_new);
	            int c;
                    pw.write(library.books.size()+"\n");
                    BookCopy book;

                    for(c=0;c<library.books.size();c++){
                        book =(BookCopy) library.books.get(c);  
                        pw.write(book.getTitle()+ " " +book.getCategory() +" "+ book.getYear()+" "+book.getAuthor()+" "+
                                book.getCondition()+" "+ book.getFormat()+"\n");
                    }
	            
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	           try {
	           if (null != file_new)
	              file_new.close();
	           } catch (Exception e2) {
	              e2.printStackTrace();
	           }
	        }
    }
    
    public void LoadBooks(Library library){
        library.books.clear();
            try{
                Scanner s=new Scanner(new File("books.txt"));
                int i, k, c, n=s.nextInt();
                for(i=0;i<n;i++){
                        library.addBook(s.next(), s.next(),Integer.parseInt(s.next()), s.next(),s.next(),s.next());                  
                }
                
                
            }catch(Exception e){
                e.printStackTrace();
            }
    }
    
    
    public void saveLibrarians(Library library){
                int i;
                FileWriter file_new = null;
	        PrintWriter pw = null;
	        try
	        {
	            file_new = new FileWriter("librarians.txt");
	            pw = new PrintWriter(file_new);
	            int c;
                    pw.write(library.librarians.size()+"\n");
                    Librarian lib;

                    for(c=0;c<library.librarians.size();c++){
                        lib =(Librarian) library.librarians.get(c);  
                        pw.write(lib.getName()+" "+lib.getUsername()+" "+lib.getPassword()+" "+lib.getStreet()+" "+lib.getNumber()+" "+lib.getFloor()+" "+lib.getCity()+"\n");    	
	            }
	            
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	           try {
	           if (null != file_new)
	              file_new.close();
	           } catch (Exception e2) {
	              e2.printStackTrace();
	           }
	        }
    }
    
    public void loadFromFile(Library library){
            library.users.clear();
            try{
                Scanner s=new Scanner(new File("Library.text"));
                int i, k, c, n=s.nextInt();
                for(i=0;i<n;i++){
                    c=s.nextInt();
                        library.addRegUser(s.next(), s.next(), s.next(), s.next(),s.next(),Integer.parseInt(s.next()),Integer.parseInt(s.next()),s.next());                  
                }
                
                
            }catch(Exception e){
                e.printStackTrace();
            }
    }
    
    public boolean loginUser(Library library,String username, String password){
            try{
                Library check = new Library();
                Scanner s=new Scanner(new File("users.txt"));
                int i, k, c, n=s.nextInt();
                for(i=0;i<n;i++){
                    check.addRegUser(s.next(), s.next(), s.next(), s.next(),s.next(),Integer.parseInt(s.next()),Integer.parseInt(s.next()),s.next());                  
                }
                for(RegisteredUser test :check.users ){
                    System.out.println(test.getUsername()+" "+test.getPassword());
                    if(test.getUsername().equals(username) && test.getPassword().equals(password)){
                        library.users.add(test);
                        return true;
                    }
                }
                return false;                
                
            }catch(Exception e){
                e.printStackTrace();
            }
            return false;
    }
    
    public boolean loginLibrarian(Library library,String username, String password){
            try{
                Library prova = new Library();
                Scanner s=new Scanner(new File("librarians.txt"));
                int i, k, c, n=s.nextInt();
                for(i=0;i<n;i++){
                    prova.addLibrarian(s.next(), s.next(), s.next(), s.next(),s.next(),Integer.parseInt(s.next()),Integer.parseInt(s.next()),s.next());                  
                }
                System.out.println(prova.librarians);
                for(Librarian test :prova.librarians ){
                    System.out.println(test.getName()+" "+test.getPassword());
                    if(test.getUsername().equals(username) && test.getPassword().equals(password)){
                        library.librarians.add(test);
                        return true;
                    }
                }
                return false;                
                
            }catch(Exception e){
                e.printStackTrace();
            }
            return false;
    }
    
}
