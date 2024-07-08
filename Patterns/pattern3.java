public class pattern3 {
    public static void main(String[] args) {
        int n = 5; // Number of rows in the diamond (adjust as needed)
        
        // Upper part of the diamond
        for (int i = 0; i < n; i++) {
            // Leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            
            // Asterisks
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            
            System.out.println(); // Move to the next line
        }
        
        // Lower part of the diamond
        for (int i = n - 1; i > 0; i--) {
            // Leading spaces
            for (int j = 0; j < i - 1; j++) {
                System.out.print(" ");
            }
            
            // Asterisks
            for (int j = 0; j <= n - i; j++) {
                System.out.print("* ");
            }
            
            System.out.println(); // Move to the next line
        }
    }
}
// * * * * * 
//  * * * * 
//   * * * 
//    * * 
//     * 
//    * * 
//   * * * 
//  * * * * 
// * * * * * 
