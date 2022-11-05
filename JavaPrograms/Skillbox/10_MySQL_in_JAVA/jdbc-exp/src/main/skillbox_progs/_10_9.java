package _10_sql_hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import javax.sound.midi.Soundbank;
import java.net.ServerSocket;
import java.util.List;

public class _10_9 {
    public static void showTable(){
        StandardServiceRegistry registry = new
                StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml").build();
        Metadata metadata = new MetadataSources(registry)
                .getMetadataBuilder().build();
        SessionFactory sessionFactory = metadata
                .getSessionFactoryBuilder().build();

        Session session  =  sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        CourseForTeacher courseForTeacher = session.get(CourseForTeacher.class
                , 1);
        System.out.println(courseForTeacher.getName().toString());

        List<Student> studentList = courseForTeacher.getStudents();

        System.out.println(courseForTeacher.getStudents().size());
        for(Student student : studentList)
            System.out.println(student.getName() + student.getRegistrationDate());

        transaction.commit();
        sessionFactory.close();
    }
}
