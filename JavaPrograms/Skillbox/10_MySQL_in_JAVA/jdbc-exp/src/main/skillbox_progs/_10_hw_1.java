
import com.mysql.cj.jdbc.ConnectionImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class _10_hw_1 {
    public static void showTable( ){
        String url = "jdbc:mysql://localhost:3306/skillbox?characterEncoding=utf8";
        String name = "root";
        String pass = "rootRoot";
        try{
            Connection connection = DriverManager.getConnection(url, name, pass);
            Statement statement = connection.createStatement();
//            ResultSet resultSet = statement.executeQuery("SELECT course_name FROM purchaselist ");
            ResultSet resultSet = statement.executeQuery("SELECT course_name, " +
                    "COUNT(*) / (MAX(month(subscription_date)) - " +
                    "MIN(month(subscription_date)) + 1) " +
                    "AS count_course_name FROM purchaselist " +
                    "WHERE YEAR(subscription_date) = 2018 GROUP " +
                    "BY course_name");
            while (resultSet.next()){
                String courseName = resultSet.getString("course_name");
                String avg = resultSet.getString("count_course_name");
                System.out.println(courseName + " - " + avg);
            }
            resultSet.close();
            statement.close();
            connection.close();
        }

        catch (Exception e){
            System.err.println("\n\t\tException\n");
            e.printStackTrace();
        }
        System.out.println("END");
    }
}
