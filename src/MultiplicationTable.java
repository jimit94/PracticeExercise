import java.util.Scanner;

public class MultiplicationTable {
    // multiplication table using for loop
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number to print its multiplication table : ");
        int num = input.nextInt();
        for (int i=1;i<=10;i++){
            System.out.println(num + " x " + i + " = " + (num*i));
        }
    }
}
