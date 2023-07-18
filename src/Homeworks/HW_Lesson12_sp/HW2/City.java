package Homeworks.HW_Lesson12_sp.HW2;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "city")
@XmlType(propOrder = {"name", "streets"})
public class City {
    private String name;
    private String size;
    private Streets streets;

    @XmlElement(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlAttribute(name = "size")
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @XmlElement(name = "streets")
    public Streets getStreets() {
        return streets;
    }

    public void setStreets(Streets streets) {
        this.streets = streets;
    }
}