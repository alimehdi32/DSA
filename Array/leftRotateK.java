package Array;

import java.util.*;

public class leftRotateK {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of Array to Rotate: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println();
        System.out.print("Enter elements of Array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter number of places to rotate: ");
        int k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            int temp = arr[0];
            for (int j = 1; j < size; j++) {
                arr[j - 1] = arr[j];
                if (j == size - 1)
                    arr[j] = temp;
            }
        }
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
