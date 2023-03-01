package Chapter9_Object_And_Class.Exercise;

public class Soal8_Fan {
    public static void main(String[] args) {
        final int SLOW = 1;
        final int MEDIUM = 1;
        final int FAST = 3;

        Soal8b_Fan fan1 = new Soal8b_Fan();
        Soal8b_Fan fan2 = new Soal8b_Fan();

        fan1.setSpeed(FAST);
        fan1.setRadius(10);
        fan1.setColor("Yellow");
        fan1.turnOn();

        fan1.setSpeed(MEDIUM);
        fan1.setRadius(5);
        fan1.setColor("blue");
        fan1.turnOff();

        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
