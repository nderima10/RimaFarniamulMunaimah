package Chapter11_InheritanceAndPolymorphism.Exercise;

public class Soal2b_Student extends Soal2b_Person {
    private int status;
    public final static int FRESHMAN = 1;
    public final static int SOPHOMORE = 3;
    public final static int JUNIOR = 2;
    public final static int SENIOR = 4;

    public Soal2b_Student(String name, String address, String phone, String email, int status) {
        super(name, address, phone, email);
        this.status = status;
    }

    public Soal2b_Student(int status) {
        this.status = status;
    }

    public String getStatus() {
        switch (status){
            case 1: return "freshman";
            case 2: return "sophomore";
            case 3: return "junior";
            case 4: return "senior";
            default: return "Unknown";
        }
    }
    public String toString(){
        return super.toString() + "\nStatus: " + getStatus();
    }
}
