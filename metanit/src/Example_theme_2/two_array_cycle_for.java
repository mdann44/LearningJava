package Example_theme_2;

public class two_array_cycle_for {
    public static void main(String[] args) {
        {
            int[][] nums = new int[][] // Создали массив
                    {
                            {1, 2, 3}, // Присвоили значения элементам 1 ой строки
                            {4, 5, 6}, // Присвоили значения элементам 2 ой строки
                            {7, 8, 9} // Присвоили значения элементам 3 ей строки
                    };
            for (int i = 0; i < nums.length; i++) { // Запустили цикл переборки строк
                for (int j = 0; j < nums[i].length; j++) { // Запустили цикл переборки столбцов
                    System.out.printf("%d ", nums[i][j]); // Вывели элементы 1я строка, 1ый столбец. 1я строка, 2ой столбец
                }
                System.out.println();
            }
        }
    }
}

