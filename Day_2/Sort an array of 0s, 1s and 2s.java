import java.io.*;
import java.util.*;
class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here 
        //Arrays.sort(a);
        int c0=0,c1=0,c2=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]==0) c0++;
            else if(a[i]==1) c1++;
            else c2++;
        }
        int j=0;
        while(j<n)
        {
            while(c0!=0)
            {
                a[j]=0;
                c0--;
                j++;
            }
            while(c1!=0)
            {
                a[j]=1;
                c1--;
                j++;
            }
            while(c2!=0)
            {
                a[j]=2;
                c2--;
                j++;
            }
        }
    }
}
class GFG {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            Solution ob=new Solution();
            ob.sort012(arr, n);
            StringBuffer str = new StringBuffer();
            for(int i=0; i<n; i++){
                str.append(arr[i]+" ");
            }
            System.out.println(str);
        }
    }
}
