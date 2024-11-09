package nhom12.oop14.utils;

import java.io.File;
import java.io.IOException;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class FileUtils {

    // Ghi đối tượng vào file XML
  public static void writeXMLtoFile(String filePath, Object object) throws IOException {
    try {
        // Sử dụng đường dẫn tương đối
        File file = new File(filePath);
        // Nếu file không tồn tại, tạo mới file
        if (!file.exists()) {
            file.createNewFile();
        }

        JAXBContext context = JAXBContext.newInstance(object.getClass());
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        marshaller.marshal(object, file);
    } catch (JAXBException | IOException e) {
        e.printStackTrace();
    }
}


    // Đọc đối tượng từ file XML
   public static Object readXMLFile(String filePath, Class<?> clazz) {
    try {
        // Sử dụng đường dẫn tương đối
        File file = new File(filePath);
        if (!file.exists()) {
            System.out.println("File không tồn tại: " + filePath);
            return null;
        }

        JAXBContext context = JAXBContext.newInstance(clazz);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        return unmarshaller.unmarshal(file);
    } catch (JAXBException e) {
        e.printStackTrace();
    }
    return null;
}

}
