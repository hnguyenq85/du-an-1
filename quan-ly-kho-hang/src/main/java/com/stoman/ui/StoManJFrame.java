/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stoman.ui;

import com.stoman.utils.XNumber;
import java.awt.Color;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Huy
 */
public class StoManJFrame extends javax.swing.JFrame {

    /**
     * Creates new form StoManJFrame
     */
    public StoManJFrame() {
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        toolBar = new javax.swing.JToolBar();
        btnDangXuat = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        separator1 = new javax.swing.JToolBar.Separator();
        btnNhapXuat = new javax.swing.JButton();
        btnKiemKho = new javax.swing.JButton();
        btnDoiTac = new javax.swing.JButton();
        separator2 = new javax.swing.JToolBar.Separator();
        cboThongTin = new javax.swing.JButton();
        btnHuongDan = new javax.swing.JButton();
        tabs = new javax.swing.JTabbedPane();
        pnlTongQuan = new javax.swing.JPanel();
        pnlBieuDo = new javax.swing.JPanel();
        pnlThongTin = new javax.swing.JPanel();
        pnlLuongNhap = new javax.swing.JPanel();
        lblLuongNhap = new javax.swing.JLabel();
        lblSoLuongNhap = new javax.swing.JLabel();
        pnlLuongXuat = new javax.swing.JPanel();
        lblLuongXuat = new javax.swing.JLabel();
        lblSoLuongXuat = new javax.swing.JLabel();
        pnlLuongTonKho = new javax.swing.JPanel();
        lblTonKho = new javax.swing.JLabel();
        lblSoLuongTK = new javax.swing.JLabel();
        pnlTonKho = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cboLoaiHang = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHangTonKho = new javax.swing.JTable();
        pnlXuatTheoQuy = new javax.swing.JPanel();
        pnlNhapTheoQuy = new javax.swing.JPanel();
        pnlCanCanXuatNhap = new javax.swing.JPanel();
        pnlTrangThai = new javax.swing.JPanel();
        lblTrangThai = new javax.swing.JLabel();
        btnDongHo = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        mnuHeThong = new javax.swing.JMenu();
        mniDangNhap = new javax.swing.JMenuItem();
        mniDangXuat = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        mniDoiMK = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        mniThoat = new javax.swing.JMenuItem();
        mnuQuanLy = new javax.swing.JMenu();
        mniHangHoa = new javax.swing.JMenuItem();
        mniDoiTac = new javax.swing.JMenuItem();
        mniKho = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        mniPhieuNhapXuat = new javax.swing.JMenuItem();
        mniPhieuKiemKho = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        mniNhanVien = new javax.swing.JMenuItem();
        mnuTroGiup = new javax.swing.JMenu();
        mniHuongDan = new javax.swing.JMenuItem();
        mniGioiThieu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("StoMan - Stroge Manager System");

        toolBar.setRollover(true);

        btnDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stoman/icons/logout-rounded-left.png"))); // NOI18N
        btnDangXuat.setText("Đăng xuất");
        btnDangXuat.setFocusable(false);
        btnDangXuat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDangXuat.setMargin(new java.awt.Insets(2, 10, 2, 10));
        btnDangXuat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolBar.add(btnDangXuat);

        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stoman/icons/close.png"))); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.setFocusable(false);
        btnThoat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnThoat.setMargin(new java.awt.Insets(2, 10, 2, 10));
        btnThoat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolBar.add(btnThoat);
        toolBar.add(separator1);

        btnNhapXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stoman/icons/up-down-arrow.png"))); // NOI18N
        btnNhapXuat.setText("Nhập/Xuất");
        btnNhapXuat.setFocusable(false);
        btnNhapXuat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNhapXuat.setMargin(new java.awt.Insets(2, 10, 2, 10));
        btnNhapXuat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolBar.add(btnNhapXuat);

        btnKiemKho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stoman/icons/warehouse.png"))); // NOI18N
        btnKiemKho.setText("Kiểm kho");
        btnKiemKho.setFocusable(false);
        btnKiemKho.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnKiemKho.setMargin(new java.awt.Insets(2, 10, 2, 10));
        btnKiemKho.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolBar.add(btnKiemKho);

        btnDoiTac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stoman/icons/handshake.png"))); // NOI18N
        btnDoiTac.setText("Quản lý đối tác");
        btnDoiTac.setFocusable(false);
        btnDoiTac.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDoiTac.setMargin(new java.awt.Insets(2, 10, 2, 10));
        btnDoiTac.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolBar.add(btnDoiTac);
        toolBar.add(separator2);

        cboThongTin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stoman/icons/info.png"))); // NOI18N
        cboThongTin.setText("Thông tin");
        cboThongTin.setFocusable(false);
        cboThongTin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cboThongTin.setMargin(new java.awt.Insets(2, 10, 2, 10));
        cboThongTin.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolBar.add(cboThongTin);

        btnHuongDan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stoman/icons/user-manual.png"))); // NOI18N
        btnHuongDan.setText("Hướng dẫn");
        btnHuongDan.setFocusable(false);
        btnHuongDan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHuongDan.setMargin(new java.awt.Insets(2, 10, 2, 10));
        btnHuongDan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolBar.add(btnHuongDan);

        getContentPane().add(toolBar, java.awt.BorderLayout.PAGE_START);

        pnlBieuDo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlBieuDo.setLayout(new java.awt.BorderLayout());

        pnlThongTin.setLayout(new java.awt.GridLayout(0, 1));

        pnlLuongNhap.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlLuongNhap.setLayout(new java.awt.GridLayout(0, 1));

        lblLuongNhap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLuongNhap.setText("Lượng nhập");
        pnlLuongNhap.add(lblLuongNhap);

        lblSoLuongNhap.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblSoLuongNhap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSoLuongNhap.setText("0");
        pnlLuongNhap.add(lblSoLuongNhap);

        pnlThongTin.add(pnlLuongNhap);

        pnlLuongXuat.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlLuongXuat.setLayout(new java.awt.GridLayout(0, 1));

        lblLuongXuat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLuongXuat.setText("Lượng xuất");
        pnlLuongXuat.add(lblLuongXuat);

        lblSoLuongXuat.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblSoLuongXuat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSoLuongXuat.setText("0");
        pnlLuongXuat.add(lblSoLuongXuat);

        pnlThongTin.add(pnlLuongXuat);

        pnlLuongTonKho.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlLuongTonKho.setLayout(new java.awt.GridLayout(0, 1));

        lblTonKho.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTonKho.setText("Tồn kho");
        pnlLuongTonKho.add(lblTonKho);

        lblSoLuongTK.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblSoLuongTK.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSoLuongTK.setText("0");
        pnlLuongTonKho.add(lblSoLuongTK);

        pnlThongTin.add(pnlLuongTonKho);

        javax.swing.GroupLayout pnlTongQuanLayout = new javax.swing.GroupLayout(pnlTongQuan);
        pnlTongQuan.setLayout(pnlTongQuanLayout);
        pnlTongQuanLayout.setHorizontalGroup(
            pnlTongQuanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTongQuanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlBieuDo, javax.swing.GroupLayout.DEFAULT_SIZE, 647, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlTongQuanLayout.setVerticalGroup(
            pnlTongQuanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTongQuanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTongQuanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlThongTin, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
                    .addComponent(pnlBieuDo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabs.addTab("Tổng quan", pnlTongQuan);

        jLabel1.setText("Loại hàng hoá");

        tblHangTonKho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblHangTonKho);

        javax.swing.GroupLayout pnlTonKhoLayout = new javax.swing.GroupLayout(pnlTonKho);
        pnlTonKho.setLayout(pnlTonKhoLayout);
        pnlTonKhoLayout.setHorizontalGroup(
            pnlTonKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTonKhoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTonKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 865, Short.MAX_VALUE)
                    .addGroup(pnlTonKhoLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cboLoaiHang, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlTonKhoLayout.setVerticalGroup(
            pnlTonKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTonKhoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTonKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cboLoaiHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabs.addTab("Hàng tồn kho", pnlTonKho);

        javax.swing.GroupLayout pnlXuatTheoQuyLayout = new javax.swing.GroupLayout(pnlXuatTheoQuy);
        pnlXuatTheoQuy.setLayout(pnlXuatTheoQuyLayout);
        pnlXuatTheoQuyLayout.setHorizontalGroup(
            pnlXuatTheoQuyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 889, Short.MAX_VALUE)
        );
        pnlXuatTheoQuyLayout.setVerticalGroup(
            pnlXuatTheoQuyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 517, Short.MAX_VALUE)
        );

        tabs.addTab("Xuất theo quý", pnlXuatTheoQuy);

        javax.swing.GroupLayout pnlNhapTheoQuyLayout = new javax.swing.GroupLayout(pnlNhapTheoQuy);
        pnlNhapTheoQuy.setLayout(pnlNhapTheoQuyLayout);
        pnlNhapTheoQuyLayout.setHorizontalGroup(
            pnlNhapTheoQuyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 889, Short.MAX_VALUE)
        );
        pnlNhapTheoQuyLayout.setVerticalGroup(
            pnlNhapTheoQuyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 517, Short.MAX_VALUE)
        );

        tabs.addTab("Nhập theo quý", pnlNhapTheoQuy);

        javax.swing.GroupLayout pnlCanCanXuatNhapLayout = new javax.swing.GroupLayout(pnlCanCanXuatNhap);
        pnlCanCanXuatNhap.setLayout(pnlCanCanXuatNhapLayout);
        pnlCanCanXuatNhapLayout.setHorizontalGroup(
            pnlCanCanXuatNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 889, Short.MAX_VALUE)
        );
        pnlCanCanXuatNhapLayout.setVerticalGroup(
            pnlCanCanXuatNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 517, Short.MAX_VALUE)
        );

        tabs.addTab("Cán cân xuất nhập", pnlCanCanXuatNhap);

        getContentPane().add(tabs, java.awt.BorderLayout.CENTER);

        pnlTrangThai.setLayout(new java.awt.BorderLayout());

        lblTrangThai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stoman/icons/info-squared.png"))); // NOI18N
        lblTrangThai.setText("Hệ thống quản lý kho hàng");
        lblTrangThai.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        pnlTrangThai.add(lblTrangThai, java.awt.BorderLayout.CENTER);

        btnDongHo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stoman/icons/alarm-clock.png"))); // NOI18N
        btnDongHo.setText("11:20AM");
        btnDongHo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        pnlTrangThai.add(btnDongHo, java.awt.BorderLayout.EAST);

        getContentPane().add(pnlTrangThai, java.awt.BorderLayout.PAGE_END);

        mnuHeThong.setText("Hệ thống");

        mniDangNhap.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniDangNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stoman/icons/login.png"))); // NOI18N
        mniDangNhap.setText("Đăng nhập");
        mnuHeThong.add(mniDangNhap);

        mniDangXuat.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stoman/icons/logout-rounded-left.png"))); // NOI18N
        mniDangXuat.setText("Đăng xuất");
        mnuHeThong.add(mniDangXuat);
        mnuHeThong.add(jSeparator3);

        mniDoiMK.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniDoiMK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stoman/icons/password-reset.png"))); // NOI18N
        mniDoiMK.setText("Đổi mật khẩu");
        mnuHeThong.add(mniDoiMK);
        mnuHeThong.add(jSeparator4);

        mniThoat.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stoman/icons/close.png"))); // NOI18N
        mniThoat.setText("Thoát");
        mnuHeThong.add(mniThoat);

        menuBar.add(mnuHeThong);

        mnuQuanLy.setText("Quản lý");

        mniHangHoa.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniHangHoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stoman/icons/cardboard-box.png"))); // NOI18N
        mniHangHoa.setText("Hàng hoá");
        mnuQuanLy.add(mniHangHoa);

        mniDoiTac.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniDoiTac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stoman/icons/handshake.png"))); // NOI18N
        mniDoiTac.setText("Đối tác");
        mnuQuanLy.add(mniDoiTac);

        mniKho.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniKho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stoman/icons/warehouse.png"))); // NOI18N
        mniKho.setText("Kho");
        mnuQuanLy.add(mniKho);
        mnuQuanLy.add(jSeparator6);

        mniPhieuNhapXuat.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniPhieuNhapXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stoman/icons/compare.png"))); // NOI18N
        mniPhieuNhapXuat.setText("Phiếu nhập xuất");
        mnuQuanLy.add(mniPhieuNhapXuat);

        mniPhieuKiemKho.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniPhieuKiemKho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stoman/icons/attendance.png"))); // NOI18N
        mniPhieuKiemKho.setText("Phiếu kiểm kho");
        mnuQuanLy.add(mniPhieuKiemKho);
        mnuQuanLy.add(jSeparator5);

        mniNhanVien.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stoman/icons/name-tag.png"))); // NOI18N
        mniNhanVien.setText("Nhân viên");
        mnuQuanLy.add(mniNhanVien);

        menuBar.add(mnuQuanLy);

        mnuTroGiup.setText("Trợ giúp");

        mniHuongDan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stoman/icons/user-manual.png"))); // NOI18N
        mniHuongDan.setText("Hướng dẫn sử dụng");
        mnuTroGiup.add(mniHuongDan);

        mniGioiThieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stoman/icons/info.png"))); // NOI18N
        mniGioiThieu.setText("Giới thiệu phần mềm");
        mnuTroGiup.add(mniGioiThieu);

        menuBar.add(mnuTroGiup);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(StoManJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StoManJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StoManJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StoManJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StoManJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnDoiTac;
    private javax.swing.JLabel btnDongHo;
    private javax.swing.JButton btnHuongDan;
    private javax.swing.JButton btnKiemKho;
    private javax.swing.JButton btnNhapXuat;
    private javax.swing.JButton btnThoat;
    private javax.swing.JComboBox<String> cboLoaiHang;
    private javax.swing.JButton cboThongTin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JLabel lblLuongNhap;
    private javax.swing.JLabel lblLuongXuat;
    private javax.swing.JLabel lblSoLuongNhap;
    private javax.swing.JLabel lblSoLuongTK;
    private javax.swing.JLabel lblSoLuongXuat;
    private javax.swing.JLabel lblTonKho;
    private javax.swing.JLabel lblTrangThai;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem mniDangNhap;
    private javax.swing.JMenuItem mniDangXuat;
    private javax.swing.JMenuItem mniDoiMK;
    private javax.swing.JMenuItem mniDoiTac;
    private javax.swing.JMenuItem mniGioiThieu;
    private javax.swing.JMenuItem mniHangHoa;
    private javax.swing.JMenuItem mniHuongDan;
    private javax.swing.JMenuItem mniKho;
    private javax.swing.JMenuItem mniNhanVien;
    private javax.swing.JMenuItem mniPhieuKiemKho;
    private javax.swing.JMenuItem mniPhieuNhapXuat;
    private javax.swing.JMenuItem mniThoat;
    private javax.swing.JMenu mnuHeThong;
    private javax.swing.JMenu mnuQuanLy;
    private javax.swing.JMenu mnuTroGiup;
    private javax.swing.JPanel pnlBieuDo;
    private javax.swing.JPanel pnlCanCanXuatNhap;
    private javax.swing.JPanel pnlLuongNhap;
    private javax.swing.JPanel pnlLuongTonKho;
    private javax.swing.JPanel pnlLuongXuat;
    private javax.swing.JPanel pnlNhapTheoQuy;
    private javax.swing.JPanel pnlThongTin;
    private javax.swing.JPanel pnlTonKho;
    private javax.swing.JPanel pnlTongQuan;
    private javax.swing.JPanel pnlTrangThai;
    private javax.swing.JPanel pnlXuatTheoQuy;
    private javax.swing.JToolBar.Separator separator1;
    private javax.swing.JToolBar.Separator separator2;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblHangTonKho;
    private javax.swing.JToolBar toolBar;
    // End of variables declaration//GEN-END:variables

    void init() {
        setLocationRelativeTo(null);
        chart();
    }

    // Test chart
    void chart() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset(); 
        double[] luongNhap = {1000, 1200, 950, 1520};
        double[] luongXuat = {500, 700, 400, 850};
        double[] tonKho = {2000, 2250, 1500, 1760};
        
        double tongNhap = 0;
        double tongXuat = 0;
        double tongTonKho = 0;
        
        String pattern = "#,##0";
        
        // Đổ dữ liệu vào biểu đồ
        for(int i = 0; i < 4; i++){
            dataset.setValue(luongNhap[i], "Lượng nhập", "Quý " + (i + 1));
            dataset.setValue(luongXuat[i], "Lượng xuất", "Quý " + (i + 1));
            dataset.setValue(tonKho[i], "Tồn kho", "Quý " + (i + 1));
            
            tongNhap += luongNhap[i];
            tongXuat += luongXuat[i];
            tongTonKho += tonKho[i];
        }
        
        // Tạo biểu đồ Bar Chart
        JFreeChart barChart = ChartFactory.createBarChart3D(null,
            "Quý", "Số lượng", dataset, PlotOrientation.VERTICAL, true, true, false);
        
        CategoryPlot plot = barChart.getCategoryPlot();
        plot.setRangeGridlinePaint(Color.black);
        
        ChartPanel chartPanel = new ChartPanel(barChart);
        pnlBieuDo.add(chartPanel);
        pnlBieuDo.updateUI();
        lblSoLuongNhap.setText(XNumber.toString(tongNhap, pattern));
        lblSoLuongXuat.setText(XNumber.toString(tongXuat, pattern));
        lblSoLuongTK.setText(XNumber.toString(tongTonKho, pattern));
    }

}
