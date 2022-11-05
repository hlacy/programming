import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "purchaselist")
public class PurchaseList {
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getSubscribtionsDate() {
        return subscribtionsDate;
    }

    public void setSubscribtionsDate(Date subscribtionsDate) {
        this.subscribtionsDate = subscribtionsDate;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_name")
    private String studentName;
    @Column(name = "course_name")
    private String courseName;
    private int price;
    @Column(name = "subscription_date")
    private Date subscribtionsDate;
}
