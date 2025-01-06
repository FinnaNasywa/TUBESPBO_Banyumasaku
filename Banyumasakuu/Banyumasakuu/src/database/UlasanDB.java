/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import banyumasakuu.Ulasan;
import banyumasakuu.ValidasiInputException;
import interfaces.UlasanInter;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class UlasanDB implements UlasanInter {
// Menambahkan ulasan baru ke database

    @Override
    public void addUlasan(Ulasan ulasan) {
        String query = "INSERT INTO ulasan (user, idKuliner, isiUlasan, tanggalUlasan) VALUES (?, ?, ?, ?)";

        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, ulasan.getUser());
            stmt.setInt(2, ulasan.getKuliner());
            stmt.setString(3, ulasan.getIsiUlasan());
            stmt.setDate(4, new java.sql.Date(ulasan.getTanggal().getTime())); // Mengonversi java.util.Date ke java.sql.Date

            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Ulasan berhasil ditambahkan.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Menampilkan daftar ulasan berdasarkan ID kuliner
    @Override
    public List<Ulasan> showUlasan(int idKuliner) {
        List<Ulasan> ulasanList = new ArrayList<>();
        String query = "SELECT * FROM ulasan WHERE idKuliner = ?";

        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, idKuliner);

            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    String user = rs.getString("user");
                    String isiUlasan = rs.getString("isiUlasan");
                    Date tanggalUlasan = rs.getDate("tanggalUlasan");

                    Ulasan ulasan = new Ulasan(user, idKuliner, isiUlasan, tanggalUlasan);
                    ulasanList.add(ulasan);
                }
            } catch (ValidasiInputException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return ulasanList;
    }
}
