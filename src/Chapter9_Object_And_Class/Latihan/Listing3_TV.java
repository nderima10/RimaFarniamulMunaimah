package Chapter9_Object_And_Class.Latihan;

public class Listing3_TV {
    int channel1 = 1;
    int volumeLevel = 1;
    boolean on = false;

    public Listing3_TV() {
    }
    public void turnOn() {
        on = true;
    }
    public void turnOff() {
        on = false;
    }
    public void setChannel1(int newChannel) {
        if (on && newChannel >= 1 && newChannel <= 120)
            channel1 = newChannel;
    }
    public void setVolumeLevel(int newVolumeLevel) {
        if (on && newVolumeLevel >= 1 && newVolumeLevel <= 7)
            volumeLevel = newVolumeLevel;
    }
    public void channelUp() {
        if (on && channel1 < 120)
            channel1++;
    }
    public void channelDown() {
        if (on && channel1 > 1)
            channel1--;
    }
    public void volumeUp() {
        if (on && volumeLevel < 7)
            volumeLevel++;
    }
    public void volumeDown() {
        if (on && volumeLevel > 1)
            volumeLevel--;
    }
}
