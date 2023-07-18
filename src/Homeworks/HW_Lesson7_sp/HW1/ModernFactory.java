package Homeworks.HW_Lesson7_sp.HW1;

public class ModernFactory implements FurnitureFactory {
    public Product createProduct() {
        return new Shelf("Поличка", 1000.0);
    }
    public void createFurniture() {
        ModernArmChair armChair = new ModernArmChair("Стар шіп", 1340.0);
        ModernSofa sofa = new ModernSofa("Гіпер портал", 5340.17);
        ModernTable table = new ModernTable("Пульт керування", 4340.0);
        Product shelf = createProduct();

        System.out.println("Ви обрали варіант: Модерн");
        System.out.println("Детальний опис:");
        System.out.println("Крісло - \"" + armChair.getName() + "\", " + armChair.getPrice() + " грн.");
        System.out.println("Диван - \"" + sofa.getName() + "\", " + sofa.getPrice() + " грн.");
        System.out.println("Столик - \"" + table.getName() + "\", " + table.getPrice() + " грн.");
        System.out.println("Поличка - \"" + shelf.getName() + "\", " + shelf.getPrice() + " грн.");
        System.out.println("Загальна сума: " + (armChair.getPrice() + sofa.getPrice() + table.getPrice() + shelf.getPrice()) + " грн.");
    }
}
