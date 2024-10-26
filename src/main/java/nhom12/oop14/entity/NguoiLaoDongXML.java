package nhom12.oop14.entity;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "nguoiLaoDongs")
@XmlAccessorType(XmlAccessType.FIELD)
public class NguoiLaoDongXML {

    private List<NguoiLaoDong> nguoiLaoDong;

    public List<NguoiLaoDong> getNguoiLaoDong() {
        return nguoiLaoDong;
    }

    public void setNguoiLaoDong(List<NguoiLaoDong> nguoiLaoDong) {
        this.nguoiLaoDong = nguoiLaoDong;
    }
}

