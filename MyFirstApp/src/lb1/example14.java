package lb1;
import java.util.Scanner;

public class example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        int num = in.nextInt();

        int num1 = num - 1;
        int num2 = num + 1;
        int num3 = num * num;
        System.out.println("Результат:" +num1+ " " +num+ " " +num2+ " " +num3);
    }
}
