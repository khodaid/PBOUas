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
    private String username, password, nama, alamat;

    public User(String username, String password, String nama, String alamat) {
        this.username = username;
        this.password = password;
        this.nama = nama;
        this.alamat = alamat;
        Insert(username, password, nama, alamat);
    }
    
    public User()
    {
        
    }
    
    public static String Insert(String username, String Password, String nama, String alamat)
    {
        return "INSERT INTO Users(id, username, password, nama, alamat, reg_date)"+
                " VALUES ("+null+",'"+username+"','"+Password+"','"+nama+"','"+alamat+"',"+null+")";
    }
    
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    
}

//" VALUES ("+null+",'"+pesan.getNama()+"','"+pesan.getNamaBarang()+"','"+pesan.getJumlahBarang()+"','"+pesan.getAlamatPemesanan()+"','"+pesan.getHargaTotal()+"','"+status+"')";
