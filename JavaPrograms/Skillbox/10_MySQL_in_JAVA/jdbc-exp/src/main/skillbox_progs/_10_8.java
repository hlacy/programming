package _10_sql_hibernate;

import com.sun.xml.bind.api.impl.NameConverter;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class _10_8 {
    public static void showTable(){
        StandardServiceRegistry registry = new
                StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml").build();
        Metadata metadata = new MetadataSources(registry)
                .getMetadataBuilder().build();
        SessionFactory sessionFactory = metadata
                .getSessionFactoryBuilder().build();
        Session session = sessionFactory.openSession();
        System.out.println("1");
        Transaction transaction = session.getTransaction();

        CourseForTeacher courseForTeacher = session
                .get(CourseForTeacher.class, 1);
        System.out.println(courseForTeacher.getTeacher().getName());
        System.out.println(courseForTeacher.getTeacher().getId());

        transaction.commit();
        session.close();


    }

}
