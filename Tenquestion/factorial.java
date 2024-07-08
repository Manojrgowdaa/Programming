import java.util.Scanner;
 class factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();

       
        long factorial = 1; 

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        // Output the result
        System.out.println("Factorial of " + number + " is: " + factorial);

    }
}
