import java.util.Scanner;
public class moreaboutloops {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers? ");
        int numbers = scanner.nextInt();

        int maxNum = Integer.MIN_VALUE;
        for(int x = 0; x < numbers; x++ )
        {
           System.out.println("Enter a number: ");
           int num1 = scanner.nextInt();

           if (num1 > maxNum)
           {
               maxNum = num1;
           }
        }
        System.out.println("The largest number was " + maxNum);
    }
}
