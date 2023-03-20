package Chapter9_Object_And_Class.Ujian_Pbo;

//abstract kelas

public abstract class Soal2_AbstractionAndEncapsulation {
    private String nama;
    private String tanggalLahir;
    private int nomor;
    public Soal2_AbstractionAndEncapsulation(String nama,String tanggalLahir, int nomor){
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.nomor = nomor;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public int getNomor() {
        return nomor;
    }

    public void setNomor(int nomor) {
        this.nomor = nomor;
    }

    public void display(){
        System.out.println("Nama            : " + this.nama + "\nTanggal Lahir   : " + this.tanggalLahir);

    }
}




