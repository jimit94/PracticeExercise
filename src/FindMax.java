import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter size of the array : ");
        int size = input.nextInt();
        int[] myArr = new int[size];
        for (int i = 0; i < myArr.length; i++) {
            System.out.print("Please enter element " + (i+1) +" :" );
            myArr[i] = input.nextInt();
        }
        System.out.println("Max is " + max(myArr));
    }
    public static int max(int[] myArr){
        int max = Integer.MIN_VALUE;
        for(int num:myArr){
            if(max<num){
                max = num;
            }

        }
        return max;
    }
}
