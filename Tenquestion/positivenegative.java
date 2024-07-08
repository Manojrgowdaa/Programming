
import java.util.Scanner;

class positivenegative{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.println("Enter the Number");
        int num=sc.nextInt();
        if(num>0){
            System.err.println("number is positive");

        }else if (num<0) {
            System.err.println("number is negative");
        }else{
            System.err.println("number is zero");
        }
    }
}