import java.util.Scanner;

public class Q_count_occurence {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = 435566;

        int count = 0;
        while (n>0){
            int rem = n % 10;
            if (rem == 5){
                count++;
            }
            n /= 10;
        }
        System.out.println(count);
    }
    }
