/*
// Timer Program
import java.util.Scanner;
public class OffByOne
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What number do you want to count up to? ");
        int countTo = scanner.nextInt();

        int counter = 1;
        while (counter < countTo)
        {
            System.out.println(counter);
            counter++;
        }
    }
}
*/

/*
// Fixing the Error: Method 1
import java.util.Scanner;
public class OffByOne
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What number do you want to count up to? ");
        int countTo = scanner.nextInt();

        int counter = 1;
        while (counter <= countTo)
        {
            System.out.println(counter);
            counter++;
        }
    }
}
*/

/*
// Fixing the Error: Method 2
import java.util.Scanner;
public class OffByOne
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What number do you want to count up to? ");
        int countTo = scanner.nextInt();

        int counter = 0;
        while (counter < countTo)
        {
            counter++;
            System.out.println(counter);
        }
    }
}
*/