package nhom12.oop14.entity;

import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "employees")
public class NguoiLaoDongXML {

    private List<NguoiLaoDong> nguoiLaoDong;

    @XmlElement(name = "employee")
    public List<NguoiLaoDong> getNguoiLaoDong() {
        return nguoiLaoDong;
    }
    public void setNguoiLaoDong(List<NguoiLaoDong> nguoiLaoDong) {
        this.nguoiLaoDong = nguoiLaoDong;
    }
    public void getNguoiLaoDong(List<NguoiLaoDong> nguoiLaoDong) {
        this.nguoiLaoDong = nguoiLaoDong;
    }
}
