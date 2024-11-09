package nhom12.oop14.DAO;

import nhom12.oop14.entity.User;

public class UserDAO {
    public boolean checkUser(User user) {
        if (user != null) {
            return "admin".equals(user.getTaiKhoan()) 
                && "admin".equals(user.getMatKhau());
        }
        return false;
    }
}
