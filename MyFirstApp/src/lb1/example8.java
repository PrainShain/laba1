package lb1;
import java.util.Scanner;

public class example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите день недели: ");
        String day = in.nextLine();

        System.out.println("Введите месяц: ");
        String month = in.nextLine();

        System.out.println("Введите Дату: ");
        int num = in.nextInt();

        System.out.println(day + " " + month + " " + num);
        in.close();
    }

}
