package nhom12.oop14.entity;

import java.io.Serializable;
import java.util.Date;

public class NguoiLaoDong {
    private String hoTen;
    private String gioiTinh;
    private Date ngaySinh;
    private String noiO;
    private String hoKhau;
    private String ngheNghiep;
    private String tinhTrangHonNhan;
    private double thuNhap;
    private String hinhAnh;

    public NguoiLaoDong() {
    }

    public NguoiLaoDong(String hoTen, String gioiTinh, Date ngaySinh, String noiO, String hoKhau, String ngheNghiep, String tinhTrangHonNhan, double thuNhap, String hinhAnh) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.noiO = noiO;
        this.hoKhau = hoKhau;
        this.ngheNghiep = ngheNghiep;
        this.tinhTrangHonNhan = tinhTrangHonNhan;
        this.thuNhap = thuNhap;
        this.hinhAnh = hinhAnh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getNoiO() {
        return noiO;
    }

    public void setNoiO(String noiO) {
        this.noiO = noiO;
    }

    public String getHoKhau() {
        return hoKhau;
    }

    public void setHoKhau(String hoKhau) {
        this.hoKhau = hoKhau;
    }

    public String getNgheNghiep() {
        return ngheNghiep;
    }

    public void setNgheNghiep(String ngheNghiep) {
        this.ngheNghiep = ngheNghiep;
    }

    public String getTinhTrangHonNhan() {
        return tinhTrangHonNhan;
    }

    public void setTinhTrangHonNhan(String tinhTrangHonNhan) {
        this.tinhTrangHonNhan = tinhTrangHonNhan;
    }

    public double getThuNhap() {
        return thuNhap;
    }

    public void setThuNhap(double thuNhap) {
        this.thuNhap = thuNhap;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }
}
