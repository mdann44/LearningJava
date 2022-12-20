package Example_theme_2;

public class CycleFor {
    public static void main(String[] args) {
        int n = 10;
        for(int i=0, j = n - 1; i < j; i++, j--){

            System.out.println(i * j);
        }
    }
}
