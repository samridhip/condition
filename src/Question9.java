import java.util.Scanner;

public class Question9 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the year");
        int year=sc.nextInt();
        boolean x=year%400==0;
        boolean y=year%100!=0;
        boolean  z=year%4==0;
        if(x&&(y||z)){
            System.out.println("The year is leap year");
        }
        else
            System.out.println("The year is not a leap year");
    }
}
