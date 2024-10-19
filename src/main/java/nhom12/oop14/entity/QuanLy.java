package nhom12.oop14.entity;

import java.io.Serializable;

public class QuanLy implements Serializable {
    private String taiKhoan;
    private String matKhau;

    public QuanLy() {
    }
    public QuanLy(String taiKhoan, String matKhau) {
        this.taiKhoan = taiKhoan;
        this.matKhau = matKhau;
    }

    public String getTaiKhoan() {
        return taiKhoan;
    }

    public void setTaiKhoan(String taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }
    
}

