package nhom12.oop14.dao;

import java.util.ArrayList;
import java.util.List;
import nhom12.oop14.entity.NguoiLaoDong;

public class NguoiLaoDongDAO {
    private List<NguoiLaoDong> danhSach;

    public NguoiLaoDongDAO() {
        this.danhSach = new ArrayList<>();
    }
    // thêm người vào danh sách
    public void themNguoiLaoDong(NguoiLaoDong nguoiLaoDong) {
        nguoiLaoDong.setId(danhSach.size() + 1);  // Gán ID tự động
        danhSach.add(nguoiLaoDong);
    }

    // Sửa thông tin dựa theo ID
    public boolean suaNguoiLaoDong(NguoiLaoDong nguoiMoi) {
        for (NguoiLaoDong nld : danhSach) {
            if (nld.getId() == nguoiMoi.getId()) {
                nld.setHoTen(nguoiMoi.getHoTen());
                nld.setGioiTinh(nguoiMoi.getGioiTinh());
                nld.setNgaySinh(nguoiMoi.getNgaySinh());
                nld.setNoiO(nguoiMoi.getNoiO());
                nld.setNgheNghiep(nguoiMoi.getNgheNghiep());
                nld.setThuNhap(nguoiMoi.getThuNhap());
                return true;
            }
        }
        return false;
    }

    // Xóa người dựa theo ID
    public boolean xoaNguoiLaoDong(int id) {
        return danhSach.removeIf(nld -> nld.getId() == id);
    }

    // Lấy tất cả người lđ trong danh sách
    public List<NguoiLaoDong> layTatCa() {
        return danhSach;
    }

    // Tìm kiếm người theo ID
    public NguoiLaoDong timNguoiLaoDongTheoId(int id) {
        for (NguoiLaoDong nld : danhSach) {
            if (nld.getId() == id) {
                return nld;
            }
        }
        return null;
    }

    
}
