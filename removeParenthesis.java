public class removeParenthesis {
    public static void main(String args[])
    {
        String s = "()(()())(())";
        String s1="";
        int count = 0;
        for(int i=0; i<s.length(); i++)
        {
            if(count==0 && s.charAt(i)==40)
            {
            count++;
            }
            else if(count==1)
            {
              if(s.charAt(i)==40)
              {
                s1+=s.charAt(i);
                count++;
              }
              else
              {
                count--;
              }
            }
            else
            {
                if(s.charAt(i)==40)
                {
                    s1+=s.charAt(i);
                    count++;
                }
                else
                {
                    s1+=s.charAt(i);
                    count--;
                }
            }
        }
        System.out.println(s1);
    }
}
