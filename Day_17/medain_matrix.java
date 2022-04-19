class Solution 
{
    int median(int matrix[][], int r, int c) 
    {
        int l=0;
        int a[]=new int[r*c];
        for(int i=0; i<r; i++)
        {
            for(int j=0;j<c;j++)
            {
                a[l]=matrix[i][j];
                l++;
            }
        }
        Arrays.sort(a);
        int m=0,k;
        if((r*c)%2==0)
        {
            k=(r*c)/2;
            m=a[k-1];
        }
        else
        {
            k=((r*c)+1)/2;
            m=a[k-1];
        }
        return m;
    }
}
