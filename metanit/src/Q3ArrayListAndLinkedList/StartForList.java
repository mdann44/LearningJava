package Q3ArrayListAndLinkedList;

import Q3PracticeFinal.Person;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class StartForList {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();//Создали лист
        Person person1 = new Person("Первый дядя");//Создали персону 1
        Person person2 = new Person("Второй дядя");//Создали персону 2

        list.add(person1);//Добавили персону1 в созданный лист
        list.add(person2);//Добавили персону2 в созданный лист
        //Добавим одну и ту же персону несколько раз (Добавится успешно)
        list.add(person2);//Добавили персону2 в созданный лист
        list.add(person2);//Добавили персону2 в созданный лист
        list.add(person2);//Добавили персону2 в созданный лист

        System.out.println(list.get(0));//Получили элементы листа по индексу
        System.out.println(list.get(1));//Получили элементы листа по индексу
        System.out.println(list.size());//Получили количество элементов в листе

        //Удаление существующего элемента
        boolean remove = list.remove(person1);//Удалили элемент из листа.
        if (remove) {//Если при удалении вернулось true, то выводим сообщение
            System.out.println("Элемент из " + person1 + " удален");
        } else System.out.println("Элемент не найден");

        //Удаление несуществующего элемента
        boolean remove1 = list.remove(person1);//Удалили элемент из листа.
        if (remove1) {//Если при удалении вернулось true, то выводим сообщение
            System.out.println("Элемент из " + person1 + " удален");
        } else System.out.println("Элемент не найден");
        System.out.println(list);//Получить весь список

        //Создадим LinkedList
        LinkedList<Person> linkedList = new LinkedList<>();//Создали линкед лист
        Person person3 = new Person("Третий дядя");//Создали персону 3
        Person person4 = new Person("Четвертый дядя");//Создали персону 4
        Person person5 = new Person("Пятый дядя");//Создали персону 5
        linkedList.add(person3);
        linkedList.add(person4);
        linkedList.add(person5);
        System.out.println("Изменили " + linkedList.set(1, person1)); //Заменили по индексу один элемент на другой
        System.out.println(linkedList.get(1));
        System.out.println(linkedList);//Получить весь список


    }
}
