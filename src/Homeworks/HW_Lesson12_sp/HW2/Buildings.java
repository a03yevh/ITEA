package Homeworks.HW_Lesson12_sp.HW2;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlRootElement(name = "buildings")
@XmlType(propOrder = {"building"})
public class Buildings {
    private List<String> building;

    @XmlElement(name = "building")
    public List<String> getBuilding() {
        return building;
    }

    public void setBuilding(List<String> building) {
        this.building = building;
    }
}