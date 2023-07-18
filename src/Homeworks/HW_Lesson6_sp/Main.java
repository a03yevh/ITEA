package Homeworks.HW_Lesson6_sp;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Exercise 2:
        Pupil pupil1 = new ExcellentPupil();
        Pupil pupil2 = new GoodPupil();
        Pupil pupil3 = new BadPupil();
        Pupil pupil4 = new GoodPupil();

        HW2_ClassRoom classRoom = new HW2_ClassRoom(pupil1, pupil2, pupil3, pupil4);
        classRoom.printClassroomInfo();

        System.out.println("=========================================\n");

        //Exercise 3:
        Plane plane = new Plane(0.0, 1000000.0, 900.0, 2010, 10000.0, 200);
        Car car = new Car(1.0, 50000.0, 200.0, 2022, "Toyota", 4);
        Ship ship = new Ship(2.0, 2000000.0, 30.0, 2015, 500, "London");

        System.out.println("Plane:");
        System.out.println("Coordinates: " + plane.getCoordinates());
        System.out.println("Price: " + plane.getPrice());
        System.out.println("Speed: " + plane.getSpeed());
        System.out.println("Year: " + plane.getYear());
        System.out.println("Altitude: " + plane.getAltitude());
        System.out.println("Passenger Count: " + plane.getPassengerCount());

        System.out.println("\nCar:");
        System.out.println("Coordinates: " + car.getCoordinates());
        System.out.println("Price: " + car.getPrice());
        System.out.println("Speed: " + car.getSpeed());
        System.out.println("Year: " + car.getYear());
        System.out.println("Brand: " + car.getBrand());
        System.out.println("Doors: " + car.getDoors());

        System.out.println("\nShip:");
        System.out.println("Coordinates: " + ship.getCoordinates());
        System.out.println("Price: " + ship.getPrice());
        System.out.println("Speed: " + ship.getSpeed());
        System.out.println("Year: " + ship.getYear());
        System.out.println("Passenger Count: " + ship.getPassengerCount());
        System.out.println("Port of Registry: " + ship.getPortOfRegistry());

        System.out.println("\n=========================================\n");

        //Exercise 4:
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter access key number (pro/exp): ");
        String key = scanner.nextLine();

        HW4_DocumentWorker documentWorker;

        if (key.equals("pro")) {
            documentWorker = new ProDocumentWorker();
        } else if (key.equals("exp")) {
            documentWorker = new ExpertDocumentWorker();
        } else {
            documentWorker = new HW4_DocumentWorker();
        }

        documentWorker.openDocument();
        documentWorker.editDocument();
        documentWorker.saveDocument();

        System.out.println("\n=========================================\n");

        //Exercise 6:
        HW6_Printer printer = new ColoredPrinter();
        printer.print("Hello");

        System.out.println("\n=========================================\n");
    }
}
