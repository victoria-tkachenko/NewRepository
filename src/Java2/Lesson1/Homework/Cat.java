package Java2.Lesson1.Homework;

public class Cat implements Actions {

    private int maxRunLength;
    private int maxJumpHeight;

    public Cat(int maxRunLength, int maxJumpHeight) {
        this.maxJumpHeight = maxJumpHeight;
        this.maxRunLength = maxRunLength;
    }

    @Override
    public void jump(int wallHeight) {
        if (wallHeight < maxJumpHeight) {
            System.out.println("Я кот, я перепрыгнул");
        } else {
            System.out.println("Я кот, я не перепрыгнул");
        }
    }

    @Override
    public void run(int trackLength) {
        if (trackLength < maxRunLength) {
            System.out.println("Я кот, я пробежал");
        } else {
            System.out.println("Я кот, я не пробежал");
        }
    }
}
