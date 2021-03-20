package Java2.Lesson1.Homework;

public class Wall extends Obstacles {
    private int wallHeight;

    public Wall(int wallHeight) {
        this.wallHeight = wallHeight;
    }

    @Override
    public void doIt(Actions actions) {
        actions.jump(wallHeight);
    }

    //    public void somebodyJumps (Actions somebody) {
//        somebody.jump(wallHeight);
//    }
}
