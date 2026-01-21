import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.println("What's the first number you'd like the average of?");
        int n1 = in.nextInt();
         System.out.println("What's the second number you'd like the average of?");
        int n2 = in.nextInt();
        System.out.println((n1 + n2)/2.0);
}
}