import java.util.Scanner;

public class nestedif {
    public static void main(String[] args) {
        // int age=65;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age");
        int age = sc.nextInt();

        if(age>=18)
        {

            if(age>=65){
                System.out.println("Eligible to avail government fund");
            }
            else
            System.out.println("we are not eligible to vote and not avail government scheme");
        }
        else
        System.out.println("we are not eligible to voting");
    }
}
