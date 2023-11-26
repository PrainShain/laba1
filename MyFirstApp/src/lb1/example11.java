package lb1;
import java.util.Scanner;

public class example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите Имя: ");
        String name = in.nextLine();

        System.out.println("Введите год роджения: ");
        int year = new Scanner(System.in).nextInt();
        System.out.println(name + " " + getAge(year)+" лет");
    }

    private static int getAge(int year) {
        return 2023 - year;
    }
    }
