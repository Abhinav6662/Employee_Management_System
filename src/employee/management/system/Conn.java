package employee.management.system;

import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;

    public Conn () {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("Jdbc:mysql://localhost:3306/employeemanagementsystem", "root", "Abhishek184200");
            s = c.createStatement();
            System.out.println(" done_login....");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
