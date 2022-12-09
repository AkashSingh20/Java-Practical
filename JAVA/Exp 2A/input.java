import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class input
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" Enter a string ");
        String name = reader.readLine();

        System.out.println("Enter an integer value");
        String str1= reader.readLine();
        int num1 = Integer.parseInt(str1);
        System.out.println("Enter a float value");
        String str2= reader.readLine();
        float num2=Float.parseFloat(str2);

        System.out.println("The output is ");
        System.out.println(name);
        System.out.println(num1);
        System.out.println(num2);
    }
}