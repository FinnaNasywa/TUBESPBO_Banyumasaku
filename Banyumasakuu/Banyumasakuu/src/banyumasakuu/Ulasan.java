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
    private String user;
    private int idKuliner;
    private String isiUlasan;
    private Date tanggalUlasan;

    public Ulasan(String user, int idKuliner, String isiUlasan, Date tanggalUlasan) throws ValidasiInputException {
        if (isiUlasan == null || isiUlasan.isEmpty()) {
            throw new ValidasiInputException("isiUlasan tidak boleh kosong");
        }
        this.user = user;
        this.idKuliner = idKuliner;
        this.isiUlasan = isiUlasan;
        this.tanggalUlasan = tanggalUlasan;
    }

    public String getIsiUlasan() {
        return isiUlasan;
    }

    public String getUser() {
        return user;
    }

    public int getKuliner() {
        return idKuliner;
    }

    public String getUlasan() {
        return isiUlasan;
    }

    public Date getTanggal() {
        return tanggalUlasan;
    }
}
