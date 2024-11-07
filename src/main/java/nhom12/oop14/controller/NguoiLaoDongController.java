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

    
    }
}}
