package Q2;

public class RunMethodInMain {
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