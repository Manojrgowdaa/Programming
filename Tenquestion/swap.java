import java.util.Scanner;
 class Swap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        
        System.out.println("Before swapping:");
        System.out.println("First number: " + number1);
        System.out.println("Second number: " + number2);

        
        int temp = number1;
        number1 = number2;
        number2 = temp;

       
        System.out.println("After swapping:");
        System.out.println("First number: " + number1);
        System.out.println("Second number: " + number2);

        scanner.close();
    }
}
