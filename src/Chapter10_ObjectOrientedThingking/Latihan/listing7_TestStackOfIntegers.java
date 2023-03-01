package Chapter10_ObjectOrientedThingking.Latihan;

public class listing7_TestStackOfIntegers {
    public static void main(String[] args) {
        Listing8_StackOfIntegers stack = new Listing8_StackOfIntegers();

        for (int i = 0; i < 10; i++)
            stack.push(i);

        while (!stack.empty())
            System.out.print(stack.pop() + " ");
    }
}
