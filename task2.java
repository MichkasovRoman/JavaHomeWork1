// Вывести все простые числа от 1 до 1000

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task2 {
    public static int CountDividors(int number) {  // метод считает количество
        int count = 0;                             // делителей числа
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        return count;
    }
    
    public static boolean IfSimpleNumber(int number) {  // метод проверяет,
        if (CountDividors(number) == 2)                 // является ли число простым
        return true;
        else return false;
    }

    public static Integer[] SimpleNumbersLine(int number) { //основной метод
        Integer[] simpleNumbers = {};
        List<Integer> list = new ArrayList<>(Arrays.asList(simpleNumbers));
        for (int i = 1; i <= number; i++) {
            if (IfSimpleNumber(i) == true) {
                list.add(i);
            }
        }
        return list.toArray(new Integer[0]);
    }

    public static void main(String[] args) {
        System.out.println("Простые числа, меньшие 1000");
        Integer[] simples = SimpleNumbersLine(1000);
        System.out.println(Arrays.toString(simples));
    }
            
}
