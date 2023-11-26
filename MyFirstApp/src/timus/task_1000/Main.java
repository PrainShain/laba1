package timus.task_1000;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите a: ");
        int first = in.nextInt();

        System.out.println("Введите b: ");
        int second = in.nextInt();

        int sum = first + second;
        System.out.println("Результат: "+sum);
    }
}
