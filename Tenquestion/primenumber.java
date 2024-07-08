
import java.util.Scanner;

class primenumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        boolean flag=false;
        if(num==0||num==1){
            System.out.println("number is prime");

        }
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                flag=true;
                break;
            }

        }
        if(!flag){
            System.out.println("the number is prime");
        }
        else{
            System.out.println("the number is not prime");
        }
    }
}