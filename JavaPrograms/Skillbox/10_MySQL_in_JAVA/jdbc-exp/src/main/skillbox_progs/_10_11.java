package _10_sql_hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class _10_11 {
    public static void showTable(){
        StandardServiceRegistry registry = new
                StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml")
                .build();
        Metadata metadata = new MetadataSources(registry)
                .getMetadataBuilder().build();
        SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();

        Session session = sessionFactory.openSession();

        CriteriaBuilder builder = session.getCriteriaBuilder();//this class uses for difficult queries
        CriteriaQuery<CourseForTeacher> query = builder.createQuery(CourseForTeacher.class);
        Root<CourseForTeacher> root = query.from(CourseForTeacher.class);//this expression looks like operator FROM in SQL
        query.select(root);//SELECT operator in SQL
        List<CourseForTeacher> courseForTeacherList = session.createQuery(query).getResultList();

        for (CourseForTeacher courseForTeacher: courseForTeacherList)
            System.out.println(courseForTeacher.getName());

        sessionFactory.close();
    }

}
