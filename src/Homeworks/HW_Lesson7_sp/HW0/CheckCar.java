package Homeworks.HW_Lesson7_sp.HW0;

class CheckCar {
    private Car fastestCar;
    private Car mostExpensiveCar;
    private Car mostPowerfulCar;

    public void addCar(Car car) {
        if (fastestCar == null || car.getSpeed() > fastestCar.getSpeed()) {
            fastestCar = car;
        }
        if (mostExpensiveCar == null || car.getPrice() > mostExpensiveCar.getPrice()) {
            mostExpensiveCar = car;
        }
        if (mostPowerfulCar == null || car.getPower() > mostPowerfulCar.getPower()) {
            mostPowerfulCar = car;
        }
    }

    public Car getFastestCar() {
        return fastestCar;
    }

    public Car getMostExpensiveCar() {
        return mostExpensiveCar;
    }

    public Car getMostPowerfulCar() {
        return mostPowerfulCar;
    }

    public void printCarInformation(Car car) {
        System.out.println("Brand: " + car.getModel());
        System.out.println("Power: " + car.getPower());
        System.out.println("Speed: " + car.getSpeed());
        System.out.println("Price: " + car.getPrice());
        System.out.println("Year: " + car.getYearOfManufacture());
        System.out.println();
    }
}
