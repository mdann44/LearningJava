package Q3Interfaces;

public class Animal implements InfoInterface {
    public static int id; // просто переменная для всего класса
    public static int counter; // переменная счетчика для всего класса

    static {
        counter = 1;//Инициализировали счетчик (Делается один раз - с какого числа начнем счет)
    }

    public Animal() {
        id = counter++;
    }

    public void sleep() {
        System.out.println("Я - животное! Отстань! Я сплю");
    }
    @Override
    public void infoInterface() {
        System.out.print("id = " + Animal.id+" "+"Животное\n");

    }
}
