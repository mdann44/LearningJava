import java.util.Scanner;

public class cycle_for {
    public static void main(String[] args) {
        int n = 10;
        for(int i=0, j = n - 1; i < j; i++, j--){

            System.out.println(i * j);
        }
    }
}
