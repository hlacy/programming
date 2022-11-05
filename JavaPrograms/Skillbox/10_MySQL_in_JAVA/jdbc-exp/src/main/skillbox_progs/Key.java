import javax.persistence.Column;
import java.io.Serializable;
import java.util.Objects;

public class Key implements Serializable {
    @Column(name = "student_id")
    private int studentId;
    @Column(name = "course_id")
    private int courseId;

    public Key(){
        super();
    }
    public Key(int studentId, int courseId){
        this.courseId = courseId;
        this.studentId = studentId;
    }
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Key)) return false;
        Key key = (Key) o;
        return getStudentId() == key.getStudentId() && getCourseId() == key.getCourseId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStudentId(), getCourseId());
    }
}
