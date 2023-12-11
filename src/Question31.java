import java.util.Scanner;

public class Question31 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first floating no");
        double a=sc.nextDouble();
        System.out.println("Enter the second floating no");
        double  b=sc.nextDouble();
        double c=Math.abs((a-b));
        if(c==0.00){
        System.out.println("They are same");
        }
        else{
            System.out.println("They are not same");
        }
    }
}
