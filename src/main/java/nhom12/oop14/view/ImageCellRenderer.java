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
   public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        // Kiểm tra xem giá trị có phải là ImageIcon hay không
        if (value instanceof ImageIcon) {
            ImageIcon originalIcon = (ImageIcon) value;
            int rowHeight = table.getRowHeight();  // Lấy chiều cao của hàng
            int colWidth = table.getColumnModel().getColumn(column).getWidth();  // Lấy chiều rộng của cột

            // Tạo hình ảnh thu nhỏ để vừa với ô
            Image scaledImage = originalIcon.getImage().getScaledInstance(colWidth - 10, rowHeight - 10, Image.SCALE_SMOOTH);
            setIcon(new ImageIcon(scaledImage));
        } else {
            setIcon(null);
        }

        setHorizontalAlignment(CENTER);
        setVerticalAlignment(CENTER);
        setText("");  // Xóa bất kỳ văn bản nào trong ô
        return this;
    }
}
