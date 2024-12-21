/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banyumasakuu;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ACER
 */
public class Admin extends User {

    public Admin(String username, String fullName, String email, String password, String role) throws ValidasiInputException {
        super(username, fullName, email, password, "admin");
    }
}
