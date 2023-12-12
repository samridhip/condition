import java.util.Scanner;

public class Question32 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int a=sc.nextInt();
        System.out.println("Enter second number");
        int b= sc.nextInt();
        System.out.println("Enter third number");
        int c=sc.nextInt();
        if(a>b&&b>c){
            System.out.println("The numbers are decreasing");
                }
            else if(a<b&&b<c){
                System.out.println("The numbers are increasing");
            }
            else{
                System.out.println("Neither increasing nor decreasing");
            }
        }
    }

