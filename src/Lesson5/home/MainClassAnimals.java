package Lesson5.home;

public class MainClassAnimals {

  public static void main(String[] args) {

      String ability;
      String result;
      String win = ", удача!";
      String loss = ", но увы, не получилось!";

      Bird bird = new Bird("Птичка", "Воробей", 5, 0.2f, 0);
      Cat cat = new Cat("Кот","Том", 200, 2, 0);
      Horse horse = new Horse("Конь", "Юрий", 1500, 3, 100);
      Dog dog = new Dog("Пес", "Гав", 500, 0.5f, 10);


      Animals[] array = {bird, cat, horse, dog};
      float runDistance = 300;
      float jumpDistance = 1;
      float swimDistance = 50;

      for (int i = 0; i < array.length; i++) {
          String nameString = array[i].getAnimalType() + " " + array[i].getName();

          ability = " может пробежать на " + array[i].getRunLength() + " м. Бежит на ";
          result = (array[i].run(runDistance)) ? win : loss;
          resultPrint(nameString, ability, runDistance, result);

          ability = " может прыгнуть на " + array[i].getJumpHeight() + " м. Прыгает на ";
          result = (array[i].jump(jumpDistance)) ? win : loss;
          resultPrint(nameString, ability, jumpDistance, result);


          int swimResult = array[i].swim(swimDistance);
          ability = " может проплыть на " + array[i].getSwimLength() + " м. Плывет на ";
          result = (swimResult == Animals.swimCan) ? win : loss;

          if(swimResult == Animals.swimNo) {
              result = ", увы, плавать не умеет!";
          }
          resultPrint(nameString, ability, swimDistance, result);

      }

      }
    private static void resultPrint(String nameString, String ability, float eventLength, String result) {
        System.out.println(nameString + ability + eventLength + " м" + result);
  }

}
