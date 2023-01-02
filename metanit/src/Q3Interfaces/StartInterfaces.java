package Q3Interfaces;

import java.util.UUID;

public class StartInterfaces {
    public static void main(String[] args){


        Animal animal1 = new Animal();
        Person person1 = new Person("Vasya");
        //animal1.sleep();
        //person1.sayHello();
        animal1.infoInterface();
        //person1.infoInterface();

        Animal animal2 = new Animal();
        animal2.infoInterface();
        InfoInterface infoInterface = new Animal();
        infoInterface.infoInterface();


    }
}
