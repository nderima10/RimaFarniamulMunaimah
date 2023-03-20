package Chapter9_Object_And_Class.Ujian_Pbo;

public class Soal4_OverridingAndOverloading {
    public static void main(String[] args) {
        //overloading pada constructor
        Soal4b_Overloading teknologi1 = new Soal4b_Overloading("Informatika");
        Soal4b_Overloading teknologi2 = new Soal4b_Overloading();
        Soal4b_Overloading teknologi3 = new Soal4b_Overloading();
        Soal4b_Overloading teknologi4 = new Soal4b_Overloading("Nanda");

        teknologi1.show();
        teknologi2.show();
        teknologi3.show();
        teknologi4.show();

    }
}
