/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banyumasakuu;

/**
 *
 * @author ACER
 */
import java.util.ArrayList;
import java.util.List;

public class User {

    private String username;
    private String fullName;
    private String email;
    private String password;
    private String role;
    private List<Ulasan> ulasanList;
    private List<Favorite> favoriteList;

    public User(String fullName, String email, String username, String password, String role) throws ValidasiInputException {
        if (username == null || username.isEmpty()) {
            throw new ValidasiInputException("Username tidak boleh kosong!");
        }
        if (password == null || password.isEmpty()) {
            throw new ValidasiInputException("Password tidak boleh kosong!");
        }
        this.username = username;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void addUlasan(Ulasan ulasan) {
        ulasanList.add(ulasan);
    }

    public List<Ulasan> getUlasanList() {
        return ulasanList;
    }

    public void addFavorite(Favorite favorite) {
        favoriteList.add(favorite);
    }

    public List<Favorite> getFavoriteList() {
        return favoriteList;
    }

    public String getNama() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getEmail() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
