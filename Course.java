public class Course {
    private int id;
    private int professorId;
    private int departmentId;
    private String name;
    private int classroomNum;

    public Course() {

    }

    public Course(int id, int professorId, int departmentId, String name, int classroomNum) {
        this.id = id;
        this.professorId = professorId;
        this.departmentId = departmentId;
        this.name = name;
        this.classroomNum = classroomNum;
    }

    public int getProfessorId() {
        return professorId;
    }

    public void setProfessorId(int professorId) {
        this.professorId = professorId;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public int getId() {
        return id;
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

    public int getClassroomNum() {
        return classroomNum;
    }

    public void setClassroomNum(int classroomNum) {
        this.classroomNum = classroomNum;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", classroomNum=" + classroomNum +
                '}';
    }
}
