package Chapter10_ObjectOrientedThingking.Exercise;

public class Soal9_Course {
    public static void main(String[] args) {
        Soal9b math101  = new Soal9b("Math101");

        math101.addStudent("Mark");
        math101.addStudent("Tom");
        math101.addStudent("joan");

        math101.dropStudent("Tom");

        System.out.println("\nthe students in the course " + math101.getCourseName() + ": ");
        String[] student = math101.getStudent();
        for (int i = 0; i < math101.getNumberOfStudents(); i++) {
            System.out.print(student[i] + " ");
        }
        System.out.println();
    }
}
