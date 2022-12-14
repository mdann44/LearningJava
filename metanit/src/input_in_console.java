import java.util.Scanner;
public class input_in_console {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = in.nextLine();
        System.out.print("Введите возраст: ");
        int age = in.nextInt();
        System.out.print("Введите рост, м.: ");
        float height = in.nextFloat();
        System.out.printf("Имя: %s Возраст: %d Рост: %f", name, age, height);
    }
}
