package connect;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;


public class Connect {
    private Connection con;
    public Connection GetConnect(){
        String url = "jdbc:sqlserver://DESKTOP-4491OSN\\SQLEXPRESS:1433;"+"user=sa;password=tuan;databaseName=QuanLySinhVien;encrypt=false";
        try {
            con = DriverManager.getConnection(url);
            System.out.println("Connect successfull!");
            return con;
        } catch (SQLException e) {
            System.out.println("Error: "+ e);
        }
        return null;
    }
    public ResultSet GetSelect(String cmdSQL){
        GetConnect();
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(cmdSQL);
            return rs;
        } catch (SQLException e) {
            System.out.println("Error: "+ e);
        }
        return null;
    }
    
    public PreparedStatement Fix(String cmdSQL){
        GetConnect();
        try {
            PreparedStatement prestmt = con.prepareStatement(cmdSQL); 
            return prestmt;
        } catch (Exception e) {
            System.out.println("Error: "+ e);
        }
        return null;
    }
}