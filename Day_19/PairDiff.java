class Solution
{
    public boolean BinSearch(int a[], int l, int h, int x)
    {
        int mid=(l+h)/2;
        if((l==h && a[mid]!=x) || (mid<l))
            return false;
        if(a[mid]==x)
            return true;
        else if(a[mid]<x)
            return BinSearch(a,mid+1,h,x);
        else
            return BinSearch(a,l,mid-1,x);
        
    }
    public boolean findPair(int a[], int size, int n)
    {
        //code here.
        boolean result=false;
        Arrays.sort(a);
        for(int i=0;i<size;i++)
        {
            int x=n+a[i];
            result=BinSearch(a,i+1,size-1,x);
            if(result == true)
                break;
        }
        
        return result;
    }
}
