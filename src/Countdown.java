import java.util.Scanner;
public class Countdown
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What number do you want to start at? ");
        int userNumber = Integer.parseInt(scanner.nextLine());

        int countdown = userNumber;
        while(countdown >= 0)
        {
            System.out.print(countdown + ", ");
            countdown--;
        }
        System.out.print("Time's up! " + userNumber + " seconds have passed!");
    }
}