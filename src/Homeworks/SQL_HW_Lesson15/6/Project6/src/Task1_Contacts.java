import java.sql.*;

public class Task1_Contacts {
    public void start() {
        String url = "jdbc:mysql://localhost:3306/MyJoinsDB";
        String username = "root";
        String password = "12345";

        try {
            Connection connection = DriverManager.getConnection(url, username, password);

            String query = "SELECT E.FirstName, E.LastName, E.PhoneNumber, EI.Address " +
                    "FROM Employees AS E " +
                    "JOIN EmployeeInfo AS EI ON E.EmployeeID = EI.EmployeeID";

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                String firstName = resultSet.getString("FirstName");
                String lastName = resultSet.getString("LastName");
                String phoneNumber = resultSet.getString("PhoneNumber");
                String address = resultSet.getString("Address");

                System.out.println(firstName + " " + lastName + " - Phone: " + phoneNumber + ", Address: " + address);
            }

            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
