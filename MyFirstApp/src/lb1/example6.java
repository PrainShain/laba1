package lb1;

import java.util.Scanner;

public class example6 {    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Введите Фамилию: ");
    String surname = in.nextLine();

    System.out.println("Введите Имя: ");
    String name = in.nextLine();

    System.out.println("Введите Отчество: ");
    String patronymic = in.nextLine();

    System.out.println("Hello " + surname + " " + name + " " + patronymic);
    in.close();
}
}
