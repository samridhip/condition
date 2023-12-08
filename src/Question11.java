import java.util.Scanner;

public class Question11 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter nth term");
        int no=sc.nextInt();
        int i;
        int sum=0;
        for(i=1;i<=no;i++){
            System.out.println(i);
            sum+=i;
        }
        System.out.println("The sum of n natural number is "+sum);
    }
}
