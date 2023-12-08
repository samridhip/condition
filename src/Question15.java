import java.util.Scanner;

public class Question15 {
    public static void main(String[]args){
        int i,n,sum=0;
        System.out.println("Enter the number");
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("The odd nos are");
        for(i=0;i<=n;i++){
            System.out.println(2*i-1);
            sum+=2*i-1;
        }
       System.out.println("The sum of odd nos is"+sum);
    }
}
