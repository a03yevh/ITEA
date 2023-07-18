package Homeworks.HW_Lesson12_sp.HW2;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlRootElement(name = "cities")
@XmlType(propOrder = {"cities"})
public class Cities {
    private List<City> cities;

    @XmlElement(name = "city")
    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }
}
