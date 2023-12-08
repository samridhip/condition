import java.util.Scanner;

public class Question13 {
    public static void main(String[]args){
        int i,n;
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        n= sc.nextInt();
        for(i=0;i<=n;i++){
            System.out.println("Number is "+n+"and the cube of the number is"+ i*i*i);

        }
    }
}
