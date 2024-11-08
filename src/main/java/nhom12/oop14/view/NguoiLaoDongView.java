package nhom12.oop14.view;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.WindowConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import nhom12.oop14.entity.NguoiLaoDong;
import nhom12.oop14.dao.NguoiLaoDongDAO;

public class NguoiLaoDongView extends javax.swing.JFrame implements ActionListener, ListSelectionListener {

    /**
     * Creates new form NguoiLaoDongView
     */
    public NguoiLaoDongView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        nguoiLaoDongTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        idLabel = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        hoTenField = new javax.swing.JTextField();
        genderLabel = new javax.swing.JLabel();
        gioiTinhBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        ngaySinhField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        noiOField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        hoKhauField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ngheNghiepField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tinhTrangHonNhanBox = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        thuNhapField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        anhBtn = new javax.swing.JButton();
        addNguoiLaoDongBtn = new javax.swing.JButton();
        editNguoiLaoDongBtn = new javax.swing.JButton();
        deleteNguoiLaoDongBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        anhLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        timKiemTenField = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        sortNguoiLaoDongTenBtn = new javax.swing.JButton();
        sortNguoiLaoDongThuNhapBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        nguoiLaoDongTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Họ tên", "Giới tính", "Ngày sinh", "Nơi ở", "Hộ khẩu", "Nghề nghiệp", "Tình trạng hôn nhân", "Thu nhập", "Hình ảnh"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        nguoiLaoDongTable.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                nguoiLaoDongTableAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(nguoiLaoDongTable);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        idLabel.setText("ID");

        jLabel1.setText("Họ tên");

        genderLabel.setText("Giới tính");

        gioiTinhBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));
        gioiTinhBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gioiTinhBoxActionPerformed(evt);
            }
        });

        jLabel2.setText("Ngày sinh");

        jLabel3.setText("Nơi ở");

        jLabel4.setText("Hộ khẩu");

        jLabel5.setText("Nghề ngiệp");

        jLabel6.setText("TTHN");

        tinhTrangHonNhanBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Độc thân", "Đã kết hôn" }));

        jLabel7.setText("Thu nhập");

        jLabel8.setText("Hình ảnh");

        anhBtn.setText("CHỌN ẢNH");
        anhBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anhBtnActionPerformed(evt);
            }
        });

        addNguoiLaoDongBtn.setText("Thêm");

        editNguoiLaoDongBtn.setText("Sửa");
        editNguoiLaoDongBtn.setEnabled(false);

        deleteNguoiLaoDongBtn.setText("Xoá");
        deleteNguoiLaoDongBtn.setEnabled(false);

        clearBtn.setText("Làm sạch");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(genderLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(gioiTinhBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ngaySinhField, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hoTenField, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(thuNhapField, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ngheNghiepField, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tinhTrangHonNhanBox, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hoKhauField)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(noiOField, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(addNguoiLaoDongBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(editNguoiLaoDongBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(deleteNguoiLaoDongBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(anhBtn)
                .addGap(30, 30, 30)
                .addComponent(anhLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLabel)
                    .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(hoTenField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderLabel)
                    .addComponent(gioiTinhBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(ngaySinhField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(noiOField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(hoKhauField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ngheNghiepField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(tinhTrangHonNhanBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(thuNhapField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(anhLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(anhBtn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addNguoiLaoDongBtn)
                    .addComponent(editNguoiLaoDongBtn)
                    .addComponent(deleteNguoiLaoDongBtn)
                    .addComponent(clearBtn))
                .addGap(36, 36, 36))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        label1.setText("Tìm kiếm theo tên");

        timKiemTenField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timKiemTenFieldActionPerformed(evt);
            }
        });

        searchBtn.setText("Tìm kiếm");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        sortNguoiLaoDongTenBtn.setText("Sắp xếp theo tên");

        sortNguoiLaoDongThuNhapBtn.setText("Sắp xếp theo thu nhập");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(timKiemTenField, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(sortNguoiLaoDongTenBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(sortNguoiLaoDongThuNhapBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(timKiemTenField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(searchBtn))
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sortNguoiLaoDongTenBtn)
                    .addComponent(sortNguoiLaoDongThuNhapBtn))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 992, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(236, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void nguoiLaoDongTableAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_nguoiLaoDongTableAncestorAdded

    }//GEN-LAST:event_nguoiLaoDongTableAncestorAdded

    private void gioiTinhBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gioiTinhBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gioiTinhBoxActionPerformed

    private void timKiemTenFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timKiemTenFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timKiemTenFieldActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed

    }//GEN-LAST:event_searchBtnActionPerformed

    private void anhBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anhBtnActionPerformed
        // TODO add your handling code here:
        // Tạo JFileChooser để chọn ảnh
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Chọn hình ảnh");

        // Thiết lập bộ lọc để chỉ cho phép chọn file ảnh
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Image files", "jpg", "jpeg", "png", "gif");
        fileChooser.setFileFilter(filter);

        // Hiển thị cửa sổ chọn file
        int result = fileChooser.showOpenDialog(this);

        // Kiểm tra nếu người dùng chọn file
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();

            // Đọc ảnh và hiển thị vào JLabel
            try {
                BufferedImage img = ImageIO.read(selectedFile);
                ImageIcon imageIcon = new ImageIcon(img);
                anhLabel.setIcon(imageIcon);  // Giả sử bạn có JLabel để hiển thị ảnh
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Không thể tải ảnh.");
            }
        }
    }//GEN-LAST:event_anhBtnActionPerformed

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
            java.util.logging.Logger.getLogger(NguoiLaoDongView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NguoiLaoDongView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NguoiLaoDongView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NguoiLaoDongView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NguoiLaoDongView().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addNguoiLaoDongBtn;
    private javax.swing.JButton anhBtn;
    private javax.swing.JLabel anhLabel;
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton deleteNguoiLaoDongBtn;
    private javax.swing.JButton editNguoiLaoDongBtn;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JComboBox<String> gioiTinhBox;
    private javax.swing.JTextField hoKhauField;
    private javax.swing.JTextField hoTenField;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    private javax.swing.JTextField ngaySinhField;
    private javax.swing.JTextField ngheNghiepField;
    private javax.swing.JTable nguoiLaoDongTable;
    private javax.swing.JTextField noiOField;
    private javax.swing.JButton searchBtn;
    private javax.swing.JButton sortNguoiLaoDongTenBtn;
    private javax.swing.JButton sortNguoiLaoDongThuNhapBtn;
    private javax.swing.JTextField thuNhapField;
    private javax.swing.JTextField timKiemTenField;
    private javax.swing.JComboBox<String> tinhTrangHonNhanBox;
    // End of variables declaration//GEN-END:variables

    private Image selectedImage;

    public Image getSelectedImage() {
        return selectedImage;
    }

    // Các phương thức getter cho các trường nhập khác
    public String getHoTenField() {
        return hoTenField.getText();
    }

    public String getNgaySinhField() {
        return ngaySinhField.getText();
    }

    public String getNoiOField() {
        return noiOField.getText();
    }

    public String getHoKhauField() {
        return hoKhauField.getText();
    }

    public String getNgheNghiepField() {
        return ngheNghiepField.getText();
    }

    public String getGioiTinhBox() {
        return (String) gioiTinhBox.getSelectedItem();
    }

    public String getTinhTrangHonNhanBox() {
        return (String) tinhTrangHonNhanBox.getSelectedItem();
    }

    public String getThuNhapField() {
        return thuNhapField.getText();
    }

    public void showMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }

    public void showListNguoiLaoDong(List<NguoiLaoDong> list) {
        int size = list.size();

        Object[][] nguoilaodongs = new Object[size][10];
        for (int i = 0; i < size; i++) {
            nguoilaodongs[i][0] = list.get(i).getId();
            nguoilaodongs[i][1] = list.get(i).getHoTen();
            nguoilaodongs[i][2] = list.get(i).getGioiTinh();
            nguoilaodongs[i][3] = list.get(i).getNgaySinh();
            nguoilaodongs[i][4] = list.get(i).getNoiO();
            nguoilaodongs[i][5] = list.get(i).getHoKhau();
            nguoilaodongs[i][6] = list.get(i).getNgheNghiep();
            nguoilaodongs[i][7] = list.get(i).getTinhTrangHonNhan();
            nguoilaodongs[i][8] = list.get(i).getThuNhap();
            nguoilaodongs[i][9] = list.get(i).getHinhAnh();
        }

        String[] columnNames = new String[]{
            "ID", "Họ tên", "Giới tính", "Ngày sinh", "Nơi ở", "Hộ khẩu", "Nghề nghiệp", "Tình trạng hôn nhân", "Thu nhập", "Hình ảnh"};

        nguoiLaoDongTable.setModel(new DefaultTableModel(nguoilaodongs, columnNames));
    }

    public void fillNguoiLaoDongFromSelectedRow() {
        // lấy chỉ số của hàng được chọn 
        int row = nguoiLaoDongTable.getSelectedRow();
        if (row >= 0) {
            idField.setText(nguoiLaoDongTable.getModel().getValueAt(row, 0).toString());
            hoTenField.setText(nguoiLaoDongTable.getModel().getValueAt(row, 1).toString());
            gioiTinhBox.setSelectedItem(nguoiLaoDongTable.getModel().getValueAt(row, 2).toString());
            ngaySinhField.setText(nguoiLaoDongTable.getModel().getValueAt(row, 3).toString());
            noiOField.setText(nguoiLaoDongTable.getModel().getValueAt(row, 4).toString());
            hoKhauField.setText(nguoiLaoDongTable.getModel().getValueAt(row, 5).toString());
            ngheNghiepField.setText(nguoiLaoDongTable.getModel().getValueAt(row, 6).toString());
            tinhTrangHonNhanBox.setSelectedItem(nguoiLaoDongTable.getModel().getValueAt(row, 7).toString());
            thuNhapField.setText(nguoiLaoDongTable.getModel().getValueAt(row, 8).toString());

            Object imageObject = nguoiLaoDongTable.getModel().getValueAt(row, 9);
            if (imageObject instanceof ImageIcon) {
                ImageIcon imageIcon = (ImageIcon) imageObject;
                anhLabel.setIcon(imageIcon); // Display image in the JLabel
            } else {
                anhLabel.setIcon(null); // Clear the image if there is none
            }
            // enable Edit and Delete buttons
            editNguoiLaoDongBtn.setEnabled(true);
            deleteNguoiLaoDongBtn.setEnabled(true);
            // disable Add button
            addNguoiLaoDongBtn.setEnabled(false);
        }
    }

    public String getSelectedNguoiLaoDongId() {
        int selectedRow = nguoiLaoDongTable.getSelectedRow();
        if (selectedRow >= 0) {
            return nguoiLaoDongTable.getModel().getValueAt(selectedRow, 0).toString();
        }
        return null;
    }

    public void clearNguoiLaoDongInfo() {
        idField.setText("");
        hoTenField.setText("");
        gioiTinhBox.setSelectedItem("");
        ngaySinhField.setText("");
        noiOField.setText("");
        hoKhauField.setText("");
        ngheNghiepField.setText("");
        tinhTrangHonNhanBox.setSelectedItem("");
        thuNhapField.setText("");

        // Disable Edit and Delete buttons
        editNguoiLaoDongBtn.setEnabled(false);
        deleteNguoiLaoDongBtn.setEnabled(false);

        // Enable Add button
        addNguoiLaoDongBtn.setEnabled(true);

        // Clear the image
        anhLabel.setIcon(null);
    }

    public void showNguoiLaoDong(NguoiLaoDong nld) {
        idField.setText(String.valueOf(nld.getId()));
        hoTenField.setText(nld.getHoTen());
        gioiTinhBox.setSelectedItem(nld.getGioiTinh());
        ngaySinhField.setText("" + nld.getNgaySinh());
        noiOField.setText(nld.getNoiO());
        hoKhauField.setText(nld.getHoKhau());
        ngheNghiepField.setText(nld.getNgheNghiep());
        tinhTrangHonNhanBox.setSelectedItem(nld.getTinhTrangHonNhan());
        thuNhapField.setText(String.valueOf(nld.getThuNhap()));

        // Display the image
        if (nld.getHinhAnh() != null) {
            anhLabel.setIcon(new ImageIcon(nld.getHinhAnh()));
        } else {
            anhLabel.setIcon(null);
        }

        // Enable Edit and Delete buttons
        editNguoiLaoDongBtn.setEnabled(true);
        deleteNguoiLaoDongBtn.setEnabled(true);

        // Disable Add button
        addNguoiLaoDongBtn.setEnabled(false);
    }

    public NguoiLaoDong getNguoiLaoDongInfo() {
        if (!validateFields()) {
            return null;
        }

        try {
            NguoiLaoDong nguoilaodong = new NguoiLaoDong();

            nguoilaodong.setId(Integer.parseInt(idField.getText().trim()));
            nguoilaodong.setHoTen(hoTenField.getText().trim());
            nguoilaodong.setGioiTinh(gioiTinhBox.getSelectedItem().toString());
            nguoilaodong.setNgaySinh(parseDate(ngaySinhField.getText().trim()));
            nguoilaodong.setNoiO(noiOField.getText().trim());
            nguoilaodong.setHoKhau(hoKhauField.getText().trim());
            nguoilaodong.setNgheNghiep(ngheNghiepField.getText().trim());
            nguoilaodong.setTinhTrangHonNhan(tinhTrangHonNhanBox.getSelectedItem().toString());
            nguoilaodong.setThuNhap(parseDouble(thuNhapField.getText().trim(), "Thu nhập"));

            // Handle image (if selected)
            if (anhLabel.getIcon() != null) {
                ImageIcon imageIcon = (ImageIcon) anhLabel.getIcon();
                nguoilaodong.setHinhAnh(imageIcon.getImage());
            }

            return nguoilaodong;
        } catch (Exception e) {
            showMessage(e.getMessage());
        }

        return null;
    }

    private boolean validateFields() {
        return validateNotEmpty(hoTenField, "Tên")
                && validateNotEmpty(noiOField, "Nơi ở")
                && validateNotEmpty(hoKhauField, "Hộ khẩu")
                && validateNotEmpty(ngheNghiepField, "Nghề nghiệp")
                && validateIncome(thuNhapField)
                && validateDateOfBirth(ngaySinhField);
    }

// Kiểm tra ngày sinh hợp lệ
    private boolean validateDateOfBirth(JTextField dobField) {
        try {
            parseDate(dobField.getText().trim());
            return true;
        } catch (Exception e) {
            dobField.requestFocus();
            showMessage("Ngày sinh không hợp lệ!");
            return false;
        }
    }

// Kiểm tra thu nhập hợp lệ
    private boolean validateIncome(JTextField incomeField) {
        Double income = parseDouble(incomeField.getText().trim(), "Income");
        if (income == null || income < 0) {
            incomeField.requestFocus();
            showMessage("Thu nhập không hợp lệ, phải là số dương.");
            return false;
        }
        return true;
    }

    private Date parseDate(String text) {
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            return formatter.parse(text);
        } catch (Exception e) {
            throw new RuntimeException("Định dạng ngày không hợp lệ! Sử dụng định dạng dd/MM/yyyy.");
        }
    }

    private Double parseDouble(String text, String fieldName) {
        try {
            return (text != null && !text.isEmpty()) ? Double.parseDouble(text) : null;
        } catch (NumberFormatException e) {
            showMessage(fieldName + " không hợp lệ!");
            return null;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }

    public void valueChanged(ListSelectionEvent e) {
    }

    public void addAddNguoiLaoDongListener(ActionListener listener) {
        addNguoiLaoDongBtn.addActionListener(listener);
    }

    public void addEditNguoiLaoDongListener(ActionListener listener) {
        editNguoiLaoDongBtn.addActionListener(listener);
    }

    public void addDeleteNguoiLaoDongListener(ActionListener listener) {
        deleteNguoiLaoDongBtn.addActionListener(listener);
    }

    public void addClearListener(ActionListener listener) {
        clearBtn.addActionListener(listener);
    }

    public void addSortNguoiLaoDongThuNhapListener(ActionListener listener) {
        sortNguoiLaoDongThuNhapBtn.addActionListener(listener);
    }

    public void addSortNguoiLaoDongTenListener(ActionListener listener) {
        sortNguoiLaoDongTenBtn.addActionListener(listener);
    }

    public void addListNguoiLaoDongSelectionListener(ListSelectionListener listener) {
        nguoiLaoDongTable.getSelectionModel().addListSelectionListener(listener);
    }

    private boolean validateNotEmpty(JTextField field, String fieldName) {
        if (field.getText().trim().isEmpty()) {
            showMessage(fieldName + " không được để trống.");
            field.requestFocus();
            return false;
        }
        return true;
    }

//    public void refreshTable(List<NguoiLaoDong> danhSach) {
//        // Cập nhật bảng với dữ liệu mới từ danh sách người lao động
//        // Giả sử bạn có một JTable tên là nguoiLaoDongTable
//        DefaultTableModel tableModel = (DefaultTableModel) nguoiLaoDongTable.getModel();
//        tableModel.setRowCount(0);  // Xóa các dòng cũ
//        for (NguoiLaoDong nld : danhSach) {
//            tableModel.addRow(new Object[]{
//                nld.getHoTen(), nld.getGioiTinh(), nld.getNgaySinh(),
//                nld.getNoiO(), nld.getHoKhau(), nld.getNgheNghiep(),
//                nld.getTinhTrangHonNhan(), nld.getThuNhap(), nld.getHinhAnh()
//            });
//        }
//    }

//    public String getSelectedNguoiLaoDongId() {
//        int selectedRow = nguoiLaoDongTable.getSelectedRow();
//        if (selectedRow != -1) {
//            // Giả sử ID là cột đầu tiên (chỉ mục cột là 0)
//            Object idValue = nguoiLaoDongTable.getValueAt(selectedRow, 0);
//            return idValue != null ? idValue.toString() : null;
//        } else {
//            // Không có hàng nào được chọn
//            return null;
//        }
//    }
}
