import java.util.Scanner;

public class addition {
    public static void main(String[] args) {
        Scanner add = new Scanner(System.in);
        System.out.println("Enter first No.");
        int first_number = add.nextInt();
        System.out.println("Enter second No.");
        int second_number = add.nextInt();
        int sum = (first_number+second_number);
        System.out.println(sum);
    }

}
