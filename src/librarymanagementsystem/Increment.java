package librarymanagementsystem;

import java.sql.*;
import javax.swing.JOptionPane;

public class Increment {
    
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public int signUpIncrement(){
        int id = 1;
        con = JavaConnect.ConnecrDb();
        try{
            pst = con.prepareStatement("select max(user_id) from librarian");
            rs = pst.executeQuery();
            while(rs.next()){
                id = rs.getInt(1)+1; 
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        finally{
            try{
                pst.close();
                con.close();
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
            } 
        }
        return id;   
    }
    
    public int BookIncrement(){
        int id = 1;
        con = JavaConnect.ConnecrDb();
        try{
            pst = con.prepareStatement("select max(book_id) from book");
            rs = pst.executeQuery();
            while(rs.next()){
                id = rs.getInt(1)+1; 
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        finally{
            try{
                pst.close();
                con.close();
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
            } 
        }
        return id;   
    }
    
    public int StudentIncrement(){
        int id = 1;
        con = JavaConnect.ConnecrDb();
        try{
            pst = con.prepareStatement("select max(student_id) from student");
            rs = pst.executeQuery();
            while(rs.next()){
                id = rs.getInt(1)+1; 
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        finally{
            try{
                pst.close();
                con.close();
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
            } 
        }
        return id;   
    }
   
    public int IssueBookIncrement(){
        int id = 1;
        con = JavaConnect.ConnecrDb();
        try{
            pst = con.prepareStatement("select max(issue_id) from issue_book");
            rs = pst.executeQuery();
            while(rs.next()){
                id = rs.getInt(1)+1; 
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        finally{
            try{
                pst.close();
                con.close();
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
            } 
        }
        return id;   
    }
    
    public int ReturnBookIncrement(){
        int id = 1;
        con = JavaConnect.ConnecrDb();
        try{
            pst = con.prepareStatement("select max(return_id) from return_book");
            rs = pst.executeQuery();
            while(rs.next()){
                id = rs.getInt(1)+1; 
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        finally{
            try{
                pst.close();
                con.close();
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
            } 
        }
        return id;   
    }
}
