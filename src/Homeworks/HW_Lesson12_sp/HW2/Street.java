package Homeworks.HW_Lesson12_sp.HW2;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "street")
@XmlType(propOrder = {"name", "buildings"})
public class Street {
    private String name;
    private Buildings buildings;

    @XmlElement(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name = "buildings")
    public Buildings getBuildings() {
        return buildings;
    }

    public void setBuildings(Buildings buildings) {
        this.buildings = buildings;
    }
}