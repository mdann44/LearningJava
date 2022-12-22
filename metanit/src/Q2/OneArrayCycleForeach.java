package Q2;

public class OneArrayCycleForeach {
    public static void main(String[] args) {
        int[] array = new int[] { 1, 2, 3, 4, 5 }; // Создали массив
        for (int i=0; i<array.length;i++){ // Запустили цикл, задали условие от длины массива
            array[i] = array[i] * 2; // Умножили каждый элемент на 2
            System.out.println(array[i]); // Вывели в консоль каждый измененный элемент
    }
}
}
