import java.util.Scanner;

public class PrintEven {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter size of the array : ");
        int size = input.nextInt();
        int[] myArr = new int[size];
        for (int i = 0; i < myArr.length; i++) {
            System.out.print("Please enter element " + (i + 1) + " :");
            myArr[i] = input.nextInt();
        }
        for (int elem : myArr){
            if(elem%2!=0){
                continue;
            }
            System.out.println(elem);
        }
    }
}
