/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tampilan;

import banyumasakuu.Kuliner;
import database.KulinerDB;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author finnanasywa
 */
public class tampilanMain extends javax.swing.JFrame {

    private String username;

    /**
     * Creates new form Tampilan
     */
    public tampilanMain(String username) {
        this.username = username;
        initComponents();
        loadKuliner();
    }

    public tampilanMain() {

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        lblImage = new javax.swing.JLabel();
        lblJudul = new javax.swing.JLabel();
        btnSelengkapnya = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        daftarKuliner = new javax.swing.JPanel();

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(200, 200));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(130, 130));

        lblImage.setPreferredSize(new java.awt.Dimension(178, 108));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.add(jPanel5, java.awt.BorderLayout.PAGE_START);

        lblJudul.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblJudul.setForeground(new java.awt.Color(51, 51, 51));
        lblJudul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJudul.setText("Judul Makanan");
        jPanel4.add(lblJudul, java.awt.BorderLayout.CENTER);

        btnSelengkapnya.setBackground(new java.awt.Color(255, 255, 255));
        btnSelengkapnya.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSelengkapnya.setForeground(new java.awt.Color(255, 204, 51));
        btnSelengkapnya.setText("Selengkapnya");
        btnSelengkapnya.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnSelengkapnya.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel4.add(btnSelengkapnya, java.awt.BorderLayout.PAGE_END);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 386));

        jPanel2.setBackground(new java.awt.Color(255, 153, 51));
        jPanel2.setForeground(new java.awt.Color(255, 153, 51));

        jLabel1.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Banyumasku");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Username");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 51));
        jLabel2.setText("Daftar Kuliner");

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        daftarKuliner.setBackground(new java.awt.Color(255, 255, 255));
        daftarKuliner.setPreferredSize(new java.awt.Dimension(600, 512));
        daftarKuliner.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 20, 20));
        jScrollPane1.setViewportView(daftarKuliner);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createKuliner(Kuliner kuliner) {
        JPanel kulinerPanel = new JPanel();
        kulinerPanel.setBackground(new java.awt.Color(255, 255, 255));
        kulinerPanel.setPreferredSize(new java.awt.Dimension(200, 200));
        kulinerPanel.setLayout(new java.awt.BorderLayout());

        // Panel gambar
        JPanel imagePanel = new JPanel();
        imagePanel.setBackground(new java.awt.Color(204, 204, 204));
        imagePanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        imagePanel.setPreferredSize(new java.awt.Dimension(130, 130));

        JLabel lblImage = new JLabel();
        tampilGambar(kuliner.getFoto(), lblImage, 130, 130);
        imagePanel.add(lblImage);
        kulinerPanel.add(imagePanel, java.awt.BorderLayout.PAGE_START);

        // Label judul
        JLabel lblJudul = new JLabel();
        lblJudul.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblJudul.setForeground(new java.awt.Color(51, 51, 51));
        lblJudul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJudul.setText(kuliner.getNamaMakanan());
        kulinerPanel.add(lblJudul, java.awt.BorderLayout.CENTER);

        // Button Selengkapnya
        JButton btnSelengkapnya = new JButton();
        btnSelengkapnya.setBackground(new java.awt.Color(255, 255, 255));
        btnSelengkapnya.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSelengkapnya.setForeground(new java.awt.Color(255, 204, 51));
        btnSelengkapnya.setText("Selengkapnya");
        btnSelengkapnya.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnSelengkapnya.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSelengkapnya.addActionListener(e -> {
            // Buka DetailForm atau detail lainnya
            new tampilanUlasan(username, kuliner.getIdKuliner()).setVisible(true);
        });
        kulinerPanel.add(btnSelengkapnya, java.awt.BorderLayout.PAGE_END);
        daftarKuliner.add(kulinerPanel);
    }

    private void loadKuliner() {
        // Bersihkan panel utama sebelum memuat ulang data
        daftarKuliner.removeAll();

        // Membuat instance DAO_kuliner untuk mendapatkan data
        KulinerDB kulinerDB = new KulinerDB();

        // Memanggil fungsi showData dari DAO_kuliner
        List<Kuliner> kulinerList = kulinerDB.showKuliner();

        // Iterasi melalui daftar kuliner dan buat kartu untuk masing-masing
        for (Kuliner kuliner : kulinerList) {
            createKuliner(kuliner); // Fungsi untuk membuat kartu
        }

        // Refresh panel utama untuk menampilkan perubahan
        daftarKuliner.revalidate();
        daftarKuliner.repaint();
    }

    private void tampilGambar(String path, JLabel lblGambar, int labelWidth, int labelHeight) {
        File file = new File(path);

        // Validasi apakah file ada
        if (!file.exists()) {
            lblGambar.setIcon(null);
            lblGambar.setText("Gambar tidak ditemukan");
            return;
        }

        try {
            // Membaca file gambar dari path
            byte[] img = Files.readAllBytes(file.toPath());
            ImageIcon imageIcon = new ImageIcon(img);

            // Menghitung skala gambar agar sesuai dengan label
            int imageWidth = imageIcon.getIconWidth();
            int imageHeight = imageIcon.getIconHeight();

            double scaleX = (double) labelWidth / (double) imageWidth;
            double scaleY = (double) labelHeight / (double) imageHeight;
            double scale = Math.min(scaleX, scaleY);

            // Melakukan scaling pada gambar
            Image scaledImage = imageIcon.getImage().getScaledInstance((int) (scale * imageWidth), (int) (scale * imageHeight), Image.SCALE_SMOOTH);

            // Menampilkan gambar ke label
            lblGambar.setIcon(new ImageIcon(scaledImage));
            lblGambar.setText(""); // Hapus teks jika gambar berhasil ditampilkan
        } catch (IOException ex) {
            ex.printStackTrace();
            lblGambar.setIcon(null);
            lblGambar.setText("Gagal memuat gambar");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(tampilanMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tampilanMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tampilanMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tampilanMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tampilanMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSelengkapnya;
    private javax.swing.JPanel daftarKuliner;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblJudul;
    // End of variables declaration//GEN-END:variables
}
