package nhom12.oop14.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        List<NguoiLaoDong> nguoiLaoDongList = dao.getDanhSach();
        view.showListNguoiLaoDong(nguoiLaoDongList);

        // Hiển thị danh sách người lao động
        view.showListNguoiLaoDong(dao.getDanhSach());

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
        List<NguoiLaoDong> nguoiLaoDongList = dao.getDanhSach();
        view.showListNguoiLaoDong(nguoiLaoDongList); // Load data before showing view
        view.setVisible(true);
    }


    class AddNguoiLaoDongListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            NguoiLaoDong nld = view.getNguoiLaoDongInfo();
            if (nld != null) {
                try {
                    dao.themNguoiLaoDong(nld);
                } catch (IOException ex) {
                    Logger.getLogger(NguoiLaoDongController.class.getName()).log(Level.SEVERE, null, ex);
                }
                view.showListNguoiLaoDong(dao.getDanhSach());
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
                try {
                    dao.capNhatNguoiLaoDong(nld);
                } catch (IOException ex) {
                    Logger.getLogger(NguoiLaoDongController.class.getName()).log(Level.SEVERE, null, ex);
                }
                view.showListNguoiLaoDong(dao.getDanhSach());
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
            try {
                if (dao.xoaNguoiLaoDong(id)) {
                    view.showListNguoiLaoDong(dao.getDanhSach());
                    view.clearNguoiLaoDongInfo();
                    view.showMessage("Xóa người lao động thành công");
                } else {
                    view.showMessage("Không tìm thấy người lao động để xóa.");
                }
            } catch (IOException ex) {
                Logger.getLogger(NguoiLaoDongController.class.getName()).log(Level.SEVERE, null, ex);
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
            try {
                dao.sapXepTheoTen();
            } catch (IOException ex) {
                Logger.getLogger(NguoiLaoDongController.class.getName()).log(Level.SEVERE, null, ex);
            }
            view.showListNguoiLaoDong(dao.getDanhSach());
        }
    }

    class SortByIncomeListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                dao.sapXepTheoThuNhap();
            } catch (IOException ex) {
                Logger.getLogger(NguoiLaoDongController.class.getName()).log(Level.SEVERE, null, ex);
            }
            view.showListNguoiLaoDong(dao.getDanhSach());
        }
    }

    class NguoiLaoDongTableSelectionListener implements ListSelectionListener {
        @Override
        public void valueChanged(ListSelectionEvent e) {
            view.fillNguoiLaoDongFromSelectedRow();
        }
    }
}