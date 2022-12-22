package Q3ModifiersAndInkapsulation;
//В данном файле мы обратились к приватным свойствам, через геттеры
//Это и есть ИНКАПСУЛЯЦИЯ. Когда можно получить приватную информацию через "ручки" - геттеры. (Изменить через сетторы)
import Q3ModifiersAndInkapsulation.Person;

public class StartMain {
    public static void main(String[] args) {
        Person vasya = new Person("Вася;", 18);//Создал несколько объектов через конструктор
        Person petya = new Person("Петя;", 28);
        Person kolya = new Person("Коля;", 43);
        Person agent007 = new Person("Женька Болт;", 1007);

        System.out.println("Имя: " + vasya.getName() + " Возраст:  " + vasya.getAge() + " Статус:  " + vasya.getStatus());//Вывел информацию о созданных объектах
        System.out.println("Имя: " + petya.getName() + " Возраст:  " + petya.getAge());
        System.out.println("Имя: " + kolya.getName() + " Возраст:  " + kolya.getAge());
        System.out.println("Имя: " + agent007.getName() + " Возраст:  " + agent007.getAge());
        vasya.setAge(123); //Через сеттер обновили возраст Василия
        System.out.println("Имя: " + vasya.getName() + " Возраст:  " + vasya.getAge());//Получили новый возраст василия
    }
}
