class Solution {
    public int removeElement(int[] nums, int val) {
      /*int index=0;int count =0;
        int n =nums.length;
        if(n==0){
return 0;}
        else{
       for(int i=0;i<nums.length-1;i++){
           if(nums[i]!=val){
          nums[index]=nums[i];
               count++;
               index++;
           }
          
       }
        return  count;}*/
        
        
          int j = 0;
        
        for (int i = 0; i < nums.length; i++) {
        
            if (nums[i] != val) {
                nums[j++] = nums[i];
              }
        }
        return j;
    }
    
}