class Solution
 {
    public int findFinalValue(int[] nums, int original) 
    {
        int l=nums.length;
     
    for(int i=0;i<l;i++ )
    {
        if(nums[i]==original)
        {
            original=original*2;
          return findFinalValue(nums,original);
            
        }
        }
return original;
    
    }
 }
    
