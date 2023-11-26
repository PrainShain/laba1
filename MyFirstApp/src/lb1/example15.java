package lb1;
import java.util.Scanner;

public class example15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int first = in.nextInt();

        System.out.println("Введите второе число:");
        int second = in.nextInt();

        int sum = first + second;
        int sub = first - second;

        System.out.println("Результат: " +sum +" "+ sub);

    }
}
