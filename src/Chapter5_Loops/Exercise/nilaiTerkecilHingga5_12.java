package Chapter5_Loops.Exercise;

public class nilaiTerkecilHingga5_12 {
    public static void main(String[] args) {
        int n = 0;

        while (Math.pow(n, 2) <= 12000) {
            while (Math.pow(n, 2) < 12000) {
                n++;
            }
            System.out.println("Bilangan bulat terkecil hingga lebih besar dari 12000 : " + n);
        }
    }
}
