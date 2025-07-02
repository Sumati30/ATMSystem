package ATMSystem;

import java.sql.*;  

public class Conn implements AutoCloseable{
    Connection con;
    Statement stmt;
    
    public Conn() throws SQLException {
    	//Class.forName("com.mysql.cj.jdbc.Driver"); 
        con = DriverManager.getConnection("jdbc:mysql:///atmsystem","root","Sumati@mysql");
        stmt = con.createStatement();
    } 
    
    @Override
    public void close() throws SQLException {
        if (stmt != null) stmt.close();
        if (con != null) con.close();
    }
//    public Conn(){  
//        try{  
//            Class.forName("com.mysql.cj.jdbc.Driver");  
//            con =DriverManager.getConnection("jdbc:mysql:///atmsystem","root","root");    
//            stmt =con.createStatement(); 
//               
//        }catch(Exception e){ 
//            System.out.println(e);
//        }  
//    }  
}  
