/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author khoirul-06990
 */
public class DB {
    
    public static Connection getKoneksi()
    {
        Connection con = null;
        String konString = "jdbc:mysql://localhost:3306/PboUas";
        String username = "root";
        String pass = "";
        try {
            con = (Connection) DriverManager.getConnection(konString, username, pass);
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
    
    public static Connection setKoneksi() {
        String konString = "jdbc:mysql://localhost:3306/PboUas";
        String username = "root";
        String pass = "";
        Connection koneksi = null;
        try {
        Class.forName("com.mysql.jdbc.Driver");
        koneksi = (Connection) DriverManager.getConnection(konString,username,pass);
        System.out.println("Koneksi Berhasil");
        } catch (ClassNotFoundException ex) {
        Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        System.out.println("Koneksi Gagal");
        } catch (SQLException ex) {
        Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        System.out.println("Koneksi Gagal");
        }
        return koneksi;
    }
    
    public static int execute(String SQL) {
        int status = 0;
        Connection koneksi = setKoneksi();
        try {
        Statement st = koneksi.createStatement();
        status = st.executeUpdate(SQL);
        } catch (SQLException ex) {
        Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }
}
