class Solution {
    public int removeDuplicates(int[] a) {
        int count =1;
        if(a.length==0){
            return 0;
        }
        else{
        
        for(int i=0;i<a.length-1;i++){
            if(a[i]!=a[i+1]){
                
              a[count]=a[i+1];
                count++;
            }
        
        }
        }
        return count;
    }
}