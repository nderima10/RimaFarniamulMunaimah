package Chapter11_InheritanceAndPolymorphism.Exercise;

import java.util.ArrayList;

public class Soal5b_Course {
    private String courseName;
    private ArrayList<String> students;

    public Soal5b_Course(String courseName) {
        this.courseName = courseName;
        students= new ArrayList<>();
    }
    public void addStudent(String student) {
        students.add(student);
    }
    public String[] getStudents() {
        String[] a =new String[students.size()];
        return students.toArray(a);
    }
    public int getNumberOfStudents() {
        return students.size();
    }
    public String getCourseName() {
        return courseName;
    }
    public void dropStudent(String student) {
        students.remove(student);
    }
}
