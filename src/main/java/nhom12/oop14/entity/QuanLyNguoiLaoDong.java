package nhom12.oop14.entity;

import java.util.*;
import java.util.stream.Collectors;

public class QuanLyNguoiLaoDong {
    private List<NguoiLaoDong> danhSach;

    public QuanLyNguoiLaoDong() {
        danhSach = new ArrayList<>();
    }

    public void themNguoiLaoDong(NguoiLaoDong nguoiLaoDong) {
        danhSach.add(nguoiLaoDong);
    }

    public void xoaNguoiLaoDong(String hoTen) {
        danhSach.removeIf(nguoiLaoDong -> nguoiLaoDong.getHoTen().equals(hoTen));
    }

    public List<NguoiLaoDong> timKiemNguoiLaoDong(String tuKhoa) {
        return danhSach.stream()
                .filter(nld -> nld.getHoTen().toLowerCase().contains(tuKhoa.toLowerCase()))
                .collect(Collectors.toList());
    }

    // Lọc người lao động trong độ tuổi từ 18 đến 60
    public List<NguoiLaoDong> locNguoiLaoDongTheoDoTuoi() {
        return danhSach.stream()
                .filter(nld -> {
                    int tuoi = tinhTuoi(nld.getNgaySinh());
                    return tuoi >= 18 && tuoi <= 60;
                })
                .collect(Collectors.toList());
    }

    // Sắp xếp danh sách theo thu nhập (tăng dần)
    public List<NguoiLaoDong> sapXepTheoThuNhap(boolean tangDan) {
        return danhSach.stream()
                .sorted((nld1, nld2) -> {
                    return tangDan ? Double.compare(nld1.getThuNhap(), nld2.getThuNhap())
                                   : Double.compare(nld2.getThuNhap(), nld1.getThuNhap());
                })
                .collect(Collectors.toList());
    }

    // Tính tổng thu nhập của tất cả người lao động
    public double tinhTongThuNhap() {
        return danhSach.stream()
                .mapToDouble(NguoiLaoDong::getThuNhap)
                .sum();
    }

    // Tìm kiếm người lao động theo nghề nghiệp
    public List<NguoiLaoDong> timKiemTheoNgheNghiep(String ngheNghiep) {
        return danhSach.stream()
                .filter(nld -> nld.getNgheNghiep().equalsIgnoreCase(ngheNghiep))
                .collect(Collectors.toList());
    }

    // Tính tuổi dựa trên ngày sinh
    private int tinhTuoi(Date ngaySinh) {
        Calendar dob = Calendar.getInstance();
        dob.setTime(ngaySinh);
        Calendar now = Calendar.getInstance();
        int tuoi = now.get(Calendar.YEAR) - dob.get(Calendar.YEAR);
        if (now.get(Calendar.DAY_OF_YEAR) < dob.get(Calendar.DAY_OF_YEAR)) {
            tuoi--;
        }
        return tuoi;
    }

    public List<NguoiLaoDong> getDanhSach() {
        return danhSach;
    }
}
