package Chapter11_InheritanceAndPolymorphism.Exercise;

public class Soal2_Person_Student_Employee_Faculty_Staff {
    public static void main(String[] args) {

        Soal2b_Person person = new Soal2b_Person("john", "12 Bell street", "3473339999", "john@aol.com");
        Soal2b_Student student = new Soal2b_Student("Mary", "100 town ave", "5149993333", " mary100@aol.com", Soal2b_Student.FRESHMAN);
        Soal2b_Employee employee = new Soal2b_Employee("Mike", "34 west street", " 618999999", "mike80@aol.com", 910, 60000);
        Soal2b_Faculty faculty = new Soal2b_Faculty("sue", "28 well street", "244567676", "sue23@aol.com", 101, 50000, "4pm to 6pm", "professor");
        Soal2b_Staff staff = new Soal2b_Staff("Tom", " 90 country  road", "23344556666", "tom23@aol.com", 12, 65000, "Executive Assistant");

        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());
    }
}
