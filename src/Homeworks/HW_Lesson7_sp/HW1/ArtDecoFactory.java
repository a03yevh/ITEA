package Homeworks.HW_Lesson7_sp.HW1;

public class ArtDecoFactory implements FurnitureFactory {
    public Product createProduct() {
        return new Shelf("Поличка", 1000.0);
    }

    public void createFurniture() {
        ArtDecoArmChair armChair = new ArtDecoArmChair("Чорна кора", 1340.0);
        ArtDecoSofa sofa = new ArtDecoSofa("Імпресіонізм", 7231.57);
        ArtDecoTable table = new ArtDecoTable("Класичний", 9340.0);
        Product shelf = createProduct();

        System.out.println("Ви обрали варіант: Ар-деко");
        System.out.println("Детальний опис:");
        System.out.println("Крісло - \"" + armChair.getName() + "\", " + armChair.getPrice() + " грн.");
        System.out.println("Диван - \"" + sofa.getName() + "\", " + sofa.getPrice() + " грн.");
        System.out.println("Столик - \"" + table.getName() + "\", " + table.getPrice() + " грн.");
        System.out.println("Поличка - \"" + shelf.getName() + "\", " + shelf.getPrice() + " грн.");
        System.out.println("Загальна сума: " + (armChair.getPrice() + sofa.getPrice() + table.getPrice() + shelf.getPrice()) + " грн.");
    }
}
