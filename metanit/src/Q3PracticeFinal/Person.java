package Q3PracticeFinal;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return null;
    }

    @Override
    public String toString() { //Задали формат получения значения переменной
        return "Класс Person{" +
                "name='" + name + '\'' +
                '}';
    }

}
