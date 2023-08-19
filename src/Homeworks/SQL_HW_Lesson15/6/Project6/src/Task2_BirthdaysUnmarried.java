import java.sql.*;

public class Task2_BirthdaysUnmarried {
    public void start() {
        String url = "jdbc:mysql://localhost:3306/MyJoinsDB";
        String username = "root";
        String password = "12345";

        try {
            Connection connection = DriverManager.getConnection(url, username, password);

            String query = "SELECT E.FirstName, E.LastName, EI.BirthDate, E.PhoneNumber " +
                    "FROM Employees AS E " +
                    "JOIN EmployeeInfo AS EI ON E.EmployeeID = EI.EmployeeID " +
                    "WHERE EI.MaritalStatus = 'Неодружений' OR EI.MaritalStatus = 'Неодружена'";

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                String firstName = resultSet.getString("FirstName");
                String lastName = resultSet.getString("LastName");
                Date birthDate = resultSet.getDate("BirthDate");
                String phoneNumber = resultSet.getString("PhoneNumber");

                System.out.println(firstName + " " + lastName + " - Birthdate: " + birthDate + ", Phone: " + phoneNumber);
            }

            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
