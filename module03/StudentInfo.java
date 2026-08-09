import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Age: ");
        int age = sc.nextInt();
        System.out.print("CGPA: ");
        double cgpa = sc.nextDouble();

        System.out.printf("%n===== Student =====%n");
        System.out.printf("Name : %s%n", name);
        System.out.printf("Age  : %d%n", age);
        System.out.printf("CGPA : %.2f%n", cgpa);

        sc.close();
    }
}
