import java.util.HashMap;
public class Solution
{
    public int FirstNotRepeatingChar(String str)
    {
        
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            if(map.containsKey(c))
            {
                int time=map.get(c);
                time++;
                map.put(c,time);
                 
            }
            else
            {
                map.put(c,1);
            }
        }
       for(int i=0;i<str.length();i++)
       {
           char c=str.charAt(i);
          if(map.get(c)==1)
           return i;
       }
       return -1;
    }
}
