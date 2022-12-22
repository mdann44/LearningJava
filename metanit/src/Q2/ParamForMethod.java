package Q2;

public class ParamForMethod {
    public static void main (String[] args){
        int a = 6; //Объявили переменную
        int b = 8;
        sum(a,b); //Вызвали метод, подставив переменные
        sum(3,a); //Вызвали метод, подставив значение + переменную
        sum(5,34); //Вызвали метод, подставив значения
        display("Вася Пупкин", 22); //Вызвали метод, подставив значения разного типа
        display("Дядя Фёдор",55);
        sum_undefiled_len("Сумма равна", 2,2,2);
        sum_undefiled_len("Другая сумма равна", 3,3,3);

    }
    static void sum (int x, int y){
        int z = x + y;
        System.out.println(z);
    }
    static void display(String name, int age){

        System.out.println(name);
        System.out.println(age);
    }
    // Создадим метод, который не знает, сколько параметров в него передается
    static void sum_undefiled_len (String message, int ...nums){ //На вход обязательный параметр message +
        //Необязательный параметр nums (Троеточие говорит о необязательности
        System.out.println(message); //Выводим сообщение message
        int result = 1; // Создали переменную
        for (int x:nums) // Цикл по массиву nums, где при каждой итерации x присваивается значение
            result+=x; // Результатом будет сумма всех x и переменной result
        System.out.println(result);
    }
}