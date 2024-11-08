package nhom12.oop14.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import nhom12.oop14.entity.NguoiLaoDong;
import nhom12.oop14.entity.NguoiLaoDongXML;
import nhom12.oop14.utils.FileUtils;

public class NguoiLaoDongDAO {
    private static final String FILE_PATH = "Data.xml"; 
    private List<NguoiLaoDong> danhSach;

    public NguoiLaoDongDAO() {
        this.danhSach = readNguoiLaoDongList();
        if (danhSach == null) {
            danhSach = new ArrayList<NguoiLaoDong>();
        }
    }

    private void writeNguoiLaoDongList(List<NguoiLaoDong> nld) {
        NguoiLaoDongXML nguoiLaoDongXML = new NguoiLaoDongXML();
        nguoiLaoDongXML.setNguoiLaoDong(nld);
        FileUtils.writeXMLtoFile(FILE_PATH, nguoiLaoDongXML);
    }

   
     // Đọc danh sách người lao động từ file XML
    
    private List<NguoiLaoDong> readNguoiLaoDongList() {
        List<NguoiLaoDong> list = new ArrayList<NguoiLaoDong>();
        NguoiLaoDongXML nguoiLaoDongXML = (NguoiLaoDongXML) FileUtils.readXMLFile(
                FILE_PATH, NguoiLaoDongXML.class);
        if (nguoiLaoDongXML != null) {
            list = nguoiLaoDongXML.getNguoiLaoDong();
        }
        return list;
    }

    
     // Thêm người lao động vào danh sách và lưu vào file XML
     
    public void themNguoiLaoDong(NguoiLaoDong nld) {
        int id = 1;
        if (danhSach != null && danhSach.size() > 0) {
            id = danhSach.size() + 1;
        }
        nld.setId(id);
        danhSach.add(nld);
        writeNguoiLaoDongList(danhSach);
    }
    

  
     //Cập nhật thông tin người lao động trong danh sách và lưu vào file XML
    
    public void capNhatNguoiLaoDong(NguoiLaoDong nld) {
        for (int i = 0; i < danhSach.size(); i++) {
            if (danhSach.get(i).getId() == nld.getId()) {
                danhSach.set(i, nld);
                writeNguoiLaoDongList(danhSach);  // Fixed to pass danhSach
                break;
            }
        }
    }

   
     // Xóa người lao động khỏi danh sách và lưu lại vào file XML
    
    public boolean xoaNguoiLaoDong(NguoiLaoDong nld) {
        boolean isFound = false;
        int size = danhSach.size();
        for (int i = 0; i < size; i++) {
            if (danhSach.get(i).getId() == nld.getId()) {
                nld = danhSach.get(i);
                isFound = true;
                break;
            }
        }
        if (isFound) {
            danhSach.remove(nld);
            writeNguoiLaoDongList(danhSach);
            return true;
        }
        return false;
    }

   
     // Tìm kiếm người lao động theo tên
    
    public List<NguoiLaoDong> timNguoiLaoDongTheoTen(String hoTen) {
        List<NguoiLaoDong> ketQua = new ArrayList<>();
        for (NguoiLaoDong nld : danhSach) {
            if (nld.getHoTen().equalsIgnoreCase(hoTen)) {
                ketQua.add(nld);
            }
        }
        return ketQua;
    }

    
     // Sắp xếp người lao động theo tên
  
    public void sapXepTheoTen() {
        Collections.sort(danhSach, Comparator.comparing(NguoiLaoDong::getHoTen));
        writeNguoiLaoDongList(danhSach);
    }

    
     // Sắp xếp người lao động theo thu nhập
     
    public void sapXepTheoThuNhap() {
        danhSach.sort(Comparator.comparingDouble(NguoiLaoDong::getThuNhap));
        writeNguoiLaoDongList(danhSach);
    }

    public List<NguoiLaoDong> searchByName(String name) {
    List<NguoiLaoDong> result = new ArrayList<>();
    for (NguoiLaoDong nguoi : danhSach) {
        if (nguoi.getHoTen().toLowerCase().contains(name.toLowerCase())) {
            result.add(nguoi);
        }
    }
    return result;
}
    
    public List<NguoiLaoDong> getDanhSach() {
        return danhSach;
    }

    public void setDanhSach(List<NguoiLaoDong> danhSach) {
        this.danhSach = danhSach;
    }

    public List<NguoiLaoDong> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
