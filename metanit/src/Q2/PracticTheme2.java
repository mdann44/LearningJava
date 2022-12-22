/* Пока что, тут попробую придумать что-нибудь и, реализовать это.

1. Пусть программа вычисляет возраст пользователя +
2. Пусть подбирает правильные окончания при выводе в консоль +
3. Пусть спрашивает, хочет ли человек узнать возраст +
4. Учесть, что человек может ввести только Y или N +
5. Учесть отрицательный возраст +
 */
package Q2;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Scanner;

public class PracticTheme2 {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.print("Вы хотите узнать, сколько вам лет? (Y/N): ");
        String answer_user = in.next();

        while (true) {
            while ((answer_user.equalsIgnoreCase("Y")))//Сравниваем строку без учета регистра
            {
                old_years();//Вызываем метод вычисления возраста
                System.out.print("Вы хотите узнать, сколько вам лет? (Y/N): ");
                answer_user = in.next();//Присваиваем новое значение и, перезапускаем/останавливаем программу

            }
            if ((!answer_user.equalsIgnoreCase("N") && (!answer_user.equalsIgnoreCase("Y")))) {
                System.out.print(" Укажите один из вариантов (Y/N): ");
                answer_user = in.next();
            } else if ((answer_user.equalsIgnoreCase("N"))) {
                System.out.print("Очень жаль. Оставайтесь в неведении");
                break;
            }
        }
    }

    static void old_years() {
        Calendar cal = Calendar.getInstance(); //Получаем текущую дату
        Scanner in = new Scanner(System.in);
        System.out.print("Укажите год вашего рождения: ");
        int birth_year = in.nextInt(); //Получаем от пользователя его год рождения
        double year = cal.get(Calendar.YEAR) - birth_year; //Вычисляем возраст
        NumberFormat format = new DecimalFormat("0");//Указали формат чисел для вывода(Удалить дробь)
        if ((year % 10 == 0.1 | year % 10 == 1) && year != 11 && year > 0 && year <= 100) {
            System.out.println(format.format(year) + " год");
        } else if
        (((year % 10 == 0.2 | year % 10 == 2) && year != 12 && year > 0 && year <= 100) |
                        ((year % 10 == 0.3 | year % 10 == 3) && year != 13 && year > 0 && year <= 100) |
                        ((year % 10 == 0.4 | year % 10 == 4) && year != 14 && year > 0 && year <= 100)) {
            System.out.println(format.format(year) + " года");
        } else if
        (((year % 10 == 0.5 | year % 10 == 5) && year > 0 && year <= 100) |
                        ((year % 10 == 0.6 | year % 10 == 6) && year > 0 && year <= 100) |
                        ((year % 10 == 0.7 | year % 10 == 7) && year > 0 && year <= 100) |
                        ((year % 10 == 0.8 | year % 10 == 8) && year > 0 && year <= 100) |
                        ((year % 10 == 0.9 | year % 10 == 9) && year > 0 && year <= 100) |
                        (year % 10 == 0 && year > 0 && year <= 100) |
                        (year == 11) |
                        (year == 12) |
                        (year == 13) |
                        (year == 14)) {
            System.out.println(format.format(year) + " лет");
        } else if (year < 0) {
            System.out.println(format.format(year) + " Вы ещё не родились");
        } else if (year > 100) {
            System.out.println("Ничего себе! Ваш возраст: " + format.format(year) + "! Наше почтение, вам уже больше 100!");
        } else {
            System.out.println("Что-то непонятное");
        }

    }

}

