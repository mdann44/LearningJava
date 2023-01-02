package Q3Interfaces;

import java.util.UUID;

public class Animal implements InfoInterface {
    public static int id; // просто переменная для всего класса
    public static int counter; // переменная счетчика для всего класса

    static {
        counter = 1;//Инициализировали счетчик (Делается один раз - с какого числа начнем счет)
    }


    public Animal() {
        id = counter++;//Каждую новую итерацию присваиваем увеличенный счетчик на 1
    }
    public void sleep() {
        System.out.println("Я - животное! Отстань! Я сплю");
    }
    @Override
    public void infoInterface() {
        System.out.print("id = " + Animal.id+" "+"Животное\n");

    }

}
