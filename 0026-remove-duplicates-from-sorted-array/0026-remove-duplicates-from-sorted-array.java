class Solution {
    public int removeDuplicates(int[] a) {
        int i=1;
        for(int j=1;j<a.length;j++){
        if(a[j]!=a[j-1]){
            a[i]=a[j];
            i++;
         }
            else{
                continue;
                }
        
        }
    return i;    }
        
    }
