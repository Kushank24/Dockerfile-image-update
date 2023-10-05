import java.util.*;

class Test
{
    public static void main(String []args)
    {
        int a = 0;
        int b = 0;
        int c = 1;
        System.out.println("----- Welcome to Flipkart Calculator -----");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number: ");
        if (sc.hasNextInt()) {
            a = sc.nextInt();
            System.out.println("You entered: " + a);
        } else {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
        System.out.println("Enter 2nd Number: ");
        if (sc.hasNextInt()) {
            b = sc.nextInt();
            System.out.println("You entered: " + b);
        } else {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
        System.out.println("What operation do you want to perform? \n 1. Add the numbers \n 2. Subtract the numbers \n 3. Multiply the numbers \n 4. Divide the numbers");
        System.out.println("Enter your choice: ");
        if (sc.hasNextInt()) {
            c = sc.nextInt();
            System.out.println("You entered: " + c);
        } else {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
        switch(c)
        {
            case 1:
                System.out.printf("The sum of numbers is: %d\n", a+b);
                break;
            case 2:
                System.out.printf("The diffference of number is: %d\n", a-b);
                break;
            case 3:
                System.out.printf("The product of number is: %d\n",a*b);
                break;
            case 4:
                System.out.printf("The division of number is: %d\n" + a/b);
                break;
        }
    }
}
