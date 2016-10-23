import java.util.Scanner;

/**
 * Created by User on 23.10.2016.
 */


public class average {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите переменную а");
        float a = in.nextFloat();
        System.out.println("Введите перемеенную b");
        float b = in.nextFloat();
        System.out.println("Введите переменную с");
        float c = in.nextFloat();
        if ((a > c && b < c) | (a < c && b > c)) {
            System.out.println("Среднее число " + c);
        } else if ((a > b && c < b) | (a < b && c > b)) {
            System.out.println("Среднее число " + b);
        } else {
            System.out.println("Среднее число " + a);
        }
    }
}
