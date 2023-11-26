package timus.task_1293;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите кол-во панелей: ");
        int panel = in.nextInt();

        System.out.println("Введите длину панели: ");
        int length = in.nextInt();

        System.out.println("Введите ширину панели: ");
        int width = in.nextInt();

        int dec = 2*length*width*panel;

        System.out.println("Результат: "+ dec);

    }
}
