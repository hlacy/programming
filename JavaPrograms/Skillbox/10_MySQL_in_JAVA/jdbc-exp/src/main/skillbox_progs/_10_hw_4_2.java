import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.event.spi.SaveOrUpdateEvent;
import org.hibernate.mapping.PrimaryKey;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.Queue;

public class _10_hw_4_2 {
    public static void createTable() {
        String url = "jdbc:mysql://localhost:3306/skillbox?characterEncoding=utf8";
        String user = "root";
        String password = "rootRoot";
        try {
            System.out.println("Creating of a table...");
            Connection connection = DriverManager.getConnection(url, user, password);//this class using for connectivity to db
            Statement statement = connection.createStatement(); //this class using for SQL requests
            statement.executeUpdate("CREATE TABLE IF NOT EXISTS" +
                    " linked_purchase_list " +
                    "(student_id INT PRIMARY KEY, " +
                    "course_id INT)");//we get result of request

//            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            System.err.println("    exception");
            e.printStackTrace();
        }
        System.out.println("Creating od a table is completed successfully");
    }

    public static void dropTable(){
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml").build();
        Metadata metadata = new MetadataSources(registry)
                .getMetadataBuilder().build();
        SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        String str = LinkedPurchaseList.class.toString();
        System.out.println(str);

        String sql = "DROP TABLE IF EXISTS linked_purchase_list";

        Query query = session.createSQLQuery(sql);

        query.executeUpdate();
        transaction.commit();
        session.close();

    }

    public static void changeTableStudent(){
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml").build();
        Metadata metadata = new MetadataSources(registry).getMetadataBuilder().build();
        SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();
        for (int i = 1; i <= 100; i++) {
            Student student = session.get(Student.class, i);
            student.setName("| id " + i + " |");
            session.save(student);
        }


        transaction.commit();
        session.close();
    }
    public static void changeTableCourse(){
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml").build();
        Metadata metadata = new MetadataSources(registry).getMetadataBuilder().build();
        SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();
//        for (int i = 1; i <= 46; i++) {
//            CourseForTeacher courseForTeacher = session.get(CourseForTeacher.class, i);
//            courseForTeacher.setName("| Course id " + i + " |");
//            session.save(courseForTeacher);
//        }
        CourseForTeacher courseForTeacher = session.get(CourseForTeacher.class, 54);//deleting
        session.delete(courseForTeacher);//deleting
        session.save(courseForTeacher);
        transaction.commit();
        session.close();
    }



    public static void fillTable(){
       StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml").build();
       Metadata metadata = new MetadataSources(registry)
                .getMetadataBuilder().build();
       SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
       Session session = sessionFactory.openSession();

       CriteriaBuilder builder = session.getCriteriaBuilder();//this class uses for difficult queries
       CriteriaQuery<Student> queryStudent = builder.createQuery(Student.class);
       Root<Student> root = queryStudent.from(Student.class);//this expression looks like operator FROM in SQL
        queryStudent.select(root);//SELECT operator in SQL
       List<Student> studentList = session.createQuery(queryStudent).getResultList();

       Transaction transaction = session.beginTransaction();

       for (Student student: studentList) {
           System.out.print(student.getId() + " ");
           String hql = "FROM " + PurchaseList.class.getSimpleName() + " WHERE student_name = " + student.getName();// HQL

           List<PurchaseList> purchaseListList = session.createQuery(hql).getResultList();// get names of courses

            /*теперь надо эти id запихнуть в linkedCourseList*/
           for(PurchaseList purchaseList: purchaseListList) {

               String hql2 = "FROM " + CourseForTeacher.class.getSimpleName()
                       + " WHERE name = " + purchaseList.getCourseName();
               List<CourseForTeacher>  courseForTeacherList= session.createQuery(hql2)
                       .setMaxResults(1).getResultList();

               for(CourseForTeacher courseForTeacher: courseForTeacherList) {
                   Query queryLinked = session.createSQLQuery("INSERT INTO linked_purchase_list" +
                           " (student_id,course_id) VALUES (" +
                           student.getId() + "," + courseForTeacher.getId() + ");");
                   queryLinked.executeUpdate();
                   System.out.print(purchaseList.getCourseName() + " ");
               }
           }
       }

       transaction.commit();
       session.close();
    }
}
