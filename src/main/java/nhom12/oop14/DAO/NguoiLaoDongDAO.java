package nhom12.oop14.DAO;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import nhom12.oop14.entity.NguoiLaoDong;
import nhom12.oop14.entity.NguoiLaoDongXML;
import nhom12.oop14.utils.FileUtils;

public class NguoiLaoDongDAO {

    private static final String FILE_PATH = "Data.xml"; // Đường dẫn đến file XML
    private List<NguoiLaoDong> danhSach;

    // Khởi tạo danh sách người lao động từ file XML
    public NguoiLaoDongDAO() {
        this.danhSach = readNguoiLaoDongList(); // Đọc danh sách từ file XML
        if (danhSach == null) {
            danhSach = new ArrayList<>(); // Nếu không có dữ liệu, khởi tạo danh sách trống
        } else {
            System.out.println("Danh sách người lao động từ file XML:");
            System.out.println(danhSach.size() + " người lao động");
            for (NguoiLaoDong nld : danhSach) {
                // System.out.println(nld); // In từng người lao động để kiểm tra
                System.out.println(nld.toString());
            }
        }
    }

    private List<NguoiLaoDong> readNguoiLaoDongList() {
        System.out.println("0");
        try {
            JAXBContext context = JAXBContext.newInstance(NguoiLaoDongXML.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            NguoiLaoDongXML nguoiLaoDongXML = (NguoiLaoDongXML) unmarshaller.unmarshal(new File(FILE_PATH));
            if (nguoiLaoDongXML != null) {
                danhSach = nguoiLaoDongXML.getNguoiLaoDong();
                return danhSach;
            }
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return new ArrayList<>(); // Empty list if no data is read
    }

    // Ghi danh sách người lao động vào file XML
    private void writeNguoiLaoDongList() throws IOException {
        NguoiLaoDongXML nguoiLaoDongXML = new NguoiLaoDongXML();
        nguoiLaoDongXML.setNguoiLaoDong(danhSach);
        FileUtils.writeXMLtoFile(FILE_PATH, nguoiLaoDongXML);
    }

    public List<NguoiLaoDong> getDanhSach() {
        return danhSach;
    }

    // Thêm người lao động vào danh sách và lưu vào file XML
    public void themNguoiLaoDong(NguoiLaoDong nld) throws IOException {
        int id = danhSach.size() + 1;
        nld.setId(id);
        danhSach.add(nld);
        writeNguoiLaoDongList(); // Ghi lại vào file XML sau khi thêm
    }

    // Cập nhật thông tin người lao động
    public void capNhatNguoiLaoDong(NguoiLaoDong nld) throws IOException {
        for (int i = 0; i < danhSach.size(); i++) {
            if (danhSach.get(i).getId() == nld.getId()) {
                danhSach.set(i, nld);
                writeNguoiLaoDongList(); // Ghi lại vào file XML sau khi cập nhật
                break;
            }
        }
    }

    // Xóa người lao động theo ID và lưu vào file XML nếu có thay đổi
    public boolean xoaNguoiLaoDong(int id) throws IOException {
        boolean isRemoved = danhSach.removeIf(nld -> nld.getId() == id);
        if (isRemoved) {
            writeNguoiLaoDongList(); // Ghi lại vào file XML sau khi xóa
        }
        return isRemoved;
    }

    // Tìm kiếm người lao động theo tên
    public List<NguoiLaoDong> searchByName(String name) {
        List<NguoiLaoDong> result = new ArrayList<>();
        for (NguoiLaoDong nguoi : danhSach) {
            if (nguoi.getHoTen().toLowerCase().contains(name.toLowerCase())) {
                result.add(nguoi);
            }
        }
        return result;
    }

    // Sắp xếp người lao động theo tên
    public void sapXepTheoTen() throws IOException {
        Collections.sort(danhSach, Comparator.comparing(NguoiLaoDong::getHoTen));
        writeNguoiLaoDongList(); // Ghi lại vào file XML sau khi sắp xếp
    }

    // Sắp xếp người lao động theo thu nhập
    public void sapXepTheoThuNhap() throws IOException {
        danhSach.sort(Comparator.comparingDouble(NguoiLaoDong::getThuNhap));
        writeNguoiLaoDongList(); // Ghi lại vào file XML sau khi sắp xếp
    }

    // Đặt danh sách người lao động
    public void setDanhSach(List<NguoiLaoDong> danhSach) {
        this.danhSach = danhSach;
    }
}
