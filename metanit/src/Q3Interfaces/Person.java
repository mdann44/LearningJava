package Q3Interfaces;

public class Person implements InfoInterface {//Класс Person реализует интерфейсы
    public String name; //Объявили переменную в классе
    public Person(String name){//Создали конструктор, принимающий на вход переменную
        this.name=name;
    }
    public void sayHello(){ //Создали метод, характерный ТОЛЬКО для этого класса
        System.out.println("Привет, я - человек");
    }

    @Override
    public void infoInterface() {//Реализовали интерфейс
        System.out.println("Имя: "+this.name);
    }

}
