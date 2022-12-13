import java.util.Scanner;

class Subject{
    int max = 100;
    float obtained;
}
public class umang {
    public static void main(String[] args) {
        Subject s1 = new Subject();
        Scanner percentage = new Scanner(System.in);
        System.out.println("Enter your English exam marks");
        s1.obtained = percentage.nextInt();
        Subject s2 = new Subject();
        System.out.println("Enter your Maths exam marks");
        s2.obtained = percentage.nextInt();
        Subject s3 = new Subject();
        System.out.println("Enter your Social Science marks");
        s3.obtained = percentage.nextInt();
        Subject s4 = new Subject();
        System.out.println("Enter your Science marks");
        s4.obtained = percentage.nextInt();
        Subject s5 = new Subject();
        System.out.println("Enter your Hindi marks");
        s5.obtained = percentage.nextInt();
        float sum = (s1.obtained+s2.obtained+s3.obtained+s4.obtained+s5.obtained);
        float per = (sum*100)/500;
        System.out.println(per);

    }
}
         

