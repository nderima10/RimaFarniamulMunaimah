package Chapter10_ObjectOrientedThingking.Exercise;

public class Soal10_Queue {
    public static void main(String[] args) {

        Soal10b queue = new Soal10b();


        for (int i = 1; i <= 20; i++) {
            queue.enqueue(i);
        }
        while (!queue.empty()) {
            System.out.print(queue.dequeue() + " ");
        }
        System.out.println();
    }
}
