import java.util.Scanner;

public class Question28 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int no = sc.nextInt();
        if (no > 0) {
            if (no < 1) {
                System.out.println("positively small no");
            }
            if (no > 1000000) {
                System.out.println("positively larger no");
            }
        }
        if (no < 0) {
            if (no > 1) {
            }
        }

    }
}