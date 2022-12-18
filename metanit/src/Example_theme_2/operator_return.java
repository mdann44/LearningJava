package Example_theme_2;

import java.util.Scanner;

public class operator_return {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in); //Создадим сканер, для считывания из консоли
        System.out.print("Укажите значение часа, для анализа от 0 до 24: ");
        int hour_in_console = in.nextInt(); //Создадим перменную, полученную из консоли
        System.out.println(daytime(hour_in_console)); //Выведем в результат метода, с данными из консоли

    }
    static String daytime (int hour){ //Метод, обрабатывающий данные из консоли
        if (hour > 24 || hour < 0)
            return "Указано некорректное значение";
        else if (hour > 21 || hour < 6)
            return "Доброй ночи";
        else if (hour >= 15)
            return "Доброго вечера";
        else if (hour >= 11)
            return "После полудня";
        else
            return "Доброго утра";
    }
}