package Q3EventInterface;

public class Start {
    public static void main(String[] args) {
        Button button = new Button(new ButtonClickTest());//При создании кнопки, устанавливаем обработчик нажатия
        button.click();

        Button tvButton = new Button(new ButtonClickTv() {//Вызываем другой обработчик для ТВ
        });
        tvButton.click();
        tvButton.click();
        tvButton.click();
    }
}
