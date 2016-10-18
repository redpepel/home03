/**
 * Created by User on 17.10.2016.
 */
import jdk.nashorn.internal.ir.IfNode;

import java.util.Scanner;
public class Home04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число a ");
        float a = in.nextFloat();
        System.out.print("Введите число b ");
        float b = in.nextFloat();
        float c = Math.abs(Math.abs(a) - 10);
        float d = Math.abs(Math.abs(b) - 10);
        if (c<d){
            System.out.println(a);
        }
        else if (d<c){
            System.out.println(b);

        }
        else
        {
            System.out.println(a);
        }
         }
    }
