package lb1;
import java.util.Scanner;

public class example10 {
    public static void main(String[] args) {

        System.out.print("Введите год рождения: ");
        int year = new Scanner(System.in).nextInt();
        System.out.println("Вам: " + getAge(year) +" лет");
    }

    private static int getAge(int year){
        return 2023 - year;

    }
}
