

import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class _10_3 {
    public static void showSkillboxTable(){
        String url = "jdbc:mysql://localhost:3306/skillbox?characterEncoding=utf8";
        String user = "root";
        String password = "rootRoot";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);//this class using for connectivity to db
            Statement statement = connection.createStatement(); //this class using for SQL requests
            ResultSet resultSet = statement.executeQuery("SELECT * FROM courses");//we create request of request
            while (resultSet.next()){
                String courseName = resultSet.getString("name");
                String coursePrice = resultSet.getString("price");
                String coursePricePerHour = resultSet.getString("price_per_hour");
                int coursePriceInt = Integer.parseInt(coursePrice);//transform to int
                double coursePricePerHourDouble = Double.parseDouble(coursePricePerHour);//transform to double
                System.out.format("%s - %.2f\n" , courseName, (double)coursePriceInt / coursePricePerHourDouble);
            }
            resultSet.close();
            statement.close();
            connection.close();
        }
        catch (Exception e){
            System.err.println("    exception");
            e.printStackTrace();
        }
        System.out.println("\n\n\n\tEND");
    }
}
