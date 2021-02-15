package librarymanagementsystem;

import java.sql.*;
import javax.swing.JOptionPane;

public class JavaConnect {
    public static Connection con = null;
    
    public static Connection ConnecrDb(){
        try{
             Class.forName("com.mysql.jdbc.Driver");
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_management_system","root","");
             return con;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
        catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
