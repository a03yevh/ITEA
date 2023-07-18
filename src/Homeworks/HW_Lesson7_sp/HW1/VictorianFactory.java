package Homeworks.HW_Lesson7_sp.HW1;

public class VictorianFactory implements FurnitureFactory {
    public Product createProduct() {
        return new Shelf("Поличка", 1000.0);
    }
    public void createFurniture() {
        VictorianArmChair armChair = new VictorianArmChair("Тиха гавань", 2340.0);
        VictorianSofa sofa = new VictorianSofa("Мудрість віків", 7340.57);
        VictorianTable table = new VictorianTable("Місце роздумів", 4340.0);
        Product shelf = createProduct();

        System.out.println("Ви обрали варіант: Вікторіанській");
        System.out.println("Детальний опис:");
        System.out.println("Крісло - \"" + armChair.getName() + "\", " + armChair.getPrice() + " грн.");
        System.out.println("Диван - \"" + sofa.getName() + "\", " + sofa.getPrice() + " грн.");
        System.out.println("Столик - \"" + table.getName() + "\", " + table.getPrice() + " грн.");
        System.out.println("Поличка - \"" + shelf.getName() + "\", " + shelf.getPrice() + " грн.");
        System.out.println("Загальна сума: " + (armChair.getPrice() + sofa.getPrice() + table.getPrice() + shelf.getPrice()) + " грн.");
    }
}