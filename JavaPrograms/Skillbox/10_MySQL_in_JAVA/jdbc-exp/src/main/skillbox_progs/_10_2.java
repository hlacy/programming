

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class _10_2 {
    public static void showSkillboxTable(){
        String url = "jdbc:mysql://localhost:3306/skillbox?characterEncoding=utf8";
        String user = "root";
        String password = "rootRoot";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);//this class using for connectivity to db
            Statement statement = connection.createStatement(); //this class using for SQL requests
            ResultSet resultSet = statement.executeQuery("SELECT * FROM courses");//we get result of request
//             resultSet = statement.executeQuery("SELECT * FROM courses");//we get result of request
            while (resultSet.next()){
                String courseName = resultSet.getString("name");
                System.out.println(courseName);
            }
            resultSet.close();
            statement.close();
            connection.close();
        }
        catch (Exception e){
            System.err.println("    exception");
            e.printStackTrace();
        }
    }

}
