package Chapter11_InheritanceAndPolymorphism.Exercise;

public class Soal2b_Person {
    private String name;
    private  String address;
    private String phone;
    private String email;

    public Soal2b_Person() {
        this("unknown", "unknown", "unknown", "unknown");
    }

    public Soal2b_Person(String name, String address, String phone, String email) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String toString() {
        return "\nName: " + name + "\nAddress: " + address + "\nPhone number: " + phone + "\nEmail address: " + email;
    }
}
