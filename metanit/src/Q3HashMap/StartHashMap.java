package Q3HashMap;

import java.util.HashMap;
import java.util.Map;


public class StartHashMap {
    public static void main(String[] args) {

        Map<Integer, String> person = new HashMap<Integer, String>();//Создали пустую коллекцию
        person.put(1, "Пупкин Василий Анатольевич");//Добавили персонажей
        person.put(2, "Пупкин Аркадий Анатольевич");
        person.put(3, "Пупкин Сергей Анатольевич");
        person.put(4, "Пупкин Евгений Анатольевич");
        System.out.println("Key: " + person.keySet());//Получили все ключи коллекции
        System.out.println("Value: " + person.values());//Получили все значений коллекции
        System.out.println(person.get(3));//Получить элемент по ключу
    }
}
