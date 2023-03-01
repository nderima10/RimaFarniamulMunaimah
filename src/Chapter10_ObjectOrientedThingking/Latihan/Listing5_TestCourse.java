package Chapter10_ObjectOrientedThingking.Latihan;

public class Listing5_TestCourse {
    public static void main(String[] args) {
        Listing6_Course course1 = new Listing6_Course("Data Structures");
        Listing6_Course course2 = new Listing6_Course("Database System");

        course1.addStudent("Nde");
        course1.addStudent("Kim Smith");
        course1.addStudent("Anne Kennedy");

        course2.addStudent("Nde");
        course2.addStudent("Rima");

        System.out.println("number of student in course1: " + course1.getNumberOfStudent());
        String[] student  = course1.getStudent();
        for (int i = 0; i < course1.getNumberOfStudent(); i++)
        System.out.print(student[i] + ", ");

        System.out.println();
        System.out.println("Number of student in course2: " + course2.getNumberOfStudent());
    }
}
