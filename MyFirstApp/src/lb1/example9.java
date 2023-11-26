package lb1;
import java.util.Scanner;

public class example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите месяц: ");
        String month = in.nextLine();

        System.out.println("Введите количество дней: ");
        int num = in.nextInt();

        System.out.println(month +" "+num);
    }

}
