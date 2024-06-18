import java.util.Scanner;

public class PasswordChecker {
    // Get a password from user until valid password is entered.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
String password;
        do{
            System.out.print("Please enter a password : ");
            password = input.next();

        }while (password.length()<5);
        System.out.println("valid password");

    }
}