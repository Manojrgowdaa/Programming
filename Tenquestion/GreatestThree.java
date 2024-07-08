import java.util.Scanner;

public class GreatestThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int number3 = scanner.nextInt();


        
        int greatest = (number1 > number2) ? number1 : number2;
        greatest=(number3>greatest) ? number3 : greatest;

     
        System.out.println("The greatest number between " + number1 + " and " + number2 +" and " + number3 + " is: " + greatest);

        scanner.close();
    }
}
