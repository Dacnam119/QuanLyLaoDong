package nhom12.oop14.entity;

import java.awt.Image;
import java.awt.Image;
import java.io.Serializable;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

 @XmlRootElement
 @XmlAccessorType(XmlAccessType.FIELD)
public class NguoiLaoDong {
    @XmlElement
    private int id;
     public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    @XmlElement
    private String hoTen;
    public String getHoTen() {
        return hoTen;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    @XmlElement
    private String gioiTinh;
      public String getGioiTinh() {
        return gioiTinh;
    }
    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    @XmlElement
    private Date ngaySinh;
        public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
   @XmlElement
    private String noiO;
   public String getNoiO() {
        return noiO;
    }
    public void setNoiO(String noiO) {
        this.noiO = noiO;
    }
   @XmlElement
    private String hoKhau;
    public String getHoKhau() {
        return hoKhau;
    }
    public void setHoKhau(String hoKhau) {
        this.hoKhau = hoKhau;
    }
   @XmlElement
    private String ngheNghiep;
    public String getNgheNghiep() {
        return ngheNghiep;
    }

    public void setNgheNghiep(String ngheNghiep) {
        this.ngheNghiep = ngheNghiep;
    }
   @XmlElement
    private String tinhTrangHonNhan;
      public String getTinhTrangHonNhan() {
        return tinhTrangHonNhan;
    }

    public void setTinhTrangHonNhan(String tinhTrangHonNhan) {
        this.tinhTrangHonNhan = tinhTrangHonNhan;
    }
   @XmlElement
    private double thuNhap;
   
    public double getThuNhap() {
        return thuNhap;
    }

    public void setThuNhap(double thuNhap) {
        this.thuNhap = thuNhap;
    }
   @XmlElement
    private Image hinhAnh;
   
    public Image getHinhAnh() {
        return hinhAnh;
    }
    
    public ImageIcon getAnhIcon() {
        if (hinhAnh != null) {
            return new ImageIcon(hinhAnh);  // Chuyển Image thành ImageIcon
        }
        return null;  // Nếu không có hình ảnh, trả về null
    }

    public void setHinhAnh(Image hinhAnh) {
        this.hinhAnh = hinhAnh;
    }



    @Override
    public String toString() {
        return "NguoiLaoDong{" + "id=" + id + ", hoTen=" + hoTen + ", gioiTinh=" + gioiTinh + ", ngaySinh=" + ngaySinh + ", noiO=" + noiO + ", hoKhau=" + hoKhau + ", ngheNghiep=" + ngheNghiep + ", tinhTrangHonNhan=" + tinhTrangHonNhan + ", thuNhap=" + thuNhap + ", hinhAnh=" + hinhAnh + '}';
    }
    
}