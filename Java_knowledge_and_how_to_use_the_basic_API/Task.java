import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

public class Task {
    public static void main(String[] args){
        Integer[] myArray = getArray(0, 24, 1000);
        System.out.printf("\n Процент уникальных чисел = %s", unNumbers(myArray) + "%");
    }

    public static Integer[] getArray(int min, int max, int size){ // Формирование случайного массива
        Integer[] array = new Integer[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = rand.nextInt(min, max);
        }
        System.out.printf("Массив: %s", Arrays.toString(array));
        return array;
    }

    public static Double unNumbers(Integer[] myArray){     // Вычисление процента уникальных цифр в массиве
        double unVal;
        HashSet<Integer> mySet = new HashSet<>(Arrays.asList(myArray));
        unVal = mySet.size() * 100.0 / myArray.length;
        return unVal;
    }
}