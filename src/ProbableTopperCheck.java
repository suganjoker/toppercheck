import java.util.Scanner;

public class ProbableTopperCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        boolean isProbableTopper = checkProbableTopper(number);
        System.out.println(isProbableTopper);

        scanner.close();
    }

    public static boolean checkProbableTopper(int number) {
        int oddSum = 0;
        int evenSum = 0;
        int digit;
        int position = 1;

        while (number > 0) {
            digit = number % 10;

            if (position % 2 == 0) {
                evenSum += digit;
            } else {
                oddSum += digit;
            }

            number /= 10;
            position++;
        }

        return oddSum == evenSum;
    }
}
