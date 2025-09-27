import java.util.*;
public class largestCommonPrefix {
    String larComPre(String s[])
    {
        System.out.println("function called");
        int lowest = s[0].length();
        int index=0;
        for(int i=1; i<s.length; i++)
        {
            if(s[i].length()<lowest)
            {
            lowest=s[i].length();
            index=i;
            }
        }

        while(lowest!=0)
        {
            int counter=s.length;
          for(int i=0; i<s.length; i++)
          {
            if(s[i].substring(0, lowest).equals((s[index].substring(0, lowest))))
            counter--;
          }
          if(counter==0)
          break;
          else
          lowest--;
        }
        if(lowest!=0)
        return s[index].substring(0, lowest);
        else
        return "";
    }
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter words in array");
      String[] s = new String[5];
      for(int i=0; i<5; i++)
      {
        s[i]=sc.next();
      }
      largestCommonPrefix obj = new largestCommonPrefix();
      System.out.println(obj.larComPre(s));
      sc.close();
    }
}
