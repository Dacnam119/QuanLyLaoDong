package nhom12.oop14.utils;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class FileUtils {

    /**
     * Chuyển đổi đối tượng object về định dạng XML
     * Sau đó lưu vào file có tên fileName
     * 
     * @param fileName Tên file XML cần lưu
     * @param object Đối tượng cần chuyển đổi và lưu
     */
    public static void writeXMLtoFile(String fileName, Object object) {
        try {
            // Tạo đối tượng JAXB Context từ lớp của đối tượng
            JAXBContext jaxbContext = JAXBContext.newInstance(object.getClass());
            // Tạo đối tượng Marshaller để chuyển đổi đối tượng thành XML
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            // Định dạng XML cho dễ đọc
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            
            // Tạo đối tượng File để lưu nội dung XML
            File xmlFile = new File(fileName);
            // Kiểm tra xem file có tồn tại không, nếu tồn tại thì xóa để ghi mới
            if (xmlFile.exists()) {
                xmlFile.delete();
            }
            // Lưu đối tượng vào file XML
            jaxbMarshaller.marshal(object, xmlFile);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    /**
     * Đọc nội dung từ file XML và chuyển đổi thành đối tượng của lớp clazz
     * 
     * @param fileName Tên file XML cần đọc
     * @param clazz Lớp đối tượng cần chuyển đổi từ file XML
     * @return Đối tượng đã chuyển đổi từ file XML
     */
    public static Object readXMLFile(String fileName, Class<?> clazz) {
        try {
            File xmlFile = new File(fileName);
            // Kiểm tra nếu file không tồn tại thì trả về null
            if (!xmlFile.exists()) {
                System.out.println("File không tồn tại!");
                return null;
            }

            // Tạo đối tượng JAXBContext từ lớp clazz
            JAXBContext jaxbContext = JAXBContext.newInstance(clazz);
            // Tạo đối tượng Unmarshaller để chuyển đổi XML thành đối tượng
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            // Trả về đối tượng đã chuyển đổi từ file XML
            return jaxbUnmarshaller.unmarshal(xmlFile);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }
}
