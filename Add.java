import java.util.Scanner;
public class Add{
    public static void main(String args[])
    {
        int a, b, sum;

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter value of a:");
        a = sc.nextInt();

        System.out.println("Enter value of b:");
        b = sc.nextInt();

        sum = a+b;

        System.out.println("The value of a and b is:");
        System.out.println(sum);
    }
}