import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        int year = 2026;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your date of birth: ");
        int birthYear = sc.nextInt();
        System.out.printf("Your age is %d.", year-birthYear);
    }
}
