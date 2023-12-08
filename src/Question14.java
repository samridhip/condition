import java.util.Scanner;

import static java.lang.System.in;

public class Question14 {
    public static void main(String[]args){
        int i,n;
        System.out.println("Enter the numbers");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=0;i<=n;i++){
            System.out.println(n+"X"+i+"="+n*i);
        }
    }
}
