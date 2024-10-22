package nhom12.oop14.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.Collections;
import nhom12.oop14.entity.NguoiLaoDong;

public class NguoiLaoDongDAO {
    private List<NguoiLaoDong> danhSach;

    public NguoiLaoDongDAO() {
        this.danhSach = new ArrayList<>();
    }

    // Thêm nlđ vào danh sách
    public void themNguoiLaoDong(NguoiLaoDong nld) {
        int id = danhSach.size() + 1;
        nld.setId(id);
        danhSach.add(nld);
    }

    // Cập nhật thông tin nlđ
    public void capNhatNguoiLaoDong(NguoiLaoDong nld) {
        for (int i = 0; i < danhSach.size(); i++) {
            if (danhSach.get(i).getId() == nld.getId()) {
                danhSach.set(i, nld);
                break;
            }
        }
    }

    // Xóa nlđ khỏi danh sách
    public boolean xoaNguoiLaoDong(int id) {
        return danhSach.removeIf(nld -> nld.getId() == id);
    }

    // Tìm kiếm nlđ theo tên
    public List<NguoiLaoDong> timNguoiLaoDongTheoTen(String hoTen) {
        List<NguoiLaoDong> ketQua = new ArrayList<>();
        for (NguoiLaoDong nld : danhSach) {
            if (nld.getHoTen().equalsIgnoreCase(hoTen)) {
                ketQua.add(nld);
            }
        }
        return ketQua;
    }

    // Sắp xếp nlđ theo tên
    public void sapXepTheoTen() {
        Collections.sort(danhSach, Comparator.comparing(NguoiLaoDong::getHoTen));
    }

    // Sắp xếp nlđ theo thu nhập
    public void sapXepTheoThuNhap() {
        danhSach.sort(Comparator.comparingDouble(NguoiLaoDong::getThuNhap));
    }

    public List<NguoiLaoDong> getDanhSach() {
        return danhSach;
    }

    public void setDanhSach(List<NguoiLaoDong> danhSach) {
        this.danhSach = danhSach;
    }
}