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

public class _10_13 {
    public static void showTable(){
        StandardServiceRegistry registry = new
                StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml").build();
        Metadata metadata = new
                MetadataSources(registry)
                .getMetadataBuilder().build();
        SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();

        Session session = sessionFactory.openSession();

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<CourseForTeacher> query = builder
                .createQuery(CourseForTeacher.class);

        Root<CourseForTeacher> root = query.from(CourseForTeacher.class);
        //we try to get 5 curses, which price bigger than 100_000 rub
        query.select(root).where(builder.greaterThan(root.<Integer>get("price"), 100_000))
                .orderBy(builder.desc(root.get("price")));//we get courses more expensive than 100_000, like an operator WHERE
                                    //and arrange them, like an operator ORDERBY
        List<CourseForTeacher> courseForTeacherList = session
                .createQuery(query).setMaxResults(5).getResultList();//we get 5 courses using setMaxResults

        for (CourseForTeacher courseForTeacher: courseForTeacherList)
            System.out.println(courseForTeacher.getTeacher().getName() + " " + courseForTeacher.getPrice());

        sessionFactory.close();
    }
}
