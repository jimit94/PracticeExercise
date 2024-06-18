import java.util.Scanner;

public class PrimeNumber {
    //prime number using for loop
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number to check if it is a prime number or not : ");
        int num = input.nextInt();
        String prime = (checkPrime(num)) ? "Prime number" : "Not a prime number";
        System.out.println(prime);
    }

    public static boolean checkPrime(int num) {
        for (int i = 2;i<num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
