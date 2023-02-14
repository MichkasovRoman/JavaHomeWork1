import java.util.Scanner;

// реализовать простейший калькулятор

public class task3 {
    // сложение
    public static float Addition(char m, char n) {
        String string_m = String.valueOf(m);
        float number1 = Float.parseFloat(string_m);
        String string_n = String.valueOf(n);
        float number2 = Float.parseFloat(string_n);
        return number1 + number2;
    }

    // вычитание
    public static float Subtraction(char m, char n) {
        String string_m = String.valueOf(m);
        float number1 = Float.parseFloat(string_m);
        String string_n = String.valueOf(n);
        float number2 = Float.parseFloat(string_n);
        return number1 - number2;
    }

    // умножение
    public static float Multiplication(char m, char n) {
        String string_m = String.valueOf(m);
        float number1 = Float.parseFloat(string_m);
        String string_n = String.valueOf(n);
        float number2 = Float.parseFloat(string_n);
        return number1 * number2;
    }
    
    // деление
    public static float Division(char m, char n) {
        String string_m = String.valueOf(m);
        float number1 = Float.parseFloat(string_m);
        String string_n = String.valueOf(n);
        float number2 = Float.parseFloat(string_n);
        return number1 / number2;
    }

    public static void main(String[] args) {
        Scanner txt = new Scanner(System.in);
        System.out.print("Введите числовое выражение в одно действие: ");
        String expression = txt.next();
        char[] symbolsOfexpression = expression.toCharArray();
        
        if (symbolsOfexpression[1] == '+') {
            float result = Addition(symbolsOfexpression[0], symbolsOfexpression[2]);
            System.out.println(result);
        }
        if (symbolsOfexpression[1] == '-') {
            float result = Subtraction(symbolsOfexpression[0], symbolsOfexpression[2]);
            System.out.println(result);
        }

        if (symbolsOfexpression[1] == '*') {
            float result = Multiplication(symbolsOfexpression[0], symbolsOfexpression[2]);
            System.out.println(result);
        }

        if (symbolsOfexpression[1] == '/') {
            float result = Division(symbolsOfexpression[0], symbolsOfexpression[2]);
            System.out.println(result);
        }

    }

}
