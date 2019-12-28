/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

/**
 *
 * @author khoirul-06990
 */
public class Users{
    
    public static int Insert(String sql)
    {
        int con = DB.execute(sql);
        return con;
    }
    
    // hapus user dengan menentukan kesamaan dari username, password dari database dengan inputan username, password
    public static int Delete(String username, String password)
    {
        String delete  = "DELETE FROM Users WHERE username == '"+username+"' AND password == '"+password+"'";
        int con = DB.execute(delete);
        return con;
    }
    
    //mengubah username dengan menentukan kesamaan passworda dari database dengan inputan password
    public static int Update(String username, String pass)
    {
        String Update = "UPDATE Users SET username = '"+username+"' WHERE password == '"+pass+"'";
        int con = DB.execute(Update);
        return con;
    }
}
