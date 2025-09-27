import java.util.*;

class reverse
{
    String reverseWord(String s)
    { 

        
        s+=" "; 
        String newString="";
        String word="";
        for(int i=0; i<s.length(); i++)
        {
          if(s.charAt(i)!=32)
          {
            word+=s.charAt(i);
          }
          else
          {
            newString=word+" "+ newString;
            word="";
          }
        }
        
        return newString.substring(1);
    }
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
     
      System.out.println("Enter a sentence: ");
       String s = sc.nextLine();
       reverse obj = new reverse();
       System.out.println(obj.reverseWord(s));
       sc.close();
      

    }
}