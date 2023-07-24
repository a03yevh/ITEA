package Homeworks.HW_Lesson12_sp.HW2;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

// Завдання 3: Використовуючи JAXB, виконати завдання №3.

public class JAXBParser {
    public static void main(String[] args) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Cities.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            File inputFile = new File("E:\\Java [Itea]\\ITEA\\src\\Homeworks\\HW_Lesson12_sp\\HW2\\input1.xml");
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            Cities cities = (Cities) unmarshaller.unmarshal(inputFile);

            Cities newCities = new Cities();
            newCities.setCities(cities.getCities());

            File outputFile = new File("E:\\Java [Itea]\\ITEA\\src\\Homeworks\\HW_Lesson12_sp\\HW2\\output1.xml");
            marshaller.marshal(newCities, outputFile);

            System.out.println("XML file successfully created.");

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
