package Q3ArrayListAndLinkedList;

public class PersonForList {
    private String name; // Объявили приватную переменную

    public PersonForList(String name) { //Создали конструктор
        this.name = name;
    }

    public String getName() { //Создали геттер для приватной переменной
        return name;
    }

    public void setName(String name) { //Создали сеттер для приватной переменной
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
