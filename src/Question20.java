import java.util.Scanner;

public class Question20 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of n");
        int no=sc.nextInt();
        int i,j;
        for(i=1;i<=5;i++){
            for(j=1;j<=i;j++){
                System.out.println(j);
                System.out.println(" ");
            }

        }
    }
}
