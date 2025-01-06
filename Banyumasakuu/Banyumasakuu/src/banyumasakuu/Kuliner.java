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

    private int idKuliner;
    private String Kategori;
    private String namaMakanan;
    private String asalDaerah;
    private String deskripsi;
    private String foto;

    // Konstruktor dengan validasi input
    public Kuliner(String Kategori, String namaMakanan, String asalDaerah, String deskripsi, String foto) throws ValidasiInputException {
        if (Kategori == null || Kategori.isEmpty()) {
            throw new ValidasiInputException("ID Kategori tidak boleh kosong");
        }
        if (namaMakanan == null || namaMakanan.isEmpty()) {
            throw new ValidasiInputException("Nama Makanan tidak boleh kosong");
        }
        if (asalDaerah == null || asalDaerah.isEmpty()) {
            throw new ValidasiInputException("Asal Daerah tidak boleh kosong");
        }
        if (deskripsi == null || deskripsi.isEmpty()) {
            throw new ValidasiInputException("Deskripsi tidak boleh kosong");
        }
        if (foto == null || foto.isEmpty()) {
            throw new ValidasiInputException("Foto tidak boleh kosong");
        }

        this.Kategori = Kategori;
        this.namaMakanan = namaMakanan;
        this.asalDaerah = asalDaerah;
        this.deskripsi = deskripsi;
        this.foto = foto;
    }

    // Getter untuk semua atribut
    public int getIdKuliner() {
        return idKuliner;
    }

    public void setIdKuliner(int idKuliner) {
        this.idKuliner = idKuliner;
    }

    public String getKategori() {
        return Kategori;
    }

    public String getNamaMakanan() {
        return namaMakanan;
    }

    public String getAsalDaerah() {
        return asalDaerah;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public String getFoto() {
        return foto;
    }
}
