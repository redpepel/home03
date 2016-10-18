/**
 * Created by User on 17.10.2016.
 */
import java.util.Scanner;
public class Homework02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int a = in.nextInt();
        String Evod = getEvenOdd(a);
        System.out.println(Evod);

        }
    public static String getEvenOdd (int a){
        int b = Math.abs(a)%2;
        String Ev = "Число четное";
        String Odd = "Число нечетное";
        String Zero = "Это нуль";
        if (b>0){
        return Odd;
        }
        else if (a == 0) {
        return Zero;
        }
        else {
            return Ev;
        }
    }
    }

