package nhom12.oop14.view;

import javax.swing.*;
import java.awt.event.ActionListener;

public class RegistrationView extends javax.swing.JFrame {
    
    // Các thành phần giao diện
    private javax.swing.JButton registerBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField userNameField;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JPasswordField confirmPasswordField;

    public RegistrationView() {
        initComponents();
    }

    private void initComponents() {
        // Khởi tạo các thành phần giao diện
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        userNameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        confirmPasswordField = new javax.swing.JPasswordField();
        registerBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        // Cài đặt văn bản cho các label
        jLabel1.setText("Username:");
        jLabel2.setText("Password:");
        jLabel3.setText("Confirm Password:");

        // Cài đặt sự kiện cho nút Đăng ký
        registerBtn.setText("Register");
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        // Sắp xếp các thành phần giao diện
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(userNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(confirmPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addComponent(registerBtn)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {
        // Kiểm tra xem mật khẩu và xác nhận mật khẩu có khớp không
        String username = userNameField.getText();
        String password = new String(passwordField.getPassword());
        String confirmPassword = new String(confirmPasswordField.getPassword());

        if (password.equals(confirmPassword)) {
            // Tiến hành đăng ký (ví dụ: tạo đối tượng User và lưu vào cơ sở dữ liệu)
            JOptionPane.showMessageDialog(this, "Đăng ký thành công!");
            // Có thể chuyển lại màn hình đăng nhập
            this.setVisible(false);
            new LoginView().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Mật khẩu xác nhận không khớp!");
        }
    }

    // Phương thức để thêm sự kiện cho nút đăng ký từ ngoài
    public void addRegisterListener(ActionListener listener) {
        registerBtn.addActionListener(listener);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Tạo và hiển thị cửa sổ đăng ký */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrationView().setVisible(true);
            }
        });
    }
}
