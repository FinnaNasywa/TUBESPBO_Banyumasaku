/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import banyumasakuu.Kuliner;
import banyumasakuu.ValidasiInputException;
import interfaces.KulinerInter;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class KulinerDB implements KulinerInter {

    @Override
    public void tambahKuliner(Kuliner kuliner) {
        String query = "INSERT INTO kuliner (Kategori, namaMakanan, asalDaerah, deskripsi, foto) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement st = conn.prepareStatement(query)) {
            st.setString(1, kuliner.getKategori());
            st.setString(2, kuliner.getNamaMakanan());
            st.setString(3, kuliner.getAsalDaerah());
            st.setString(4, kuliner.getDeskripsi());
            st.setString(5, kuliner.getFoto());

            st.executeUpdate();
            System.out.println("Data kuliner berhasil ditambahkan.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateKuliner(Kuliner kuliner, int kulinerId) {
        String query = "UPDATE kuliner \n"
                + "SET \n"
                + "    Kategori = ?, \n"
                + "    namaMakanan = ?, \n"
                + "    asalDaerah = ?, \n"
                + "    deskripsi = ?, \n"
                + "    foto = ? \n"
                + "WHERE idKuliner = ?";

        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement st = conn.prepareStatement(query)) {
            // Cek koneksi
            if (conn != null) {
                System.out.println("Koneksi berhasil.");
            }

            // Set parameter untuk query update
            st.setString(1, kuliner.getKategori());
            st.setString(2, kuliner.getNamaMakanan());
            st.setString(3, kuliner.getAsalDaerah());
            st.setString(4, kuliner.getDeskripsi());
            st.setString(5, kuliner.getFoto());
            st.setInt(6, kulinerId);

            // Eksekusi update dan cek jumlah baris yang terpengaruh
            int rowsUpdated = st.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Data kuliner berhasil diperbarui.");
            } else {
                System.out.println("Tidak ada data yang diperbarui. Pastikan ID kuliner valid.");
            }
        } catch (SQLException e) {
            System.out.println("SQL Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    @Override
    public void deleteKuliner(int kulinerId) {
        String query = "DELETE FROM kuliner WHERE idKuliner = ?";

        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement st = conn.prepareStatement(query)) {
            st.setInt(1, kulinerId);
            st.executeUpdate();
            System.out.println("Data kuliner berhasil dihapus.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Kuliner> showKuliner() {
        List<Kuliner> kulinerList = new ArrayList<>();
        String query = "SELECT * FROM kuliner";

        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement st = conn.prepareStatement(query)) {
            try (ResultSet rs = st.executeQuery()) {
                while (rs.next()) {
                    int idKuliner = rs.getInt("idKuliner");
                    String Kategori = rs.getString("Kategori");
                    String namaMakanan = rs.getString("namaMakanan");
                    String asalDaerah = rs.getString("asalDaerah");
                    String deskripsi = rs.getString("deskripsi");
                    String foto = rs.getString("foto");

                    Kuliner kuliner = new Kuliner(Kategori, namaMakanan, asalDaerah, deskripsi, foto);
                    kuliner.setIdKuliner(idKuliner);
                    kulinerList.add(kuliner);
                }
            } catch (ValidasiInputException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Error Validasi", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return kulinerList;
    }

    @Override
    public Kuliner showKulinerById(int idKuliner) {
        String query = "SELECT * FROM kuliner WHERE idKuliner = ?";
        Kuliner kuliner = null;

        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, idKuliner);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                kuliner = new Kuliner(
                        rs.getString("kategori"),
                        rs.getString("namaMakanan"),
                        rs.getString("asalDaerah"),
                        rs.getString("deskripsi"),
                        rs.getString("foto")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ValidasiInputException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        return kuliner;
    }

}
