// Вывести все простые числа от 1 до 1000

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task2 {
    // метод считает количество делителей числа
    public static int CountDividors(int number) { 
        int count = 0;                             
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        return count;
    }
    
    // метод проверяет, является ли число простым
    public static boolean IfSimpleNumber(int number) { 
        if (CountDividors(number) == 2)                 
        return true;
        else return false;
    }

    // основной метод, реализующий вывод массива простых чисел
    public static Integer[] SimpleNumbersLine(int number) {
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
        System.out.println("Простые числа, меньшие 1000:");
        Integer[] simples = SimpleNumbersLine(1000);
        System.out.println(Arrays.toString(simples));
    }
            
}
