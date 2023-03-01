package Chapter9_Object_And_Class.Exercise;

public class Soal6b_StopWatch {
    private long startTime;
    private long  endTime;

    Soal6b_StopWatch() {
        startTime = System.currentTimeMillis();
    }
    public void start() {
        startTime = System.currentTimeMillis();
    }
    public void stop() {
        endTime = System.currentTimeMillis();
    }
    public long getElapsedTime() {
        return getEndTime() - getStartTime();
    }
    public long getStartTime(){
        return startTime;
    }
    public long getEndTime() {
        return endTime;
    }
}
