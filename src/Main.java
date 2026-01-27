public class Main {
    public static void main(String[] args) {

        StudentManager manager = new StudentManager();

        manager.addStudent(new Student(1, "Islombek", 90.5));
        manager.addStudent(new Student(2, "Aziz", 75.0));
        manager.addStudent(new Student(3, "Sardor", 88.0));

        System.out.println("All students:");
        manager.printAll();

        System.out.println("\nTop students (grade >= 85):");
        manager.printTopStudents(85);

        manager.removeStudent(2);
        System.out.println("\nAfter removing student with id=2:");
        manager.printAll();
    }
}
