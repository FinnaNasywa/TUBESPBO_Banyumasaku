/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banyumasakuu;

import java.util.Date;
/**
 *
 * @author ACER
 */
public class Favorite {
    private String idFavorite;
    private String idUser;
    private String idKuliner;
    private Date tanggalFavorite;

    public Favorite(String idFavorite, String idUser, String idKuliner, Date tanggalFavorite) {
        this.idFavorite = idFavorite;
        this.idUser = idUser;
        this.idKuliner = idKuliner;
        this.tanggalFavorite = tanggalFavorite;
    }

    public String getIdKuliner() {
        return idKuliner;
    }
}
