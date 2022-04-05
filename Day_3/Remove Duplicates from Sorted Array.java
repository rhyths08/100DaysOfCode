class Solution {
    public int removeDuplicates(int[] nums) 
    {
        if(nums.length!=0)
        {
            int r=nums[0], p=0;
            for(int i=1;i<nums.length;i++)
            {
                if(r!=nums[i])
                {
                    p++;
                    nums[p]=nums[i];
                    r=nums[i];
                }
            }
            return p+1;
        }
        else
            return 0;
    }
}
