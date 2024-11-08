package nhom12.oop14;

import java.awt.EventQueue;
import nhom12.oop14.controller.LoginController;
import nhom12.oop14.view.LoginView;

public class App {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                LoginView view = new LoginView();
                LoginController controller = new LoginController(view);
                // Hiển thị màn hình đăng nhập
                controller.showLoginView();
            }
        });
    }
}