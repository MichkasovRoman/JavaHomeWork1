import java.util.Scanner;

// Вычислить n-ое треугольное число(сумма чисел от 1 до n), 
// n! (произведение чисел от 1 до n)
public class task1 {
    //метод считает n-е треугольное число 
    public static int TriangleNumber(int n) {
        int triangleNumber = 0;
        for (int i = 1; i <= n; i++) {
            triangleNumber = triangleNumber + i;
        }
        return triangleNumber;
    }

    //метод считает факториал числа n
    public static int Factorial(int n) {
        int factorial = 1;
        if (n == 0) factorial = 1;
        else {
            for (int i = 2; i <= n; i++) {
                factorial = factorial * i;
            }
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner txt = new Scanner(System.in);
        System.out.print("Введите натуральное число: ");
        String stringNumber = txt.next();
        int number = Integer.parseInt(stringNumber);
        System.out.println("Треугольное число от заданного числа:");
        System.out.println(TriangleNumber(number));
        System.out.println("Факториал заданного числа:");
        System.out.println(Factorial(number));
    }
    
}
