import java.util.Scanner;

public class ArraySwap {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int length = sc.nextInt();
        int[] arr = new int[length];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("ENTER K POSITION");
        int k = sc.nextInt();
        int temp=arr[k-1];
        arr[k-1]=arr[length-k];
        arr[length-k]=temp;
        System.out.println("AFTER SWAPPING ARRAY");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
