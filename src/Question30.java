import java.util.Scanner;

public class Question30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first no");
        int a = sc.nextInt();
        System.out.println("Enter the second no");
        int b = sc.nextInt();
        System.out.println("Enter the third no");
        int c = sc.nextInt();
        if ( a == b && a == c){
            System.out.println("All nos are equal");
        }
        else if(a==b||b==c||c==a){
            System.out.println("neither all are equal or different");
        }
        else{
            System.out.println("all no are different ");
        }
    }
}