package Chapter7_SingelDimensionalArrays.Latihan;

public class LIsting9_Calculator {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("usage: java calculator operand1 operator operand2");
            System.out.println(0);
        }
        int hasil = switch (args[1].charAt(0)) {
            case '+' -> Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
            case '-' -> Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
            case '.' -> Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
            case '/' -> Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
            default -> 0;
        };
        System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + hasil);
    }
}
