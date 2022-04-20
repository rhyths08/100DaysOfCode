class Solution
{
    static int majorityElement(int a[], int size)
    {
       Map<Integer,Integer> map = new HashMap<>();
       for(int i = 0 ; i < a.length ; i++){
           if(map.containsKey(a[i]))
               map.put(a[i],map.get(a[i])+1);
           else
               map.put(a[i],1);
           
           int value = map.get(a[i]);
           if(value > size/2)
               return a[i];
       }
       return -1;
        
    }
}
