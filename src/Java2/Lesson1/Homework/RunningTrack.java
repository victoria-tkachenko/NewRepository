package Java2.Lesson1.Homework;

public class RunningTrack extends Obstacles {

    private int trackLength;

    public RunningTrack(int trackLength) {
        this.trackLength = trackLength;
    }

    @Override
    public void doIt(Actions actions) {
        actions.run(trackLength);
    }
}
