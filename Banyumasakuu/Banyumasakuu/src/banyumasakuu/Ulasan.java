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
import java.util.Date;

public class Ulasan {
    private String idUlasan;
    private String idUser;
    private String idKuliner;
    private String isiUlasan;
    private int rating;
    private Date tanggalUlasan;

    public Ulasan(String idUlasan, String idUser, String idKuliner, String isiUlasan, int rating, Date tanggalUlasan) {
        this.idUlasan = idUlasan;
        this.idUser = idUser;
        this.idKuliner = idKuliner;
        this.isiUlasan = isiUlasan;
        this.rating = rating;
        this.tanggalUlasan = tanggalUlasan;
    }

    public String getIsiUlasan() {
        return isiUlasan;
    }

    public int getRating() {
        return rating;
    }
}
