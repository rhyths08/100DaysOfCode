import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int m = Integer.parseInt(inputLine[1]);
            int[][] arr = new int[n][m];
            inputLine = br.readLine().trim().split(" ");
        
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = Integer.parseInt(inputLine[i * m + j]);
                }
            }
            int ans = new Solution().rowWithMax1s(arr, n, m);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(arr[i][j]==1)
                {
                    sum++;
                }
            }
            map.put(i,sum);
            sum=0;
        }
        int mxk=0,mxv=map.get(0);
        for(int i=0;i<n;i++)
        {
            if(map.get(i)>mxv)
                {
                    mxv=map.get(i);
                        mxk=i;
                }
            if(mxv==0)
                mxk=-1;
        }
        return mxk;
    }
}
