import java.util.Scanner;

public class kilometertomiles {
    public static void main(String[] args) {
        Scanner kilo = new Scanner(System.in);
        System.out.println("Convert Kilo to miles");
        float kilometes = kilo.nextFloat();
        float miles =(float)(0.6213711922 * kilometes);
        System.out.println("Distance in miles: "+miles+" miles");
    }
}
