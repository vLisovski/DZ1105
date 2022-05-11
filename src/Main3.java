import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        //  Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            System.out.println();
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
        }

        System.out.println();

        for (int i = 5; i <= 9; i++) {
            System.out.println();
            for (int j = 9; j >= i; j--) {
                System.out.print(i);
            }
        }

    }
}
