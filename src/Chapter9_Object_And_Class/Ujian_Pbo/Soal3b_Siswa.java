package Chapter9_Object_And_Class.Ujian_Pbo;

public class Soal3b_Siswa extends Soal3b_Guru{
    String tingkat = "SMA";

    Soal3b_Siswa(String nama){
        super(nama);
    }
    @Override
    void display(){
        super.display();
        System.out.println("Tingkat\t: " + this.tingkat);
    }
}
