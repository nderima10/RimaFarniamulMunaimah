package Chapter6_Methods.Exercise;

public class Soal30_GameCraps {
    public static void main(String[] args) {
        int point = rollTwoDice();
        int result = getresult(point);

        if (isnaturalOrCraps(result))
            printResult(result);
        else {
            rollTillWinOrLose(result);
        }
    }

    public static int rollDice() {

        return (int) (1 + Math.random() * 6);
    }

    public static int rollTwoDice() {
        int dice1 = rollDice();
        int dice2 = rollDice();
        int sum = dice1 + dice2;
        System.out.println("You rooled " + dice1 + " + " + dice2 + " = " + sum);
        return sum;
    }

    public static int getresult(int point) {
        switch (point) {
            case 2, 3, 12 -> point = 0;
            case 7, 11 -> point = 1;
        }
        return point;
    }
    public static void printResult(int result) {
        if (result == 0)
            System.out.println("you lose");
        else if (result == 1)
            System.out.println("you win");
    }
    public static boolean isnaturalOrCraps(int result) {

        return result == 0 || result == 1;
    }
    public static void rollTillWinOrLose(int point) {
        int result;
        do {
            result = rollTwoDice();
        }while (result != point && result != 7);
        if (result == 7)
            printResult(0);
        else
            printResult(1);
    }
}
