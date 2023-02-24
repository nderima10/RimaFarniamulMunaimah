package Chapter9_Object_And_Class.Latihan;

public class Listing4_TestTV {
    public static void main(String[] args) {
        Listing3_TV tv1 = new Listing3_TV();
        tv1.turnOn();
        tv1.setChannel1(30);
        tv1.setVolumeLevel(3);

        Listing3_TV tv2 = new Listing3_TV();
        tv2.turnOn();
        tv2.channelUp();
        tv2.volumeUp();

        System.out.println("tv1's channel is  " + tv1.channel1 +
                " and volume level is " + tv1.volumeLevel);
        System.out.println("tv2's channel is  " + tv2.channel1  +
                " and volume level is " + tv2.volumeLevel);
    }
}
