/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryapp;
import gui.LoginFrame;
import model.Library;
import file.LibraryFile;
/**
 *
 * @author ludov
 */
public class LibraryApp {
    Library library;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Library library =new Library();
        
        LoginFrame loginFrame =new LoginFrame();
        loginFrame.setVisible(true);
        loginFrame.library = library;
        
        LibraryFile file=new LibraryFile();
        loginFrame.file=file;
    }
    
}
