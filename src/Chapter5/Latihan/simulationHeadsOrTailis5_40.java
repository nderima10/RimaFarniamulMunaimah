package Chapter5.Latihan;

public class simulationHeadsOrTailis5_40 {
    public static void main(String[] args) {
        int heads,
                tails,
                coin;
        heads = tails = 0;
        System.out.println("Fipping a coin one millon times..");
        for (int i = 0; i < 1000000; i++) {
            coin = (int)(Math.random() * 2) == 0 ? heads++ : tails++;
        }

        System.out.println(
                "kepala: " + heads +
                        "\nEkor: " + tails);
    }
}
