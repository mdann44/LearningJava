package Example_theme_2;

public class run_method_in_main {
    public static void main (String[] args){ // Основной метод, вызывающий остальные
        hello();
        welcome();
        hello();
    }
    static void hello(){ // Вызываемый метод
        System.out.println("Hello!");
    }
    static void welcome(){ // Вызываемый метод
        System.out.println("Welcome!");
    }
}