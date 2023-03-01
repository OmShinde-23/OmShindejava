import java.util.Scanner;
public class Marks {
    public static void main(String args[])
    {
        System.out.println("Enter your 5 subjects marks:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your MARATHI subject Marks:");
        int a = sc.nextInt();
        System.out.println("Enter your ENGLISH subject Marks:");
        int b = sc.nextInt();
        System.out.println("Enter your MATHS subject Marks:");
        int c = sc.nextInt();
        System.out.println("Enter your SCIENCE subject Marks:");
        int d = sc.nextInt();
        System.out.println("Enter your HISTORY subject Marks:");
        int e = sc.nextInt();
        
        float total = (a+b+c+d+e);
        float per = (total/500*100);
        System.out.println("Your percentage is" +per +"Congraulations!!!");
    }
}
