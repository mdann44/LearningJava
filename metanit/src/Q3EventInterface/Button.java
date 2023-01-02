package Q3EventInterface;
//Тут Конструктор, принимающий на вход объект интерфейса
public class Button {
    EventHandler handler;//Конструктор EventHandler
    Button(EventHandler action){
        this.handler=action;
    }
    public void click(){//Метод, имитирующий нажатие
        handler.execute();//Вызывает событие через конструктор
    }
}
