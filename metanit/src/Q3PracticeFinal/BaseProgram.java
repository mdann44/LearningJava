package Q3PracticeFinal;

import java.util.Scanner;

public class BaseProgram {
    public void base(){
    Scanner in = new Scanner(System.in);
        System.out.print("Вы хотите просмотреть список команд?\nВаш ответ(Y/N): ");
    String answer_user_start = in.next();

        while (true) {
        while (answer_user_start.equalsIgnoreCase("y")) {
            System.out.println("Список доступных команд\nУкажите номер одного из вариантов");

            int answer_user = in.nextInt();

            //Список доступных команд
            if (answer_user == 0) {
                System.out.println("Тут запускаем нулевой сценарий");
                System.out.print("Продолжим работу программы\nВаш ответ(Y/N): ");
                answer_user_start = in.next();
                break;

            }
            if ((answer_user == 1)&&(!answer_user_start.equalsIgnoreCase("n"))) {
                System.out.println("Тут запускаем первый сценарий");
                System.out.print("Продолжим работу программы\nВаш ответ(Y/N): ");
                answer_user_start = in.next();
                break;
            }
        }
        if (answer_user_start.equalsIgnoreCase("N")) {
            System.out.print("Очень жаль. Оставайтесь в неведении");
            break;
        }

    }
}}
