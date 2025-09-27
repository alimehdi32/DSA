package Array;
import java.util.*;

public class Sum {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter elements of Array: ");
        for(int i=0; i<size; i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter target: ");
        int target = sc.nextInt();
        for(int i=0; i<size-1; i++)
        {
            for(int j=i+1; j<size; j++)
            {
                if(arr[i]+arr[j]==target)
                {
                    System.out.println("["+i+","+j+"]");
                    break;
                }
            }
        }
    }
}
