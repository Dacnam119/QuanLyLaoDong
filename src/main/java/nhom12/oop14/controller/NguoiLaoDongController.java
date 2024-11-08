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
    private NguoiLaoDongDAO nguoiLaoDongDAO;
    private NguoiLaoDongView nguoiLaoDongView;

    public NguoiLaoDongController(NguoiLaoDongView view) {
        this.nguoiLaoDongView = view;
        nguoiLaoDongDAO = new NguoiLaoDongDAO();

        view.addAddNguoiLaoDongListener(new AddNguoiLaoDongListener());
        view.addEditNguoiLaoDongListener(new EditNguoiLaoDongListener());
        view.addDeleteNguoiLaoDongListener(new DeleteNguoiLaoDongListener());
        view.addClearListener(new ClearNguoiLaoDongListener());
        view.addSortNguoiLaoDongTenListener(new SortByNameListener());
        view.addSortNguoiLaoDongThuNhapListener(new SortByIncomeListener());
        view.addListNguoiLaoDongSelectionListener(new ListNguoiLaoDongSelectionListener());
        view.addSearchNguoiLaoDongListener(new SearchNguoiLaoDongListener());
    }

  
    public void showNguoiLaoDongView() {
        List<NguoiLaoDong> nguoiLaoDongList = nguoiLaoDongDAO.getDanhSach();
        nguoiLaoDongView.setVisible(true);
        nguoiLaoDongView.showListNguoiLaoDong(nguoiLaoDongList);
    }

    // Lớp AddNguoiLaoDongListener
    class AddNguoiLaoDongListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            NguoiLaoDong nld = nguoiLaoDongView.getNguoiLaoDongInfo();
            if (nld != null) {
                nguoiLaoDongDAO.themNguoiLaoDong(nld);
                nguoiLaoDongView.showNguoiLaoDong(nld);
                nguoiLaoDongView.showListNguoiLaoDong(nguoiLaoDongDAO.getDanhSach());
                nguoiLaoDongView.showMessage("Thêm người lao động thành công!");
            }
        }
    }

    // Lớp EditNguoiLaoDongListener
    class EditNguoiLaoDongListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            NguoiLaoDong nld = nguoiLaoDongView.getNguoiLaoDongInfo();
            if (nld != null) {
                nguoiLaoDongDAO.capNhatNguoiLaoDong(nld);
                nguoiLaoDongView.showNguoiLaoDong(nld);
                nguoiLaoDongView.showListNguoiLaoDong(nguoiLaoDongDAO.getDanhSach());
                nguoiLaoDongView.showMessage("Cập nhật người lao động thành công!");
            }
        }
    }

    // Lớp DeleteNguoiLaoDongListener
    class DeleteNguoiLaoDongListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            NguoiLaoDong nld = nguoiLaoDongView.getNguoiLaoDongInfo();
            if (nld != null) {
                if (nguoiLaoDongDAO.xoaNguoiLaoDong(nld)) {
                    nguoiLaoDongView.clearNguoiLaoDongInfo();
                    nguoiLaoDongView.showListNguoiLaoDong(nguoiLaoDongDAO.getDanhSach());
                    nguoiLaoDongView.showMessage("Xóa người lao động thành công!");
                } else {
                    nguoiLaoDongView.showMessage("Không tìm thấy người lao động!");
                }
            }
        }
    }

    // Lớp ClearNguoiLaoDongListener
    class ClearNguoiLaoDongListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            nguoiLaoDongView.clearNguoiLaoDongInfo();
        }
    }

    // Lớp SortByNameListener
    class SortByNameListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            nguoiLaoDongDAO.sapXepTheoTen();
            nguoiLaoDongView.showListNguoiLaoDong(nguoiLaoDongDAO.getDanhSach());
        }
    }

    // Lớp SortByIncomeListener
    class SortByIncomeListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            nguoiLaoDongDAO.sapXepTheoThuNhap();
            nguoiLaoDongView.showListNguoiLaoDong(nguoiLaoDongDAO.getDanhSach());
        }
    }

   class SearchNguoiLaoDongListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        String searchText = nguoiLaoDongView.getTimKiemFieldText(); // Get the search query from the view
        List<NguoiLaoDong> searchResults = nguoiLaoDongDAO.searchByName(searchText); // Call the DAO to search by name
        nguoiLaoDongView.updateNguoiLaoDongTable(searchResults); // Update the table with search results
    }
}
    
    // Lớp ListNguoiLaoDongSelectionListener
    class ListNguoiLaoDongSelectionListener implements ListSelectionListener {
        public void valueChanged(ListSelectionEvent e) {
            nguoiLaoDongView.fillNguoiLaoDongFromSelectedRow();
        }
    }
    
    
}
