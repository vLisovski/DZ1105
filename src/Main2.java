import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter x:");
        int x = sc.nextInt();
        int result = 0;
        for (int i = 1; i < x; i++) {
            for (int j = 1; j < x && j >= i; j++) {
                for (int k = 1; k < x && k >= j; k++) {
                    for (int l = 1; l < x && l >= k; l++) {
                        if (i + j + k + l == x) {
                            result++;
                        }
                    }
                }
            }
        }
        System.out.println(result);
    }
}
