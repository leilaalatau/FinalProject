import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Dzmain {
    public static void main(String[] args) {
        List<Course> result = getListOfCourse(3,3);
        //1 задание
        result.stream().flatMap(house -> house.getStudentList().stream()).distinct().collect(Collectors.toList());
        result.stream().flatMap(house -> house.getStudentList().stream()).collect(Collectors.toSet());

        //2 задание
        result.stream().sorted((course1,course2) -> course1.getStudentList().size() - course2.getStudentList().size()).limit(3).collect(Collectors.toList());

        //3 задание
        Student paramStudent = new Student("student1");
        result.stream().filter(house -> house.getStudentList().contains(paramStudent)).collect(Collectors.toList());

        System.out.println();

    }

    private static List<Course> getListOfCourse(int j, int m){
        ArrayList<Course> result = new ArrayList<>();
        for (int i=0; i<j ;i++){
            ArrayList<Student> rooms = new ArrayList<>();
            List<Student> student = null;
            for (int h = 0; h<m ; h++){
                student.add(new Student("student"+h));
            }
            result.add(new Course("course"+i, student));
        }
        return result;
    }

}
