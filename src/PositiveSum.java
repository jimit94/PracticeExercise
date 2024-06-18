import java.util.Scanner;

public class PositiveSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter size of the array : ");
        int size = input.nextInt();
        int[] myArr = new int[size];
        for (int i = 0; i < myArr.length; i++) {
            System.out.print("Please enter element " + (i+1) +" :" );
            myArr[i] = input.nextInt();
        }
        System.out.println("Sum of positive numbers is " + sum(myArr));
    }
    public static int sum(int[] myArr){
        int sum = 0;
        for (int elem : myArr){
            if(elem<0){
                continue;
            }
            sum+=elem;
        }
        return sum;
    }
}
