/*В данном файле мы описываем характеристики, свойственные каждой персоне в классе.
Создаем конструктор
*/
package Q3ClassObjectConstructor;

public class ObjectPerson { //Создали публичный класс, в котором описали поля(характеристики) для объектов
    String name; //Поле, характеризующее объекты класса
    int age; //Поле, характеризующее объекты класса
    //Создаем конструктор, объединяющий в себе поля, характеризующие объекты класса
    public ObjectPerson(String namePerson, int agePerson) {
        name = namePerson;
        age = agePerson;

    }
}