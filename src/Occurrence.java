import java.util.Scanner;

public class Occurrence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter size of the array : ");
        int size = input.nextInt();
        int[] myArr = new int[size];
        for (int i = 0; i < myArr.length; i++) {
            System.out.print("Please enter element " + (i+1) +" :" );
            myArr[i] = input.nextInt();
        }
        System.out.print("Please enter a number you want to check : ");
        int num = input.nextInt();
        System.out.println(occ(myArr,num));
    }
    public static int occ(int[] myArr,int num){
        int occ = 0;
        for(int nums : myArr){
            if(nums==num){
                occ++;
            }
        }
        return occ;

    }
}
