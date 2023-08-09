import java.util.Scanner; // Import the Scanner class
class For {
    public static void main(String[] args) {
        System.out.println("Enter num to print table");
        Scanner myObj = new Scanner(System.in); // Create a Scanner object
        int num = myObj.nextInt();

        for(int i = 1; i<=10; i++){
            System.out.println(num*i);
        }
    }
}