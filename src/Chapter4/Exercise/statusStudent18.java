package Chapter4.Exercise;

import java.util.Scanner;

public class statusStudent18 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Enter two character : ");
        String str = input.nextLine();
        char m = Character.toUpperCase(str.charAt(0));
        char s = str.charAt(1);

        switch (m){
            case 'M' :
                System.out.print("Mathematics");
                break;
            case 'C' :
                System.out.print("komputer scince");
                break;
            case 'I' :
                System.out.println("Informasi teknologi");
                break;
            default :
                System.out.println("invalid input");

                System.exit(1);
        }
        switch(s)
        {
            case'1' : System.out.println("Freshman");
                break;
            case'2' : System.out.println("sophomore");
                break;
            case'3' : System.out.println("junior");
                break;
            case'4' : System.out.println("senior");
                break;
            default : System.out.println("invalid input");
        }
    }
}
