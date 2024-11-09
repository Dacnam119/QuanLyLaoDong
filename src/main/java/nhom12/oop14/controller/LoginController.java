package nhom12.oop14.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import nhom12.oop14.DAO.UserDAO;
import nhom12.oop14.entity.User;
import nhom12.oop14.view.LoginView;
import nhom12.oop14.view.NguoiLaoDongView;

public class LoginController {
    private UserDAO userDAO;
    private LoginView loginView;
    private NguoiLaoDongView nguoiLaoDongView;

    public LoginController(LoginView view) {
        this.loginView = view;
        this.userDAO = new UserDAO();
        view.addLoginListener(new LoginListener());
    }

    public void showLoginView() {
        loginView.setVisible(true);
    }

    class LoginListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            User user = loginView.getUser(); // lấy thông tin user từ loginView
            if (userDAO.checkUser(user)) {
                // Nếu đăng nhập thành công, mở màn hình quản lý người lao động
                nguoiLaoDongView = new NguoiLaoDongView();
                NguoiLaoDongController nguoiLaoDongController = new NguoiLaoDongController(nguoiLaoDongView);
                nguoiLaoDongController.showNguoiLaoDongView();

                loginView.setVisible(false);
            } else {
                // Hiển thị thông báo lỗi nếu đăng nhập thất bại
                loginView.showMessage("Tên đăng nhập hoặc mật khẩu không đúng.");
            }
        }
    }
}