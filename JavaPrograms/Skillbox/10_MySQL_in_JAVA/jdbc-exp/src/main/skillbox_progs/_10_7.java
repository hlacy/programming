package _10_sql_hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.Service;
import org.hibernate.service.ServiceRegistry;

public class _10_7 {
    public static void showTable(){
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata metadata = new MetadataSources(registry).getMetadataBuilder().build();
        SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();



//        Course course = new Course();//creating new element of a table(new entry
//                                      //in table has id = 48)
//        course.setName("New course");//creating new element
        //course.setType(CourseType.BUSINESS);//creating new element
        // course.setTeachersId(1);//creating new element
       //Course course = session.get(Course.class, 48);//changing of real entry in
                                                        // table(we chose id = 48)
        //course.setName("the Newestklkook course");//changing of real
        Course course = session.get(Course.class, 48);//deleting
        session.delete(course);//deleting



        session.save(course);

        transaction.commit();
        session.close();
    }

}
