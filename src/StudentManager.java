import java.util.*;

public class StudentManager {

    private Map<Integer, Student> students = new HashMap<>();

    public void addStudent(Student s) {
        students.put(s.getId(), s);
    }

    public void removeStudent(int id) {
        students.remove(id);
    }

    public void printAll() {
        students.values().forEach(System.out::println);
    }

    public void printTopStudents(double minGrade) {
        students.values().stream()
                .filter(s -> s.getGrade() >= minGrade)
                .forEach(System.out::println);
    }
}
