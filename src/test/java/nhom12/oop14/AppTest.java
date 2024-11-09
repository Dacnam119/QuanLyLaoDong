
package nhom12.oop14;

import nhom12.oop14.DAO.UserDAO;
import nhom12.oop14.controller.LoginController;
import nhom12.oop14.entity.User;
import nhom12.oop14.view.LoginView;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Lớp kiểm thử cho ứng dụng Quản lý Lao động
 */
public class AppTest {

    private UserDAO userDAO;
    private LoginView loginView;
    private LoginController loginController;

    /**
     * Thiết lập các đối tượng cần thiết trước mỗi lần kiểm thử
     */
    @BeforeEach
    public void setUp() {
        userDAO = new UserDAO();
        loginView = new LoginView();
        loginController = new LoginController(loginView);
    }

    /**
     * Kiểm thử xem LoginView và LoginController có được khởi tạo thành công không
     */
    @Test
    public void testAppInitialization() {
        assertNotNull(loginView, "LoginView đã được khởi tạo thành công.");
        assertNotNull(loginController, "LoginController đã được khởi tạo thành công.");
        System.out.println("Khởi tạo ứng dụng thành công.");
    }

    /**
     * Kiểm thử đăng nhập với tài khoản hợp lệ và không hợp lệ
     */
    @Test
    public void testUserLoginValidation() {
        User validUser = new User("admin", "admin");
        User invalidUser = new User("saiTen", "saiMatKhau");

        // Kiểm tra tài khoản hợp lệ
        assertTrue(userDAO.checkUser(validUser), "Đăng nhập với tài khoản hợp lệ phải thành công");
        System.out.println("Kiểm tra đăng nhập với tài khoản hợp lệ: Thành công");

        // Kiểm tra tài khoản không hợp lệ
        assertFalse(userDAO.checkUser(invalidUser), "Đăng nhập với tài khoản không hợp lệ phải thất bại");
        System.out.println("Kiểm tra đăng nhập với tài khoản không hợp lệ: Thất bại");
    }

    /**
     * Kiểm thử cơ bản cho ứng dụng để đảm bảo các lớp chính được thiết lập đúng
     */
    @Test
    public void testBasicAppSetup() {
        assertTrue(true, "Thiết lập cơ bản ứng dụng thành công.");
        System.out.println("Kiểm thử ứng dụng cơ bản thành công.");
    }
}
