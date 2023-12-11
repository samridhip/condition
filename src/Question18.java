import java.util.Scanner;

public class Question18 {
    public static void main(String[]args){
        int i,n,j,k=1;
        System.out.println("Enter the nos of n");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(k++);

            }
            System.out.println(" ");
        }
    }
}
