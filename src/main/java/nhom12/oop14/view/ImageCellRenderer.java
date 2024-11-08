/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhom12.oop14.view;

/**
 *
 * @author mqhuy
 */
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;
import java.awt.image.BufferedImage;

public class ImageCellRenderer extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        if (value instanceof ImageIcon) {
            setIcon((ImageIcon) value);  // Đảm bảo là ImageIcon
        } else {
            setIcon(null);  // Nếu không phải là ImageIcon, không vẽ gì
        }
        setHorizontalAlignment(CENTER);  // Căn giữa hình ảnh
        setVerticalAlignment(CENTER);    // Căn giữa hình ảnh
        setText("");  // Đảm bảo không có văn bản bên cạnh hình ảnh
        return this;
    }
}
