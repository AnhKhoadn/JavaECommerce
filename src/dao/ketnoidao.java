package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ketnoidao {
    public Connection cn;
    public  void KetNoi(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            System.out.println("xong b1");
            String url="jdbc:sqlserver://BEN\\SQLEXPRESS:1433;databaseName=CD;user=sa;password=123";
            cn = DriverManager.getConnection(url);
            System.out.println("Connected");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        ketnoidao kn= new  ketnoidao();
        kn.KetNoi();
    }
}
