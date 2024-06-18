import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {
        int a = 5;
        Scanner input = new Scanner(System.in);
        int num;
        do{
            System.out.print("Please guess a number between 0 to 10 :");
            num = input.nextInt();
        }while (num!=a);
        System.out.println("You guessed it right");
    }
}
