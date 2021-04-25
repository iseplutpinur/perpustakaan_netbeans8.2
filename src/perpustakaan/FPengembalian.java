/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan;

import com.mysql.jdbc.Connection;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.Period;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Isepl
 */
public class FPengembalian extends javax.swing.JFrame {
    Connection con;
    Statement st;
    ResultSet rs;
    
    String[] id_peminjaman = new String[11];
    String[] id_peminjaman_detail = new String[11];
    String[] id_buku = new String[11];
    String[] judul_buku = new String[11];
    String[] npm = new String[11];
    String[] nama = new String[11];
    String[] tenggat_pinjam = new String[11];
   
    int[] denda = new int[11];
    int index = 0 ;
    /**
     * Creates new form FPengembalian
     */
    public FPengembalian() {
        initComponents();
//        System.out.println(LocalDate.now());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        tfKeyword = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHasilCari = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbNoBuku = new javax.swing.JLabel();
        lbJudulBuku = new javax.swing.JLabel();
        lbNoPem = new javax.swing.JLabel();
        lbNoPemBuk = new javax.swing.JLabel();
        lbNpm = new javax.swing.JLabel();
        lbNama = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbDenda2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbTenggat = new javax.swing.JLabel();
        lbDenda = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("FORM PENGEMBALIAN BUKU");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Form Peminjaman Buku");

        jButton1.setText("Kembali");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cari data peminjaman"));

        jButton2.setText("Cari");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Reset");

        tblHasilCari.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No Pinjam", "Nomor Buku", "Judul Buku", "NPM", "Nama"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblHasilCari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHasilCariMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblHasilCari);

        jLabel10.setText("*Pencarian berdasarkan Nama mahasiswa, NPM, No Buku, Judul buku, No peminjaman DLL.");

        jLabel11.setText("*Pencarian dibatasi 10 baris");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(tfKeyword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addGap(1, 1, 1))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfKeyword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Detail Pengembalian"));

        jLabel2.setText("Nomor peminjaman");

        jLabel3.setText("Nomor peminjaman buku");

        jLabel4.setText("NPM peminjam");

        jLabel5.setText("Nama peminjam");

        jLabel6.setText("Nomor Buku");

        jLabel7.setText("Judul buku");

        lbNoBuku.setText(":");

        lbJudulBuku.setText(":");

        lbNoPem.setText(":");

        lbNoPemBuk.setText(":");

        lbNpm.setText(":");

        lbNama.setText(":");

        jLabel8.setText("Denda");

        lbDenda2.setText(":");

        jLabel9.setText("Tenggat peminjaman");

        lbTenggat.setText(":");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNoBuku)
                    .addComponent(lbJudulBuku)
                    .addComponent(lbTenggat)
                    .addComponent(lbNoPem)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbDenda2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbDenda))
                    .addComponent(lbNoPemBuk)
                    .addComponent(lbNpm)
                    .addComponent(lbNama))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lbNoPem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbNoPemBuk)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbNpm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbNama)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbNoBuku)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbJudulBuku)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbTenggat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDenda2)
                    .addComponent(lbDenda)))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8))
        );

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setText("Simpan Pengembalian");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 1, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FMenuUtama pustakawan = new FMenuUtama();
        pustakawan.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String keyw = tfKeyword.getText();
        String sql = "SELECT a.id as id_peminjaman_detail, b.id as id_peminjaman, d.nama, d.npm, c.judul_buku, a.tenggat_pinjam, c.id_buku " +
                    "FROM peminjaman_detail as a " +
                    "LEFT JOIN peminjaman as b ON a.id_peminjaman = b.id " +
                    "LEFT JOIN buku as c ON a.id_buku = c.id_buku " +
                    "LEFT JOIN mahasiswa as d ON b.npm = d.npm " +
                    "WHERE  " +
                    "(a.status = 'Dipinjam')  " +
                    "and " +
                    "((a.id LIKE '%"+keyw+"%') OR " +
                    "(a.npm LIKE '%"+keyw+"%') OR " +
                    "(a.id_buku LIKE '%"+keyw+"%') OR " +
                    "(c.judul_buku LIKE '%"+keyw+"%') OR " +
                    "(c.pengarang LIKE '%"+keyw+"%') OR " +
                    "(c.penerbit LIKE '%"+keyw+"%') OR " +
                    "(d.nama LIKE '%"+keyw+"%')) LIMIT 10";
        
        try{
            con = Koneksi.getKoneksi();
            st = con.createStatement();
            rs = st.executeQuery(sql);
            DefaultTableModel model = (DefaultTableModel) tblHasilCari.getModel();
            model.setRowCount(0);
            int i = 0;
            while(rs.next()){
                Object[] row = new Object[13];
                row[0] = rs.getString("id_peminjaman_detail");
                row[1] = rs.getString("id_buku");
                row[2] = rs.getString("judul_buku");
                row[3] = rs.getString("npm");
                row[4] = rs.getString("nama");
                model.addRow(row);
                id_peminjaman[i] = rs.getString("id_peminjaman");
                id_peminjaman_detail[i] = rs.getString("id_peminjaman_detail");
                id_buku[i] = rs.getString("id_buku");
                nama[i] = rs.getString("nama");
                npm[i] = rs.getString("npm");
                tenggat_pinjam[i] = rs.getString("tenggat_pinjam");
                judul_buku[i] = rs.getString("judul_buku");
                denda[i] = hitungTenggat(rs.getString("tenggat_pinjam")) * 1000;
                i++;
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tblHasilCariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHasilCariMouseClicked
        int row = tblHasilCari.rowAtPoint(evt.getPoint());
        cariIndex((String) tblHasilCari.getValueAt(row,0));
        
    }//GEN-LAST:event_tblHasilCariMouseClicked
    
    private void cariIndex(String no_pinjam){
        for (int i = 0; i < id_peminjaman_detail.length; i++) {
            if (id_peminjaman_detail[i] != null) {
                if (id_peminjaman_detail[i].equals(no_pinjam)){
                    Integer dendaa = denda[i];
                    if(dendaa > 0 ){
                        lbDenda.setForeground(Color.RED);
                    }else{
                        lbDenda.setForeground(Color.BLACK);
                    }
                    String strdenda = dendaa.toString();
                    lbDenda.setText("Rp." + strdenda);
                    lbJudulBuku.setText(": " + judul_buku[i]);
                    lbNama.setText(": " + nama[i]);
                    lbNoPemBuk.setText(": " + id_peminjaman_detail[i]);
                    lbNoPem.setText(": " + id_peminjaman[i]);
                    lbNoPem.setText(": " + id_peminjaman[i]);
                    lbJudulBuku.setText(": " + judul_buku[i]);
                    lbTenggat.setText(": " + tenggat_pinjam[i]);
                    lbNoBuku.setText(": " + id_buku[i]);
                    lbNpm.setText(": " + npm[i]);
                    index = i;
                }                
            }
        }
    }
    
    private int hitungTenggat(String tanggal){
        // tanggal 1
        // dibuat ke localedate
        LocalDate tanggal1 = LocalDate.of(
                Integer.parseInt(tanggal.split("-")[0]),
                Integer.parseInt(tanggal.split("-")[1]),
                Integer.parseInt(tanggal.split("-")[2])
        );

        // tanggal 2
        LocalDate tanggal2 = LocalDate.now();
        Period periode = Period.between(tanggal1, tanggal2);
        int denda = (periode.getYears() * 356) + (periode.getMonths() * 30) + periode.getDays();
        return denda < 0 ? 0 : denda;
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
            java.util.logging.Logger.getLogger(FPengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FPengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FPengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FPengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FPengembalian().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbDenda;
    private javax.swing.JLabel lbDenda2;
    private javax.swing.JLabel lbJudulBuku;
    private javax.swing.JLabel lbNama;
    private javax.swing.JLabel lbNoBuku;
    private javax.swing.JLabel lbNoPem;
    private javax.swing.JLabel lbNoPemBuk;
    private javax.swing.JLabel lbNpm;
    private javax.swing.JLabel lbTenggat;
    private javax.swing.JTable tblHasilCari;
    private javax.swing.JTextField tfKeyword;
    // End of variables declaration//GEN-END:variables

    private String toString(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
