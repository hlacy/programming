

import java.sql.*;

public class _10_hw_1_internet {
    static final String URL = "jdbc:mysql://localhost:3306/skillbox";
    static final String NAME = "root";
    static final String PASSWORD = "rootRoot";
    static final String SQL =
            "SELECT course_name, COUNT(*) / (MAX(month(subscription_date)) - " +
                    "MIN(month(subscription_date)) + 1) AS avg "
                    + "FROM purchaselist "
                    + "WHERE YEAR (subscription_date) = ? "
                    + "GROUP BY course_name;";


    public static void showTable(){

            try
            {
                Connection connection = DriverManager.getConnection(URL, NAME, PASSWORD);
                PreparedStatement preparedStatement = connection.prepareStatement(SQL);
                preparedStatement.setInt(1, 2018);
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    String courseName = resultSet.getString("course_name");
                    String avgValue = resultSet.getString("avg");
                    System.out.println(courseName + " - " + avgValue);
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }

