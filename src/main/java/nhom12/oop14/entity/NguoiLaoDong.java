package nhom12.oop14.entity;

import java.awt.Image;
import java.awt.Image;
import java.io.Serializable;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

 @XmlRootElement(name = "employee") 
 @XmlAccessorType(XmlAccessType.FIELD)
public class NguoiLaoDong {
    @XmlElement(name = "id")
    private int id;
    @XmlElement(name = "hoTen")
    private String hoTen;
    @XmlElement(name = "gioiTinh")
    private String gioiTinh;
    @XmlElement(name = "ngaySinh")
    private Date ngaySinh;
   @XmlElement(name = "noiO")
    private String noiO;
   @XmlElement(name = "hoKhau")
    private String hoKhau;
   @XmlElement(name = "ngheNghiep")
    private String ngheNghiep;
   @XmlElement(name = "tinhTrangHonNhan")
    private String tinhTrangHonNhan;
   @XmlElement(name = "thuNhap")
    private double thuNhap;
   @XmlElement(name = "hinhAnh")
    private Image hinhAnh;

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
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public Image getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(Image hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    @Override
    public String toString() {
        return "NguoiLaoDong{" + "id=" + id + ", hoTen=" + hoTen + ", gioiTinh=" + gioiTinh + ", ngaySinh=" + ngaySinh + ", noiO=" + noiO + ", hoKhau=" + hoKhau + ", ngheNghiep=" + ngheNghiep + ", tinhTrangHonNhan=" + tinhTrangHonNhan + ", thuNhap=" + thuNhap + ", hinhAnh=" + hinhAnh + '}';
    }
    
}
