import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        
		Scanner in = new Scanner(System.in);

        System.out.println("Enter a year: ");
        int year = in.nextInt();

        boolean divisibleByFour = (year % 4) == 0;
        boolean divisibleByHundred = (year % 100) != 0 || (year % 400) == 0;

        System.out.println(year + " is a leap year: " + (divisibleByFour && divisibleByHundred));
    }
}
