import java.util.Scanner;

public class Question3 {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first name");
        int first=sc.nextInt();
        System.out.println("Enter the second name");
        int second=sc.nextInt();
        System.out.println("Enter the third name");
        int third=sc.nextInt();
        if(first>second)
            if(first>third){
                System.out.println("First is the largest number");
            }
        if(second>first)
            if(second>third){
                System.out.println("Second is the largest number");
            }
        if(third>first)
            if(third>second){
                System.out.println("Third is the largest number");
            }
    }
}
