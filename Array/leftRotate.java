package Array;
import java.util.*;
public class leftRotate {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of Array to Rotate: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println();
        System.out.print("Enter elements of Array: ");
        for(int i=0; i<size; i++)
        {
            arr[i]=sc.nextInt();
        }
        int temp=arr[0];
        for(int i=1; i<size; i++)
        {
            arr[i-1]=arr[i];
            if(i==size-1)
            arr[i]=temp;
        }
        for(int i=0; i<size; i++)
        {
            System.out.println(arr[i]+" ");
        }
    }
}
