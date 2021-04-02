package Java2.Lesson1.Homework;

public class Robot implements Actions {
    private int maxRunLength;
    private int maxJumpHeight;


    public Robot(int maxRunLength, int maxJumpHeight) {
        this.maxJumpHeight = maxJumpHeight;
        this.maxRunLength = maxRunLength;
    }


    @Override
    public void jump(int wallHeight) {
        if (wallHeight < maxJumpHeight) {
            System.out.println("Я робот, я перепрыгнул");
        } else {
            System.out.println("Я робот, я не перепрыгнул");
        }
    }

    @Override
    public void run(int trackLength) {
        if (trackLength < maxRunLength) {
            System.out.println("Я робот, я пробежал");
        } else {
            System.out.println("Я робот, я не пробежал");
        }
    }
}
