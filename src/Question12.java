import java.util.Scanner;

public class Question12 {
    public static void main(String[]args) {
    int i,n=0,s=0;
    double avg;
    System.out.println("Enter the first 5 number");
    for(i=0;i<5;i++){
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        s+=n;
    }
    avg=s/5;
    System.out.println("The sum of the numbers are "+s);

    }
}
