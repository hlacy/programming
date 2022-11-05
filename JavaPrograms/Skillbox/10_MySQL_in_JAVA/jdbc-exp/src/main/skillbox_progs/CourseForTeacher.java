import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;
import

@Entity
@Table(name = "courses")
public class CourseForTeacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private int duration;
    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "enum")

    private CourseType type;
    private String description;
//    @ManyToOne(cascade  = CascadeType.ALL, fetch = FetchType.EAGER)//EAGER loads all data immediately and stores them in the storage.we don't need to have a persistent connection
    @ManyToOne(cascade  = CascadeType.ALL, fetch = FetchType.LAZY)//LAZY loads data, when we query them. we need to have a persistent connection
    private Teacher teacher;
    @Column(name = "students_count", nullable = true)
    private Integer studentsCount;
    private int price;
    @Column(name = "price_per_hour")
    private float pricePerHour;
    @ManyToMany( cascade = CascadeType.ALL)
    @JoinTable(name = "subscriptions",
        joinColumns = {@JoinColumn(name = "course_id")},
        inverseJoinColumns = {@JoinColumn(name = "student_id")})
    private List<Student> students;

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teachers) {
        this.teacher = teachers;
    }

    public int getStudentsCount() {
        return studentsCount;
    }

    public void setStudentsCount(int studentsCount) {
        this.studentsCount = studentsCount;
    }

    public float getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(float pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public CourseType getType() {
        return type;
    }

    public void setType(CourseType type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
