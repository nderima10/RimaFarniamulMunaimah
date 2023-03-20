package Chapter9_Object_And_Class.Ujian_Pbo;

public class Soal2b_main {
        public static void main(String[] args) {
            //membuat object dari kelas non abstract
            Soal2b nama =
                    new Soal2b("Rima farniamul Munaimah","10 Februari 2004", 01);
            nama.display();


//        //Tidak dapat membuat object dari kelas Abstract
//        Soal2_AbstractionAndEncapsulation nama =
//                new Soal2_AbstractionAndEncapsulation("Rima");
//        nama.display();
    }
}
