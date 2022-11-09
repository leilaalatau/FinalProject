import java.util.Collection;
import java.util.Objects;

public class Student {
    private String name;
    private Object student;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course room = (Course) o;
        return Objects.equals(name,student);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public Collection<Object> getStudentList() {
        return null;
    }
}
