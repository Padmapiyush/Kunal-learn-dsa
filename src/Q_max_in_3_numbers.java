import java.util.Scanner;

public class Q_max_in_3_numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        //Q: Find the largest of the 3 numbers
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max  = c;
        }
        System.out.println(max);
    }
}