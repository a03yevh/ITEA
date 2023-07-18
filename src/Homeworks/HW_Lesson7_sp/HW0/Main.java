package Homeworks.HW_Lesson7_sp.HW0;

public class Main {
    public static void main(String[] args) {
        CheckCar checkCar = new CheckCar();

        Ford ford = new Ford();
        Mitsubishi mitsubishi = new Mitsubishi();
        Toyota toyota = new Toyota();
        KIA kia = new KIA();

        checkCar.addCar(ford);
        checkCar.addCar(mitsubishi);
        checkCar.addCar(toyota);
        checkCar.addCar(kia);

        Car fastestCar = checkCar.getFastestCar();
        Car mostExpensiveCar = checkCar.getMostExpensiveCar();
        Car mostPowerfulCar = checkCar.getMostPowerfulCar();

        checkCar.printCarInformation(fastestCar);
        checkCar.printCarInformation(mostExpensiveCar);
        checkCar.printCarInformation(mostPowerfulCar);
    }
}