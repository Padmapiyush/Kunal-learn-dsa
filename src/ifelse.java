import java.util.Scanner; // Import the Scanner class

class Ifelse {
    /*
    * Less than: a < b
    Less than or equal to: a <= b
    Greater than: a > b
    Greater than or equal to: a >= b
    Equal to a == b
    Not Equal to: a != b
    * */
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner myObj = new Scanner(System.in); // Create a Scanner object
        int x = myObj.nextInt(); // Read user input

        if ( x >= 18){
            System.out.print("You can Vote");
        } else { System.out.print("You can't vote"); }
    }
}