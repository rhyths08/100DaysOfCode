import java.util.*;
import java.util.Map.Entry;
class Duplicates
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String to be checked: ");
        String s= sc.nextLine();
        sc.close();
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char a= s.charAt(i);
            if(map.containsKey(a))
            {
                int r =map.get(a);
                map.put(a, r+1);
            }
            else
            {
                map.put(a,1);
            }
        }
        for (Entry<Character, Integer> e : map.entrySet())
        {
            if(e.getValue()>1)
            {
                System.out.println(e.getKey()+", count= "+e.getValue());
            }
        }
    }
}
