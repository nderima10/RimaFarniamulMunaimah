package Chapter9_Object_And_Class.Ujian_Pbo;

public class Soal3_Inheritance_Polymorphism {
    public static void main(String[] args) {
        Soal3b_Guru guru1 = new Soal3b_Guru("Pak Nurudin");
        Soal3b_Siswa murid1 = new Soal3b_Siswa("Nde Rima");
        guru1.display();
        murid1.display();

        Soal3b_Siswi wali1 = new Soal3b_Siswi("Shopiah");
        wali1.display();

        //polymorphism
        Soal3b_Guru guru2 = new Soal3b_Siswa("Nina");
        guru2.display();

    }
}
