package Q3EventInterface;
//В данном классе создаем реализацию интерфейса. (То действие, которое происходит при нажатии кнопки)
public class ButtonClickTv implements EventHandler {//Класс имплементит интерфейс
    //Начало реализации интерфейса

        boolean on = false;
        public void execute() {
        if (on) {
            System.out.println("Телевизор выключен");
            on = false;
        } else {
            System.out.println("Телевизор включен");
            on = true;
        }
    }
    }

