/**
 * Created by User on 17.10.2016.
 */
import jdk.nashorn.internal.ir.IfNode;

import java.util.Scanner;
public class Homework03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int a = in.nextInt();
        int b = Math.abs(a)%2;
        String result = b>0 ? "Нечет" : "Чет";
        if (a == 0){
            System.out.println("Это нуль");
        }
        else {
            System.out.println(result);
        }
    }
    }

