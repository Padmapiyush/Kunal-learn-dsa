import java.util.Scanner; // Import the Scanner class
class While {
    public static void main(String[] args) {
        System.out.println("Enter num to print table");
        Scanner myObj = new Scanner(System.in); // Create a Scanner object
        int num = myObj.nextInt();

        int i = 1;
        while (i <= 10) {
            System.out.println(num*i);
            i++;
        }
    }
}