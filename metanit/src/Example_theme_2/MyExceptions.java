package Example_theme_2;
//Тут вынесены обработанные ошибки
public class MyExceptions extends Throwable{
    public MyExceptions() {
        super("Используйте допустимые варианты (Y/N): ");
    }
}
