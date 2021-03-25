package Java2.Lesson2.Homework;

// 1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4. При подаче массива другого
// размера необходимо бросить исключение MyArraySizeException.

// 2. Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать. Если в каком-то
// элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа), должно быть
// брошено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.

// 3. В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException и
// MyArrayDataException и вывести результат расчета.

public class NewArray {

    private static final int ARRAY_SIZE = 4;

    public static void main(String[] args) {

        String[][] correctArray = new String[][]{
                {"1", "1", "1", "1"},
                {"2", "2", "2", "2"},
                {"3", "3", "3", "3"},
                {"4", "4", "4", "4"}
        };

        String[][] wrongArray = new String[][]{
                {"1", "1", "1", "1"},
                {"2", "2", "2", "2"},
                {"3", "3", "3", "3"},
                {"4", "4", "4", "k"}
        };

        try {
            System.out.println("Сумма всех элементов массива: " + checkArray(correctArray));
        } catch (MyArraySizeException e) {
            System.out.println("Размер массива не соответствует");
        } catch (MyArrayDataException arrayIndex) {
            System.out.println("Неверные данные в массиве!");
            System.out.println("Ошибка в ячейке " + arrayIndex.i + "x" + arrayIndex.j);
        }

        try {
            System.out.println("Сумма всех элементов массива: " + checkArray(wrongArray));
        } catch (MyArraySizeException e) {
            System.out.println("Размер массива не соответствует");
        } catch (MyArrayDataException arrayIndex) {
            System.out.println("Неверные данные в массиве!");
            System.out.println("Ошибка в ячейке " + arrayIndex.i + "x" + arrayIndex.j);
        }
    }

    public static int checkArray(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;

        if (arr.length != ARRAY_SIZE) {
            throw new MyArraySizeException("Размер массива должен быть 4х4");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != ARRAY_SIZE) {
                throw new MyArraySizeException("Размер массива должен быть 4х4");
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }

        return sum;
    }
}

