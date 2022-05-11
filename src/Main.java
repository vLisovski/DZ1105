import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int countPersons = 0;

        System.out.print("введите кол-во людей в компании ");
        countPersons = scanner.nextInt();

        int[] personsSalaries = new int[countPersons];

        for (int i = 0; i < personsSalaries.length; i++) {
            personsSalaries[i] = random.nextInt(100000-20000+1)-1000;
        }


    }
}
