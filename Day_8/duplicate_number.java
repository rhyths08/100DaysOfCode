class Solution {
    public int findDuplicate(int[] nums) 
    {
        int c=0;
        int n=-1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                n= nums[i];
                break;
            }
            map.put(nums[i],1);
        }
        return n;
    }
}
