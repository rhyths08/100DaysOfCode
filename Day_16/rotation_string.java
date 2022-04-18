import java.util.*;
public class rotation_string 
{
    static boolean substr(String s1, String s2)
    {
        boolean res=false;
        String temp;
        for(int i=0; i<s1.length()-s2.length();i++)
        {
            temp=s1.substring(i, s2.length()+i);
            //System.out.println(" substr "+i+" : "+temp);
            if(temp.equals(s2))
            {
                res=true;
                break;
            }
        }
        return res;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string 1: ");
        String s1= sc.nextLine();
        System.out.println("Enter string 2: ");
        String s2= sc.nextLine();
        sc.close();
        //System.out.println("s1 before:"+s1);
        //System.out.println("s2:"+s2);
        s1=s1.concat(s1);
        //System.out.println("s1 after:"+s1);
        boolean c= substr(s1,s2);
        System.out.println(c);
    }
}
