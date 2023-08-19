import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/test123";
        String username = "root";
        String password = "12345";

        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
            String selectQuery = "SELECT * FROM Users";
            try (Statement statement = connection.createStatement()) {
                ResultSet resultSet = statement.executeQuery(selectQuery);
                while (resultSet.next()) {
                    int userId = resultSet.getInt("user_id");
                    String username2 = resultSet.getString("username");
                    String email = resultSet.getString("email");
                    System.out.println("User ID: " + userId + ", Username: " + username2 + ", Email: " + email);
                }
            }

            String updateQuery = "UPDATE Users SET username = 'oleksandr_2' WHERE user_id = 1";
            try (Statement statement = connection.createStatement()) {
                int rowsAffected = statement.executeUpdate(updateQuery);
                System.out.println(rowsAffected + " row(s) updated.");
            }

            String deleteQuery = "DELETE FROM Orders WHERE order_id = 2";
            try (Statement statement = connection.createStatement()) {
                int rowsAffected = statement.executeUpdate(deleteQuery);
                System.out.println(rowsAffected + " row(s) deleted.");
            }

            String insertQuery = "INSERT INTO Users (user_id, username, email) VALUES (16, 'Nikita', 'nikita@gmail.com')";
            try (Statement statement = connection.createStatement()) {
                int rowsAffected = statement.executeUpdate(insertQuery);
                System.out.println(rowsAffected + " row(s) inserted.");
            }

            String dropTableQuery = "DROP TABLE Orders";
            try (Statement statement = connection.createStatement()) {
                statement.executeUpdate(dropTableQuery);
                System.out.println("Table 'Orders' dropped.");
            }

            String truncateTableQuery = "TRUNCATE TABLE Users";
            try (Statement statement = connection.createStatement()) {
                statement.executeUpdate(truncateTableQuery);
                System.out.println("Table 'Users' truncated.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
