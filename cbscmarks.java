import java.util.Scanner;
public class cbscmarks {
    public static void main(String args[]){
        float total = 0;
        System.out.println("WELCOME TO THE CBSC PERCENTAGE MAKER..");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Total marks of the subject(Eg:- 100,80):");
        int total_marks = input.nextInt();
        System.out.println("Enter Marks of Subject 1:");
        float s1 = input.nextFloat();
        System.out.println("Enter Marks of Subject 2:");
        float s2 = input.nextFloat();
        System.out.println("Enter Marks of Subject 3:");
        float s3 = input.nextFloat();
        System.out.println("Enter Marks of Subject 4:");
        float s4 = input.nextFloat();
        System.out.println("Enter Marks of Subject 5:");
        float s5 = input.nextFloat();
        total = s1+s2+s3+s4+s5;
        float per = total * 100 /(total_marks*5);
        System.out.println("Your total Percentage = " +per);
    }

    
}
