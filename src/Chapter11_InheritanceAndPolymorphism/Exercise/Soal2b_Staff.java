package Chapter11_InheritanceAndPolymorphism.Exercise;

public class Soal2b_Staff extends Soal2b_Employee{
    private String title;

    public  Soal2b_Staff(String name, String address, String phone,
                         String email, int office, double salary, String title) {
        super(name, address, phone, email, office, salary);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String toString() {
        return super.toString() + "\nTitle: " + title;
    }
}
