/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stoman.ui;

import com.formdev.flatlaf.FlatIntelliJLaf;
import com.stoman.dao.NhanVienDAO;
import com.stoman.entity.NhanVien;
import com.stoman.utils.Auth;
import com.stoman.utils.MsgBox;
import com.stoman.utils.XPassword;
import java.awt.Color;
import java.awt.Component;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.Timer;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MinhNH
 */
public class NhanVienJDialog extends javax.swing.JDialog {

    /**
     * Creates new form NhanVienJDialog
     */
    public NhanVienJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        btnGrpVaiTro = new javax.swing.ButtonGroup();
        pnlBackground = new javax.swing.JPanel();
        pnlTblNhanVien = new javax.swing.JScrollPane();
        tblNhanVien = new javax.swing.JTable();
        pnlThongTinNV = new javax.swing.JPanel();
        lblMaNV = new javax.swing.JLabel();
        lblHoTen = new javax.swing.JLabel();
        lblMatKhau = new javax.swing.JLabel();
        lblXacNhanMK = new javax.swing.JLabel();
        lblVaiTro = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        txtHoTen = new javax.swing.JTextField();
        txtMatKhau = new javax.swing.JPasswordField();
        txtXacNhanMK = new javax.swing.JPasswordField();
        rdoTruongKho = new javax.swing.JRadioButton();
        rdoThuKho = new javax.swing.JRadioButton();
        pnlTimKiem = new javax.swing.JPanel();
        txtTimKiem = new javax.swing.JTextField();
        lblTimKiem2 = new javax.swing.JLabel();
        cboTimKiem = new javax.swing.JComboBox<>();
        pnlDieuHuongTitle = new javax.swing.JPanel();
        pnlDieuHuong = new javax.swing.JPanel();
        btnFirst = new javax.swing.JButton();
        btnPrev = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        pnlChucNangTitle = new javax.swing.JPanel();
        pnlChucNang = new javax.swing.JPanel();
        btnMoi = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("StoMan - Quản lý nhân viên");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        pnlTblNhanVien.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách nhân viên", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 13))); // NOI18N
        pnlTblNhanVien.setOpaque(false);

        tblNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblNhanVien.setOpaque(false);
        tblNhanVien.setRowHeight(25);
        tblNhanVien.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNhanVienMouseClicked(evt);
            }
        });
        pnlTblNhanVien.setViewportView(tblNhanVien);

        pnlThongTinNV.setBackground(new java.awt.Color(255, 255, 255));
        pnlThongTinNV.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin nhân viên", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 13))); // NOI18N
        pnlThongTinNV.setOpaque(false);

        lblMaNV.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblMaNV.setForeground(new java.awt.Color(102, 102, 102));
        lblMaNV.setText("Mã nhân viên");

        lblHoTen.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblHoTen.setForeground(new java.awt.Color(102, 102, 102));
        lblHoTen.setText("Họ và tên");

        lblMatKhau.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblMatKhau.setForeground(new java.awt.Color(102, 102, 102));
        lblMatKhau.setText("Mật khẩu");

        lblXacNhanMK.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblXacNhanMK.setForeground(new java.awt.Color(102, 102, 102));
        lblXacNhanMK.setText("Xác nhận mật khẩu");

        lblVaiTro.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblVaiTro.setForeground(new java.awt.Color(102, 102, 102));
        lblVaiTro.setText("Vai trò");

        txtHoTen.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtHoTenFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtHoTenFocusLost(evt);
            }
        });

        txtMatKhau.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMatKhauFocusGained(evt);
            }
        });

        txtXacNhanMK.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtXacNhanMKFocusGained(evt);
            }
        });

        btnGrpVaiTro.add(rdoTruongKho);
        rdoTruongKho.setText("Trưởng kho");

        btnGrpVaiTro.add(rdoThuKho);
        rdoThuKho.setSelected(true);
        rdoThuKho.setText("Thủ kho");

        javax.swing.GroupLayout pnlThongTinNVLayout = new javax.swing.GroupLayout(pnlThongTinNV);
        pnlThongTinNV.setLayout(pnlThongTinNVLayout);
        pnlThongTinNVLayout.setHorizontalGroup(
            pnlThongTinNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThongTinNVLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnlThongTinNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblXacNhanMK)
                    .addComponent(lblMaNV)
                    .addComponent(lblHoTen)
                    .addComponent(lblMatKhau)
                    .addComponent(lblVaiTro))
                .addGap(10, 10, 10)
                .addGroup(pnlThongTinNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtMaNV, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlThongTinNVLayout.createSequentialGroup()
                        .addComponent(rdoTruongKho)
                        .addGap(18, 18, 18)
                        .addComponent(rdoThuKho))
                    .addComponent(txtMatKhau, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtXacNhanMK, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(12, 12, 12))
        );
        pnlThongTinNVLayout.setVerticalGroup(
            pnlThongTinNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThongTinNVLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnlThongTinNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaNV)
                    .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlThongTinNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHoTen))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlThongTinNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMatKhau)
                    .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlThongTinNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblXacNhanMK)
                    .addComponent(txtXacNhanMK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlThongTinNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdoTruongKho)
                    .addComponent(rdoThuKho)
                    .addComponent(lblVaiTro))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pnlThongTinNVLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtHoTen, txtMaNV, txtMatKhau, txtXacNhanMK});

        pnlTimKiem.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm kiếm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 13))); // NOI18N
        pnlTimKiem.setOpaque(false);

        txtTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiemKeyReleased(evt);
            }
        });

        lblTimKiem2.setText("theo");

        cboTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTimKiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlTimKiemLayout = new javax.swing.GroupLayout(pnlTimKiem);
        pnlTimKiem.setLayout(pnlTimKiemLayout);
        pnlTimKiemLayout.setHorizontalGroup(
            pnlTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTimKiemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTimKiem2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlTimKiemLayout.setVerticalGroup(
            pnlTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTimKiemLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(pnlTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTimKiem2)
                    .addComponent(cboTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9))
        );

        pnlDieuHuongTitle.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Điều hướng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 13))); // NOI18N
        pnlDieuHuongTitle.setOpaque(false);

        pnlDieuHuong.setLayout(new java.awt.GridLayout(1, 0));

        btnFirst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stoman/icons/skip-to-start.png"))); // NOI18N
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });
        pnlDieuHuong.add(btnFirst);

        btnPrev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stoman/icons/double-left-24.png"))); // NOI18N
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });
        pnlDieuHuong.add(btnPrev);

        btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stoman/icons/double-right.png"))); // NOI18N
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        pnlDieuHuong.add(btnNext);

        btnLast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stoman/icons/skip-to-end.png"))); // NOI18N
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });
        pnlDieuHuong.add(btnLast);

        javax.swing.GroupLayout pnlDieuHuongTitleLayout = new javax.swing.GroupLayout(pnlDieuHuongTitle);
        pnlDieuHuongTitle.setLayout(pnlDieuHuongTitleLayout);
        pnlDieuHuongTitleLayout.setHorizontalGroup(
            pnlDieuHuongTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDieuHuongTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlDieuHuong, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlDieuHuongTitleLayout.setVerticalGroup(
            pnlDieuHuongTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDieuHuongTitleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlDieuHuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlChucNangTitle.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chức năng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 13))); // NOI18N
        pnlChucNangTitle.setForeground(new java.awt.Color(51, 51, 51));

        pnlChucNang.setLayout(new java.awt.GridLayout(4, 1));

        btnMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stoman/icons/icons8_document_24px.png"))); // NOI18N
        btnMoi.setText("Mới");
        btnMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiActionPerformed(evt);
            }
        });
        pnlChucNang.add(btnMoi);

        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stoman/icons/icons8_add_list_24px_4.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        pnlChucNang.add(btnThem);

        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stoman/icons/icons8_delete_document_24px_2.png"))); // NOI18N
        btnXoa.setText("Xoá");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        pnlChucNang.add(btnXoa);

        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stoman/icons/edit-property.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        pnlChucNang.add(btnSua);

        javax.swing.GroupLayout pnlChucNangTitleLayout = new javax.swing.GroupLayout(pnlChucNangTitle);
        pnlChucNangTitle.setLayout(pnlChucNangTitleLayout);
        pnlChucNangTitleLayout.setHorizontalGroup(
            pnlChucNangTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlChucNangTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlChucNang, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlChucNangTitleLayout.setVerticalGroup(
            pnlChucNangTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlChucNangTitleLayout.createSequentialGroup()
                .addComponent(pnlChucNang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlBackgroundLayout = new javax.swing.GroupLayout(pnlBackground);
        pnlBackground.setLayout(pnlBackgroundLayout);
        pnlBackgroundLayout.setHorizontalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgroundLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlTblNhanVien, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addComponent(pnlThongTinNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlChucNangTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addComponent(pnlTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlDieuHuongTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9))
        );
        pnlBackgroundLayout.setVerticalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlThongTinNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlChucNangTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlDieuHuongTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlTblNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                .addGap(9, 9, 9))
        );

        getContentPane().add(pnlBackground, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNhanVienMouseClicked
        // TODO add your handling code here:
        this.row = tblNhanVien.getSelectedRow();
        this.edit();
    }//GEN-LAST:event_tblNhanVienMouseClicked

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        delete();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        insert();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed
        // TODO add your handling code here:
        clearForm();
    }//GEN-LAST:event_btnMoiActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        update();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        // TODO add your handling code here:
        first();
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        // TODO add your handling code here:
        prev();
    }//GEN-LAST:event_btnPrevActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        next();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        // TODO add your handling code here:
        last();
    }//GEN-LAST:event_btnLastActionPerformed

    private void txtTimKiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemKeyReleased
        // TODO add your handling code here:
        fillToTable();
        clearForm();
    }//GEN-LAST:event_txtTimKiemKeyReleased

    private void cboTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTimKiemActionPerformed
        // TODO add your handling code here:
        txtTimKiem.setText("");
        clearForm();
        fillToTable();
    }//GEN-LAST:event_cboTimKiemActionPerformed

    private void txtHoTenFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHoTenFocusLost
        // TODO add your handling code here:
        String hoTen = txtHoTen.getText();
        if(!hoTen.isEmpty()){
            txtHoTen.setText(capitalizeWord(hoTen));
        }
    }//GEN-LAST:event_txtHoTenFocusLost

    private void txtMatKhauFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMatKhauFocusGained
        // TODO add your handling code here:
        txtMatKhau.selectAll();
    }//GEN-LAST:event_txtMatKhauFocusGained

    private void txtXacNhanMKFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtXacNhanMKFocusGained
        // TODO add your handling code here:
        txtXacNhanMK.selectAll();
    }//GEN-LAST:event_txtXacNhanMKFocusGained

    private void txtHoTenFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHoTenFocusGained
        // TODO add your handling code here:
        txtHoTen.selectAll();
    }//GEN-LAST:event_txtHoTenFocusGained

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        this.timer.stop();
    }//GEN-LAST:event_formWindowClosed

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
            javax.swing.UIManager.setLookAndFeel(new FlatIntelliJLaf());
            javax.swing.UIManager.put("Table.showHorizontalLines", true);
            javax.swing.UIManager.put("Table.showVerticalLines", true);
            javax.swing.UIManager.put("TitlePane.unifiedBackground", true);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PhieuKiemKhoJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NhanVienJDialog dialog = new NhanVienJDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFirst;
    private javax.swing.ButtonGroup btnGrpVaiTro;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrev;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cboTimKiem;
    private javax.swing.JLabel lblHoTen;
    private javax.swing.JLabel lblMaNV;
    private javax.swing.JLabel lblMatKhau;
    private javax.swing.JLabel lblTimKiem2;
    private javax.swing.JLabel lblVaiTro;
    private javax.swing.JLabel lblXacNhanMK;
    private javax.swing.JPanel pnlBackground;
    private javax.swing.JPanel pnlChucNang;
    private javax.swing.JPanel pnlChucNangTitle;
    private javax.swing.JPanel pnlDieuHuong;
    private javax.swing.JPanel pnlDieuHuongTitle;
    private javax.swing.JScrollPane pnlTblNhanVien;
    private javax.swing.JPanel pnlThongTinNV;
    private javax.swing.JPanel pnlTimKiem;
    private javax.swing.JRadioButton rdoThuKho;
    private javax.swing.JRadioButton rdoTruongKho;
    private javax.swing.JTable tblNhanVien;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JTextField txtTimKiem;
    private javax.swing.JPasswordField txtXacNhanMK;
    // End of variables declaration//GEN-END:variables

    private NhanVienDAO DAO = new NhanVienDAO();
    private DefaultTableModel tblModel;
    private int row = -1;

    private void init() {
        setLocationRelativeTo(null);
        
        this.formatTable();
        
        this.fillToComboBox();
        this.fillToTable();
        this.updateStatus();
        
        timer.start();
    }

    // Đổ dữ liệu nhân viên vào bảng
    private void fillToTable() {
        tblModel.setRowCount(0);
        String keyword = txtTimKiem.getText();
        List<NhanVien> list = null;

        try {
            if (!txtTimKiem.getText().isEmpty()) {
                int headerIndex = cboTimKiem.getSelectedIndex();
                list = DAO.selectByKeyword(keyword, headerIndex);
            } else {
                list = DAO.selectAll();
            }
            for (NhanVien nv : list) {
                tblModel.addRow(new Object[]{
                    nv.getMaNV(),
                    nv.getTenNV(),
                    nv.isVaiTro() ? "Trưởng kho" : "Thủ kho"
                });
            }
            tblNhanVien.setModel(tblModel);
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu!");
            e.printStackTrace();
        }
    }

    // Đổ tên bảng vào combobox tìm kiếm
    private void fillToComboBox() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboTimKiem.getModel();
        model.removeAllElements();
        for (int i = 0; i < tblNhanVien.getColumnCount(); i++) {
            String columnName = tblNhanVien.getColumnName(i);
            model.addElement(columnName);
        }
    }

    // Tạo nhân viên mới từ form
    private NhanVien getForm() {
        NhanVien nv = new NhanVien();
        byte[] muoi = XPassword.getSalt();
        String matKhau = new String(txtMatKhau.getPassword());
        nv.setMaNV(txtMaNV.getText());
        nv.setTenNV(txtHoTen.getText());
        nv.setMatKhau(XPassword.getHashMD5(matKhau, muoi));
        nv.setVaiTro(rdoTruongKho.isSelected());
        nv.setMuoi(muoi);

        return nv;
    }

    // Hiển thị thông tin nhân viên lên form
    private void setForm(NhanVien nv) {
        txtMaNV.setText(nv.getMaNV());
        txtHoTen.setText(nv.getTenNV());
        txtMatKhau.setText(nv.getMatKhau());
        txtXacNhanMK.setText(nv.getMatKhau());
        if (nv.isVaiTro()) {
            rdoTruongKho.setSelected(true);
        } else {
            rdoThuKho.setSelected(true);
        }
    }

    // Xoá trắng form
    private void clearForm() {
        this.setForm(new NhanVien());
        this.row = -1;
        this.updateStatus();
        tblNhanVien.clearSelection();
    }

    // Hiển thị dữ liệu nhân viên đang chọn trên bảng
    private void edit() {
        String maNV = (String) tblNhanVien.getValueAt(this.row, 0);
        NhanVien nv = DAO.selectByID(maNV);
        this.setForm(nv);
        this.updateStatus();
    }

    // Cập nhật trạng thái form và các nút theo hoạt động của người dùng
    private void updateStatus() {
        boolean edit = (this.row >= 0);
        boolean first = (this.row == 0);
        boolean last = (this.row == tblNhanVien.getRowCount() - 1);

        // Chọn hàng trên bảng
        if (edit) {
            tblNhanVien.setRowSelectionInterval(row, row);
        }
        // Điều chỉnh trạng thái các nút và ô nhập text
        txtMaNV.setEditable(!edit);
        btnThem.setEnabled(!edit);
        btnSua.setEnabled(edit);
        btnXoa.setEnabled(edit);

        btnFirst.setEnabled(!first);
        btnPrev.setEnabled(!first);
        btnNext.setEnabled(!last);
        btnLast.setEnabled(!last);
    }

    // Hiển thị nhân viên đầu danh sách
    private void first() {
        this.row = 0;
        this.edit();
    }

    // Hiển thị nhân viên kế trước
    private void prev() {
        if (this.row > 0) {
            this.row--;
            this.edit();
        }
    }

    // Hiển thị nhân viên kế tiếp
    private void next() {
        if (this.row < (tblNhanVien.getRowCount() - 1)) {
            this.row++;
            this.edit();
        }
    }

    // Hiển thị nhân viên cuối danh sách
    private void last() {
        this.row = tblNhanVien.getRowCount() - 1;
        this.edit();
    }

    // Xác thực dữ liệu trên form
    private boolean isValidated() {
        String maNV = txtMaNV.getText();
        String hoTen = txtHoTen.getText();
        char[] matKhau = txtMatKhau.getPassword();
        char[] xacNhanMK = txtXacNhanMK.getPassword();

        if (maNV.isEmpty()) {
            MsgBox.alert(this, "Chưa nhập mã nhân viên!");
            txtMaNV.requestFocus();
            return false;
        }
        if (hoTen.isEmpty()) {
            MsgBox.alert(this, "Chưa nhập họ và tên!");
            txtHoTen.requestFocus();
            return false;
        }
        if (matKhau.length == 0) {
            MsgBox.alert(this, "Chưa nhập mật khẩu!");
            txtMatKhau.requestFocus();
            return false;
        }
        if (matKhau.length < 8) {
            MsgBox.alert(this, "Mật khẩu không được ngắn hơn 8 ký tự!");
            txtMatKhau.requestFocus();
            return false;
        }
        if (xacNhanMK.length == 0) {
            MsgBox.alert(this, "Chưa nhập mật khẩu xác nhận!");
            txtXacNhanMK.requestFocus();
            return false;
        }
        if (!new String(matKhau).equals(new String(xacNhanMK))) {
            MsgBox.alert(this, "Xác nhận mật khẩu không trùng khớp!");
            return false;
        }
        return true;
    }

    // Thêm nhân viên mới
    private void insert() {
        if (!isValidated()) {
            return;
        }

        if (DAO.selectByID(txtMaNV.getText()) != null) {
            MsgBox.alert(this, "Mã nhân viên đã tồn tại!");
            txtHoTen.requestFocus();
            return;
        }
        NhanVien nv = getForm();
        try {
            DAO.insert(nv);
            this.fillToTable();
            this.clearForm();
            MsgBox.alert(this, "Thêm mới thành công!");
        } catch (Exception e) {
            MsgBox.alert(this, "Thêm mới thất bại!");
            e.printStackTrace();
        }
    }

    // Xoá nhân viên hiện tại
    private void delete() {
        String maNV = (String) tblNhanVien.getValueAt(this.row, 0);
        if (maNV.equals(Auth.user.getMaNV())) {
            MsgBox.alert(this, "Bạn không thể xoá chính bạn!");
            return;
        }
        String message = "Các phiếu nhập xuất và kiểm kho do nhân viên này lập sẽ bị xoá!"
                + "\nBạn có chắc chắn xoá nhân viên này?";
        if (MsgBox.confirm(this, message)) {
            try {
                DAO.delete(maNV);
                this.fillToTable();
                this.clearForm();
                MsgBox.alert(this, "Xoá thành công!");
            } catch (Exception e) {
                MsgBox.alert(this, "Xoá không thành công!");
                e.printStackTrace();
            }
        }
    }

    // Cập nhật nhân viên 
    private void update() {
        if (!isValidated()) {
            return;
        }
        
        NhanVien nv = getForm();
        try {
            DAO.update(nv);
            this.fillToTable();
            this.updateStatus();
            MsgBox.alert(this, "Cập nhật thành công!");
        } catch (Exception e) {
            MsgBox.alert(this, "Cập nhật thất bại!");
            e.printStackTrace();
        }
    }

    // Tự động viết hoa chữ cái đầu họ và tên
    public static String capitalizeWord(String str) {
        str = str.trim();
        String[] words = str.split("\\s+");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String s = words[i].substring(0, 1).toUpperCase()
                    + words[i].substring(1).toLowerCase();
            sb.append(s);
            if (i < words.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    // Định dạng bảng
    private void formatTable() {
        String header[] = {"MÃ NHÂN VIÊN", "HỌ TÊN", "VAI TRÒ"};
        tblModel = new DefaultTableModel(header, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

            @Override
            public Class getColumnClass(int columnIndex) {
                if (tblModel.getRowCount() == 0) {
                    return String.class;
                }
                if (getValueAt(0, columnIndex) == null) {
                    return Object.class;
                }
                return getValueAt(0, columnIndex).getClass();
            }
        };
        tblNhanVien.setModel(tblModel);
        tblNhanVien.setAutoCreateRowSorter(true);
        
        tblNhanVien.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value,
                          boolean isSelected, boolean hasFocus, int row, int column) {
                JLabel label = (JLabel) super.getTableCellRendererComponent(table, 
                        value, isSelected, hasFocus, row, column);
                
                Color color = Color.black;
                Object obj = table.getValueAt(row, 2);
                if (obj != null && "Trưởng kho".equals(obj.toString())) {
                    color = new Color(19, 97, 91);
                } 
                if (obj != null && "Thủ kho".equals(obj.toString())) {
                    color = new Color(163, 52, 34);
                }
                if (isSelected) {
                    color = Color.white;
                }
                label.setForeground(color);
                label.setFont(new java.awt.Font("Segoe UI", 1, 13));
                return label;
            }
        });
        
    }

    // Đỗ lại dữ liệu 
    public void refreshForm() {
        
        this.fillToComboBox();
        this.fillToTable();

        this.timer.restart();
    }
    
    // sau hai phút tải lại dữ liệu
    private Timer timer = new Timer(120000, (e) -> {
        refreshForm();
    });
    
}
