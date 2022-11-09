import java.util.List;

public class Course {
    private String name;

    List<Student> studentList;

    public Course(String name, List<Student> studentList) {
        this.name = name;
        this.studentList = studentList;
    }

    public String getName() {
        return name;
    }

    public List<Student> getStudentList() {
        return studentList;
    }
}
