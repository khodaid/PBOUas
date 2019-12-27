/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasuaspbo;
/**
 *
 * @author khoirul-06990
 */
public class User {
    private String username, password, email;

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
        Insert(username, password, email);
    }
    
    public User()
    {
        
    }
    
    public static String Insert(String username, String Password, String email)
    {
        return "VALUE("+null+","+username+","+Password+","+email+","+null+")";
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    
}

//" VALUES ("+null+",'"+pesan.getNama()+"','"+pesan.getNamaBarang()+"','"+pesan.getJumlahBarang()+"','"+pesan.getAlamatPemesanan()+"','"+pesan.getHargaTotal()+"','"+status+"')";
