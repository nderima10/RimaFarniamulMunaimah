package Chapter9_Object_And_Class.Ujian_Pbo;

public class Soal3b_Siswi extends Soal3b_Guru{
    String Tingkat = "SMP";
    Soal3b_Siswi(String nama){
        super(nama);
    }
    @Override
    void display(){
        super.display();
        System.out.println("Tingkat\t: " + this.Tingkat);
    }
}
