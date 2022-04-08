//Move all negative elements to end

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Solution obj = new Solution();
            obj.segregateElements(a, n);
            
            for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
            
            System.out.println();
        }
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    
    public void segregateElements(int a[], int n)
    {
        int c=0;
        Stack<Integer> s1 = new Stack<Integer>();
        Stack<Integer> s2 = new Stack<Integer>();
        for(int i=n-1;i>=0;i--)
        {
            if(a[i]<0)
            {
                s1.push(a[i]);
            }
            else
            {
                s2.push(a[i]);
                c++;
            }
        }
        for(int i=0;i<n;i++)
        {
            if(i<c)
                a[i]=s2.pop();
            else
                a[i]=s1.pop();
        }
    }
}
