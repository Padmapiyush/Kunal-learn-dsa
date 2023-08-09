import java.util.Scanner; // Import the Scanner class
class Switch{
    public static void main(String[] args) {
        System.out.println("Enter number between 1 to 4");
        Scanner myObj = new Scanner(System.in); // Create a Scanner object
        int num = myObj.nextInt();

        switch (num) { //The switch expression is evaluated once.
            case 1 -> System.out.println("Num is one");
            case 2 -> System.out.println("Num is two");
            case 3 -> System.out.println("Num is three");
            case 4 -> System.out.println("num is four");
            default -> // The default keyword specifies some code to run if there is no case match
                    System.out.println("You should have enter between 1 and 4");
        }
    }
}