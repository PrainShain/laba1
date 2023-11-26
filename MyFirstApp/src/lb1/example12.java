package lb1;
import java.util.Scanner;

public class example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите год рождения: ");
        int year = new Scanner(System.in).nextInt();

        System.out.println(getAge(year)+ " лет");

    }
    private static int getAge(int year) {
        return 2023 - year;
    }
}
