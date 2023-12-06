import java.util.Scanner;

public class Question2 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of a");
        int a=sc.nextInt();
        System.out.println("Enter value of b");
        int b=sc.nextInt();
        System.out.println("Enter value of c");
        int c=sc.nextInt();
        int i = a * c;
        double abc=b*b-4*i;
        if(abc>0.0){
          double r1=(-b+Math.pow(abc,0.5))/2*a;
          double r2=(-b-Math.pow(abc,0.5))/2*a;
          System.out.println("The roots are"+r1+"and"+r2);
        }
        else if (abc==0){
            double r1=(-b/2*a);
            System.out.println("The roots are"+r1);
        }
        else{
            System.out.println("the equation has no roots");
        }



    }
}
