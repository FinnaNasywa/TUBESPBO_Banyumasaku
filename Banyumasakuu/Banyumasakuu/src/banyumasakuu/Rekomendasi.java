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

public class Rekomendasi {
    private String idRekomendasi;
    private String idKuliner;
    private String informasiRekomendasi;
    private Date tanggalRekomendasi;

    public Rekomendasi(String idRekomendasi, String idKuliner, String informasiRekomendasi, Date tanggalRekomendasi) {
        this.idRekomendasi = idRekomendasi;
        this.idKuliner = idKuliner;
        this.informasiRekomendasi = informasiRekomendasi;
        this.tanggalRekomendasi = tanggalRekomendasi;
    }
}
