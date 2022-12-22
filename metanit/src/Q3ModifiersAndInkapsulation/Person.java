package Q3ModifiersAndInkapsulation;
//В данном файле мы сделали приватными свойства объектов и, предоставили к ним геттеры getName(),getAge(),getStatus()

public class Person { //Создали публичный класс, в котором описали поля(характеристики) для объектов
    private String name; //ПРИВАТНОЕ Поле, характеризующее объекты класса
    private int age; //ПРИВАТНОЕ Поле, характеризующее объекты класса
    private String status; //ПРИВАТНОЕ Объявил дополнительное поле, которое присвоится всем объектам, при создании

    public String getName(){
        return name + "Нечто"; //Инкапсуляция позволяет внести изменения и, они подтянутся там, где используется геттер
    }
    public int getAge(){ //Просто геттер, для получения
        return age;
    }
    public String getStatus(){
        return status;
    }
    public void setAge(int age){
        this.age = age; //Сеттер для изменения возраста
    }
    //Создаем конструктор, объединяющий в себе поля, характеризующие объекты класса
    public Person(String namePerson, int agePerson) {
        name = namePerson; //Поле, проставляемое при создании, через конструктор
        age = agePerson;
        status = "active"; //Поле, проставляемое всем объектам класса, при создании, автоматически
    }
}
