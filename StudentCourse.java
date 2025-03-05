import java.util.Date;

public class StudentCourse {
    private int studentId;
    private int courseId;
    private Date startDate;

    public StudentCourse(){

    }

    public StudentCourse(int studentId, int courseId, Date startDate) {
        this.studentId = studentId;
        this.courseId = courseId;
        this.startDate = startDate;
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

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
}
