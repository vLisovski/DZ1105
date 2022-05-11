import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fullSalary = 0;
        int iterationSum = 0;
        int firstMonthSum = 0;
        int secondMonthSum = 0;
        int thirdMonthSum = 0;
        int iterationSalary=0;
        int[] employeeQuarterSum = new int[12];
        for (int i = 1; i <= 12; i++) {
            System.out.print("Enter the salary of the employee number " + i + " ");
            for (int j = 1; j <= 3; j++) {
                System.out.println("for month number " + j + ":");
                iterationSalary = sc.nextInt();
                iterationSum += iterationSalary;
                switch (j) {
                    case 1:
                        firstMonthSum += iterationSalary;
                        break;
                    case 2:
                        secondMonthSum += iterationSalary;
                        break;
                    case 3:
                        thirdMonthSum += iterationSalary;
                        break;
                }
            }
            employeeQuarterSum[i - 1] = iterationSum;
            fullSalary += iterationSum;
            iterationSum = 0;
        }

        System.out.println("Full salary for 12 months is " + fullSalary);
        for (int j = 1; j <= 12; j++) {
            System.out.println("Quart salary of the employee number " + j + " is " + employeeQuarterSum[j - 1]);
        }
        System.out.println("Sum of salaries of the first month: " + firstMonthSum);
        System.out.println("Sum of salaries of the second month: " + secondMonthSum);
        System.out.println("Sum of salaries of the third month: " + thirdMonthSum);
    }
}
