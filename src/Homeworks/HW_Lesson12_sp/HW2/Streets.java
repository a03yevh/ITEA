package Homeworks.HW_Lesson12_sp.HW2;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "streets")
@XmlType(propOrder = {"street"})
public class Streets {
    private Street street;

    @XmlElement(name = "street")
    public Street getStreet() {
        return street;
    }

    public void setStreet(Street street) {
        this.street = street;
    }
}
