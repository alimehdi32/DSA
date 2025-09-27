import java.util.*;
public class largestOddNum {
    String largestOddNumber(String num)
    {
        
        if(num.charAt(0)==48)
        {
            num=largestOddNumber(num.substring(1));
        }
        else
        {
            for(int i=num.length()-1; i>=0; i--)
            {
                if(num.charAt(i)%2!=0)
                {
                    return num.substring(0,i+1);
                }
            }
        }
        return num;
        
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String num=sc.nextLine();
        largestOddNum obj = new largestOddNum();
        System.out.println(obj.largestOddNumber(num));
        sc.close();
    }
}
