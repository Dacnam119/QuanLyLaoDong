/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhom12.oop14.controller;

/**
 *
 * @author mqhuy
 */


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import nhom12.oop14.entity.QuanLy;
import nhom12.oop14.view.LoginView;
import nhom12.oop14.dao.NguoiLaoDongDAO;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginController {
    private NguoiLaoDongDAO nguoiLaoDongDao;
    private LoginView loginView;

    public LoginController(NguoiLaoDongDAO nguoiLaoDongDao, LoginView loginView) {
        this.nguoiLaoDongDao = nguoiLaoDongDao;
        this.loginView = loginView;
    }
    
    
    
    public void showLoginView() {
        loginView.setVisible(true);
    }
    
    /**
     * Lớp LoginListener 
     * chứa cài đặt cho sự kiện click button "Login"
     * 
     * @author viettuts.vn
     */
    class LoginListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            QuanLy quanLy = loginView.getQuanLy();
            if (quanLyDAO.checkQuanLy(QuanLy)) {
                // nếu đăng nhập thành công, mở màn hình quản lý sinh viên
                studentView = new StudentView();
                StudentController studentController = new StudentController(studentView);
                studentController.showStudentView();
                loginView.setVisible(false);
            } else {
                loginView.showMessage("username hoặc password không đúng.");
            }
        }
    }
}
