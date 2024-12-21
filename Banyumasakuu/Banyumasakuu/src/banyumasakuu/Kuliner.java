/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banyumasakuu;

/**
 *
 * @author ACER
 */
public class Kuliner {
    private String idKuliner;
    private String idKategori;
    private String namaMakanan;
    private String asalDaerah;
    private String deskripsi;
    private String foto;
    private int totalFavorit;

    public Kuliner(String idKuliner, String idKategori, String namaMakanan, String asalDaerah, String deskripsi, String foto) {
        this.idKuliner = idKuliner;
        this.idKategori = idKategori;
        this.namaMakanan = namaMakanan;
        this.asalDaerah = asalDaerah;
        this.deskripsi = deskripsi;
        this.foto = foto;
        this.totalFavorit = 0;
    }

    public String getNamaMakanan() {
        return namaMakanan;
    }

    public int getTotalFavorit() {
        return totalFavorit;
    }

    public void incrementFavorit() {
        totalFavorit++;
    }
    
    public String getDeskripsi() {
        return deskripsi;
    }
}