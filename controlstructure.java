import java.util.Scanner;

public class controlstructure {
    public static void main(String[] args) {
        // Checking for Voting eligiable
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Age: ");
        int age = sc.nextInt();
        System.out.println((age >= 18) ? "Eligiable for voting " : "Not Eligiable for voting ");
        sc.close();

        // if-else Statment
        Scanner sc = new Scanner(system.in);
        System.out.println("Enter the first Number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second Number: ");
        int b = sc.nextInt();
        if (a > b)
            System.out.println("First Number is large");
        else
            System.out.println("Second number is large");
        sc.close();

    }
}
