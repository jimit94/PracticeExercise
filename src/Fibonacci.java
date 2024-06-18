import java.util.Scanner;

public class Fibonacci {
    // print fibonacci series using recursion
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number for which you want to print fib series : ");
        int count = input.nextInt();
        for (int i=1;i<=count;i++){
            System.out.print(printFib(i) + " ");
        }
    }
    public static int printFib(int position){
        if(position==1){
            return 0;
        }
        if(position==2){
            return 1;
        }

        return printFib(position-1) + printFib(position-2);
    }
}
