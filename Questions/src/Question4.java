//write a function that takes in the radius as input and return the circumference of a circle.......

import java.util.Scanner;

public class Question4 {
        public static Double getcircumference(Double radius){
            return 2 * 3.14 * radius;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double radius = sc.nextDouble();
        System.out.println(getcircumference(radius));
    }
}
