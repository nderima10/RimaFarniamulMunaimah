package Chapter9_Object_And_Class.Ujian_Pbo;

public class Soal4b_Overloading {
    private String name;
    private static int jumlah;

    //overloading constructor
    Soal4b_Overloading(String name){
        this.name = name;
        Soal4b_Overloading.jumlah++;
    }

    //opsi 2
    Soal4b_Overloading(){
        Soal4b_Overloading.jumlah++;
        this.name = "Mahasiswa1 " + Soal4b_Overloading.jumlah;
    }
    void show(){
        System.out.println("Nama : " + this.name);
    }
}
