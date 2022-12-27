package Q3Legacy;
// Это стартовый класс, через который мы запускаем программу
public class StartProgrammLegacy {
    public static void main(String[] args){
        Dogs jack = new Dogs();//Создали объект "Собака" = "Джек"
        jack.who();// Вызвали методы класса Animal. Если для Джека, который в классе "Собаки" этот метод определен, то выведется он, а не общий
        jack.eat();
        jack.sleep();
        jack.onlyDog();
        Cats sam = new Cats();// Создали объект "Кошка" = "Сэм"
        sam.who(); //Кто этот зверь?
        sam.eat();//Что он есть?
        sam.sleep();//Он любит спать?
    }
}
