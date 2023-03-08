package Chapter12_ExceptionHandlingAndText_1or0.Exercise;

public class Soal1_NumberFormatException {
    public static void main(String[] args) throws NumberFormatException {
        if (args.length != 3) {
            System.out.println("Usage: java calculator operand1 operator operand2");
            System.exit(0);
        }

        int result = 0;
        try {
            switch (args[1].charAt(0)) {
                case '+' -> result = Integer.parseInt(args[0]) +
                        Integer.parseInt(args[2]);
                case '-' -> result = Integer.parseInt(args[0]) -
                        Integer.parseInt(args[2]);
                case '.' -> result = Integer.parseInt(args[0]) *
                        Integer.parseInt(args[2]);
                case '/' -> result = Integer.parseInt(args[0]) /
                        Integer.parseInt(args[2]);
            }
            System.out.println(args[0] + ' ' +args[1] + ' ' + args[2] + " = " + result);
        }
        catch (NumberFormatException ex) {
            System.out.println("Wrong input: " +ex.getMessage().substring(ex.getMessage().indexOf("\"") + 1,
            ex.getMessage().lastIndexOf("\"")));
        }
    }
}
