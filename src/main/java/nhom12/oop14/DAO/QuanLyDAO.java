package nhom12.oop14.dao;

import nhom12.oop14.entity.QuanLy;

public class QuanLyDAO {
    public boolean checkQuanLy(QuanLy quanLy) {
        if (quanLy != null) {
            return "admin".equals(quanLy.getTaiKhoan()) 
                && "admin".equals(quanLy.getMatKhau());
        }
        return false;
    }
}
