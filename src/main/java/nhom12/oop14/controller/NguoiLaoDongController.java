package nhom12.oop14.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import nhom12.oop14.dao.NguoiLaoDongDAO;
import nhom12.oop14.entity.NguoiLaoDong;
import nhom12.oop14.view.NguoiLaoDongView;

public class NguoiLaoDongController {
    private NguoiLaoDongView view;
    private NguoiLaoDongDAO dao;

    public NguoiLaoDongController(NguoiLaoDongView view) {
        this.view = view;
        this.dao = new NguoiLaoDongDAO();
        
        // Hiển thị danh sách người lao động
        view.showListNguoiLaoDOng(dao.getDanhSach());

        // Thêm các listener cho các nút
        view.addAddNguoiLaoDongListener(new AddNguoiLaoDongListener());
        view.addEditNguoiLaoDongListener(new EditNguoiLaoDongListener());
        view.addDeleteNguoiLaoDongListener(new DeleteNguoiLaoDongListener());
        view.addClearListener(new ClearListener());
        view.addSortNguoiLaoDongTenListener(new SortByNameListener());
        view.addSortNguoiLaoDongThuNhapListener(new SortByIncomeListener());
        view.addListNguoiLaoDongSelectionListener(new NguoiLaoDongTableSelectionListener());
    }

    public void showNguoiLaoDongView() {
        view.setVisible(true);
    }

    class AddNguoiLaoDongListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            NguoiLaoDong nld = view.getNguoiLaoDongInfo();
            if (nld != null) {
                dao.themNguoiLaoDong(nld);
                view.showListNguoiLaoDOng(dao.getDanhSach());
                view.clearNguoiLaoDongInfo();
                view.showMessage("Thêm người lao động thành công");
            }
        }
    }

    class EditNguoiLaoDongListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            NguoiLaoDong nld = view.getNguoiLaoDongInfo();
            if (nld != null) {
                dao.capNhatNguoiLaoDong(nld);
                view.showListNguoiLaoDOng(dao.getDanhSach());
                view.clearNguoiLaoDongInfo();
                view.showMessage("Cập nhật người lao động thành công");
            }
        }
    }

   class DeleteNguoiLaoDongListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        String idStr = view.getSelectedNguoiLaoDongId();
        if (idStr != null) {
            int id = Integer.parseInt(idStr);
            if (dao.xoaNguoiLaoDong(id)) {
                view.showListNguoiLaoDOng(dao.getDanhSach());
                view.clearNguoiLaoDongInfo();
                view.showMessage("Xóa người lao động thành công");
            } else {
                view.showMessage("Không tìm thấy người lao động để xóa.");
            }
        } else {
            view.showMessage("Vui lòng chọn người lao động để xóa.");
        }
    }
}


    class ClearListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            view.clearNguoiLaoDongInfo();
        }
    }

    class SortByNameListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            dao.sapXepTheoTen();
            view.showListNguoiLaoDOng(dao.getDanhSach());
        }
    }

    class SortByIncomeListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            dao.sapXepTheoThuNhap();
            view.showListNguoiLaoDOng(dao.getDanhSach());
        }
    }

    class NguoiLaoDongTableSelectionListener implements ListSelectionListener {
        @Override
        public void valueChanged(ListSelectionEvent e) {
            view.fillNguoiLaoDongFromSelectedRow();
        }
    }
}