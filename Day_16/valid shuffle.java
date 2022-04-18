import java.util.*;
public class shuffle_string 
{
    static boolean substr(String s1, String s2)
    {
        boolean res=false;
        String temp;
        for(int i=0; i<=s1.length()-s2.length();i++)
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
        System.out.println("Enter string 1:");
        String s1= sc.nextLine();
        System.out.println("Enter string 2:");
        String s2= sc.nextLine();
        System.out.println("Enter string to be checked:");
        String s= sc.nextLine();
        sc.close();
        boolean r1=false;
        boolean r2=false;
        String ch;
        if(s.length()==(s1.length()+s2.length()))
        {
            char temp[] = s.toCharArray();
            Arrays.sort(temp);
            ch=String.valueOf(temp);
            System.out.println(ch);
            r1=substr(ch, s1);
            r2=substr(ch, s2);
            if(r1==true && r2==true)
            {
                System.out.println(s+"is a valid shuffle of "+s1+" and "+s2);
            }
            else
            {
                System.out.println(s+" is a not valid shuffle of "+s1+" and "+s2);
            }
        }
        else
        {
            System.out.println(s+" is a not valid shuffle of "+s1+" and "+s2);
        }
    }
