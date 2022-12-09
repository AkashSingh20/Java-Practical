import java.util.Scanner;
class GetInputFromUser
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = in.nextLine();
        System.out.println("You entered string "+s);
        System.out.println("Enter an integer value");
        int a = in.nextInt();
        System.out.println("You entered integer "+a);
        System.out.println("Enter a float value");
        float b = in.nextFloat();
        System.out.println("You entered float "+b);
    }
}