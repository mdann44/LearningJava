/*В данном файле мы создаем новые персоны, запуская конструктор
 */
package Q3ClassObjectConstructor;

public class StartClassForPerson {
    public static void main(String[] args) {
        ObjectPerson vasya = new ObjectPerson("Вася;", 18);//Создал несколько объектов через конструктор
        ObjectPerson petya = new ObjectPerson("Петя;", 28);
        ObjectPerson kolya = new ObjectPerson("Коля;", 43);
        ObjectPerson agent007 = new ObjectPerson("Женька Болт;", 1007);

        System.out.println("Имя: " + vasya.name + " Возраст:  " + vasya.age + " Статус:  " + vasya.status);//Вывел информацию о созданных объектах
        System.out.println("Имя: " + petya.name + " Возраст:  " + petya.age);
        System.out.println("Имя: " + kolya.name + " Возраст:  " + kolya.age);
        System.out.println("Имя: " + agent007.name + " Возраст:  " + agent007.age);
    }
}
