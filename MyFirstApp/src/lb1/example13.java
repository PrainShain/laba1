package lb1;
import java.util.Scanner;

public class example13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int first = in.nextInt();

        System.out.println("Введите второе число: ");
        int second = in.nextInt();

        System.out.println("Решение: " +first +"+"+ second);
        int num = first + second;
        System.out.println("Сумма: " +num);
    }
}

