public class Main {
    public static void main(String[] args) {
        System.out.println("\n==========================\n");

        Task1_Contacts contactDataQuery = new Task1_Contacts();
        contactDataQuery.start();

        System.out.println("\n==========================\n");

        Task2_BirthdaysUnmarried unmarriedEmployeesQuery = new Task2_BirthdaysUnmarried();
        unmarriedEmployeesQuery.start();

        System.out.println("\n==========================\n");

        Task3_ManagerInfo managersInfoQuery = new Task3_ManagerInfo();
        managersInfoQuery.start();

        System.out.println("\n==========================\n");
    }
}