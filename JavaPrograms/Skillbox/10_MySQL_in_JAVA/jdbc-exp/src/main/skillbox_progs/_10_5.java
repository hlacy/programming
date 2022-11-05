

import org.hibernate.PropertyAccessException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.event.spi.SaveOrUpdateEvent;
import org.hibernate.service.Service;
import org.hibernate.service.ServiceRegistry;

public class _10_5 {

    public static void showTable(){
            StandardServiceRegistry registry = new
                    StandardServiceRegistryBuilder()
                    .configure("hibernate.cfg.xml").build();
            Metadata metadata = new MetadataSources(registry)
                    .getMetadataBuilder().build();
            SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
            Session session = sessionFactory.openSession();
            try {

                for (int i = 1; ; i++){

                    Course course = session.get(Course.class, i);

                System.out.println(course.getId()+ " " + course.getName() + " - number of " +
                        "students = " + course.getStudentsCount());
//            session.createQuery(Course.class)
                }

            }
            catch (PropertyAccessException pae){
                System.err.println("\n\t\tPropertyAccessException\n\n");
                //pae.printStackTrace();
            }
            finally {
                session.close();
            }
        System.out.println("end");
//        Course.sessionCourseClose(Course.sessionCourse());

    }
}
