package ss4_class_and_object.bai_tap.stop_watch;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {

    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
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

}

