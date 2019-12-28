/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import java.util.*;
import tugasuaspbo.User;
import DB.Users;
/**
 *
 * @author khoirul-06990
 */
public class UserController {
    public static ArrayList<User> user = new ArrayList<User>();
    
    public static void Insert(String username, String pass, String nama, String alamat)
    {
//        user.add(new User(username,pass,nama,alamat));
        Users.Insert(User.Insert(username, pass, nama, alamat));
    }
    
    public static void Update(String username, String pass)
    {
        for (int i = 0; i<user.size(); i++)
        {
            if(user.get(i).getUsername().equals(username) && user.get(i).getPassword().equals(pass))
            {
                Users.Update(username, pass);
                break;
            }
        }
    }
    
    public static void Delete (String username, String pass)
    {
        for (int i = 0; i<user.size(); i++)
        {
            if(user.get(i).getUsername().equals(username) && user.get(i).getPassword().equals(pass))
            {
                Users.Delete(username, pass);
                break;
            }
        }
    }  
}
