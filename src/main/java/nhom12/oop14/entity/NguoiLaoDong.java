package nhom12.oop14.entity;

import java.awt.Image;
import java.io.Serializable;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "nguoiLaoDong")
@XmlAccessorType(XmlAccessType.FIELD)
public class NguoiLaoDong implements Serializable {

    private static final long serialVersionUID = 1L;
    private String hoTen;
    private String gioiTinh;
    private Date ngaySinh;
    private String noiO;
    private String hoKhau;
    private String ngheNghiep;
    private String tinhTrangHonNhan;
    private double thuNhap;
    private Image hinhAnh;
    private int Id;

    public NguoiLaoDong() {
    }

    public NguoiLaoDong(String hoTen, String gioiTinh, Date ngaySinh, String noiO, String hoKhau, String ngheNghiep, String tinhTrangHonNhan, double thuNhap, Image hinhAnh, int Id) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.noiO = noiO;
        this.hoKhau = hoKhau;
        this.ngheNghiep = ngheNghiep;
        this.tinhTrangHonNhan = tinhTrangHonNhan;
        this.thuNhap = thuNhap;
        this.hinhAnh = hinhAnh;
        this.Id = Id;
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
    
    public Image getHinhAnh() {
        return hinhAnh;  // Trả về đối tượng Image
    }

    public ImageIcon getIconHinhAnh() {
        if (hinhAnh != null) {
            return new ImageIcon(hinhAnh);  // Chuyển Image thành ImageIcon
        }
        return null;  // Nếu không có hình ảnh, trả về null
    }

    public void setHinhAnh(Image hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

}
