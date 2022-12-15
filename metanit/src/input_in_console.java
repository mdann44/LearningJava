import java.util.Scanner; // импортируем Scanner из пакета java.util
public class input_in_console { // объявили класс
    public static void main(String[] args) { // объявили метод, внутри которого функции
        Scanner in = new Scanner(System.in); // создали сканер в функции (для чтения из консоли)
        System.out.print("Введите имя: "); // отображаем сообщение пользователю
        String name = in.nextLine(); // считываем из консоли строку
        System.out.print("Введите возраст: ");
        int age = in.nextInt(); // считываем из консоли целые числа
        System.out.print("Введите рост, м.: ");
        float height = in.nextFloat(); // считываем из консоли числа с плавающей запятой
        System.out.printf("Имя: %s Возраст: %d Рост: %f", name, age, height); // выводим суммарную информацию
    }
}
