package Chapter9_Object_And_Class.Ujian_Pbo;

public class Soal1_ClassAndObject {
    String nama;
    String Alamat;
    int usia;

    public Soal1_ClassAndObject(String nama, String alamat, int usia) {
        this.nama = nama;
        Alamat = alamat;
        this.usia = usia;
    }

    public void display() {
        System.out.println("Nama    : " + nama + "\nAlamat  : " + Alamat + "\nUsia    : " + usia);
    }
}
