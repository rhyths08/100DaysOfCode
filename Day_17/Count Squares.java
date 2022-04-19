class Solution {
    static int countSquares(int N) 
    {
        // code here
        int i=1,c=0;
        while(i<Math.sqrt(N))
        {
            c++;
            i++;
        }
        return c;
    }
}
