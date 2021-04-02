package Java2.Lesson1.Homework;

import com.sun.xml.internal.ws.wsdl.writer.document.Part;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat(20, 20);
        Human human = new Human(30, 5);
        Robot robot = new Robot(30, 10);

        Wall wall = new Wall(5);
        RunningTrack runningTrack = new RunningTrack(30);

        runningTrack.doIt(cat);
        wall.doIt(cat);

        runningTrack.doIt(human);
        wall.doIt(human);

        runningTrack.doIt(robot);
        wall.doIt(robot);
        System.out.println("----------");

        Actions[] participants = {new Cat(4, 7), new Human(15, 6), new Robot(35, 20)};
        Obstacles[] obstacles = {new RunningTrack(25), new Wall(4)};

        for (Actions participant : participants) {
            for (int i = 0; i < obstacles.length; i++) {
                obstacles[i].doIt(participant);
            }
        }
    }
}
