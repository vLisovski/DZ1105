
public class Main5 {
    public static void main(String[] args) {
       int[] numbers = {1,2,3,4,5,1,2,3,4};

        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = i; j < 5+i; j++) {
                System.out.print(numbers[j]);
            }
        }
    }
}
