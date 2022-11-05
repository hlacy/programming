

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.List;

public class _10_14 {
    public static void showTable(){
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml").build();
        Metadata metadata = new MetadataSources(registry)
                .getMetadataBuilder().build();
        SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
        Session session = sessionFactory.openSession();

        String hql = "FROM " + CourseForTeacher.class.getSimpleName() + " WHERE price > 120000 ORDER BY price";// HQL
        //String hql = "FROM courses" +   " WHERE price > 120000 ORDER BY price";
        List<CourseForTeacher> courseForTeacherList = session.createQuery(hql).getResultList();

        int i = 0;
        for (CourseForTeacher courseForTeacher: courseForTeacherList)
            System.out.println(++i + " " + courseForTeacher.getName() + " " + courseForTeacher.getPrice()
                    + " " + courseForTeacher.getDescription());

        sessionFactory.close();
    }
}

