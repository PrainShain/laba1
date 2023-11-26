package lb1;

import java.util.Scanner;

public class example7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите Имя: ");
        String name = in.nextLine();

        System.out.println("Введите возраст:");
        int num = in.nextInt();

        System.out.println(name + " " + num);
        in.close();
    }
}
