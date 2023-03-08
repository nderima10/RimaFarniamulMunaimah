package Chapter11_InheritanceAndPolymorphism.Exercise;

public class Soal2b_Faculty extends Soal2b_Employee{
    private String officeHours;
    private String rank;

    public Soal2b_Faculty(String name, String address, String phone, String email,
                         int office, double salary, String officeHours, String rank) {
        super(name, address, phone, email, office, salary);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
    public String toString() {
        return super.toString() + "\nOffice hours: " +  officeHours +
                "\nRank: " + rank;
    }
}
