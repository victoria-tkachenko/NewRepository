package Java2.Lesson1.Homework;

public class Human implements Actions {

    private int maxRunLength;
    private int maxJumpHeight;

    public Human(int maxRunLength, int maxJumpHeight) {
        this.maxJumpHeight = maxJumpHeight;
        this.maxRunLength = maxRunLength;
    }


    @Override
    public void jump(int wallHeight) {
        if (wallHeight < maxJumpHeight) {
            System.out.println("Я человек, я перепрыгнул");
        } else {
            System.out.println("Я человек, я не перепрыгнул");
        }
    }

    @Override
    public void run(int trackLength) {
        if (trackLength < maxRunLength) {
            System.out.println("Я человек, я пробежал");
        } else {
            System.out.println("Я человек, я не пробежал");
        }
    }
}

