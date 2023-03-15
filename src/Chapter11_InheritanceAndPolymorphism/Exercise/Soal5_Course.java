package Chapter11_InheritanceAndPolymorphism.Exercise;

public class Soal5_Course {
    public static void main(String[] args) {
        Soal5b_Course course1 = new Soal5b_Course("data Structure");
        Soal5b_Course course2 = new Soal5b_Course("data Structure");

        course1.addStudent("Peter jones");
        course1.addStudent("Nde Rima");
        course1.addStudent("Tazkiyya");
        course2.addStudent("Syakiri");
        course2.addStudent("Chuby");

        System.out.println("Number of student in course1: " + course1.getNumberOfStudents());
        String[] student = course1.getStudents();
        for (int i = 0; i < course1.getNumberOfStudents(); i++) {
            System.out.print(student[i] + ", ");

            System.out.println();
            System.out.print("Number of Student in course 2: " + course2.getNumberOfStudents());
        }
    }
}
