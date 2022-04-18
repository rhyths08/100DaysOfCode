class Solution {
    public int BinSearch(int a[], int l, int h, int x)
    {
        int mid=(l+h)/2;
        if(l==h && a[mid]!=x)
            return -1;
        else if(mid==l && a[mid]!=x && a[h]!=x)
            return -1;
        else
        {
            if(a[mid]==x)
                return mid;
            else if(a[mid]<x)
                return BinSearch(a,mid+1,h,x);
            else
                return BinSearch(a,l,mid-1,x);
        }
    }
    public int search(int[] nums, int target) {
        int k=0;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]>nums[i+1])
            {
                k=i+1;
                break;
            }
        }
            
        Arrays.sort(nums);
        int res= BinSearch(nums,0,nums.length-1,target);
        if(res!=-1)
        {
            if(res+k>=nums.length)
            {
                if(nums.length==2)
                    res=res-k;
                else
                    res=Math.abs((res+k)-nums.length);
            }
            else
            {
                res=res+k;
            }
        }
        return res;
    }
}
