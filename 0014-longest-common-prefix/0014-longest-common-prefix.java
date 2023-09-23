class Solution {
    public String longestCommonPrefix(String[] strs) {
     
    /*    for(int i =1;i<strs.length;i++){
             String tep= "";
         for(int j =0;j<strs[i].length;j++){
             
       if(strs[i-1].charAt[j]==strs[i].charAt[j]){
            
           tep = tep +strs[i].charAt[j];
           
           return tep;}
           
       else{
           return "";
           }
         }
        }
    }*/
        
        
        
          if(strs == null || strs.length == 0)    return "";
    String pre = strs[0];
    int i = 1;
    while(i < strs.length){
        while(strs[i].indexOf(pre) != 0)
            pre = pre.substring(0,pre.length()-1);
        i++;
    }
    return pre;
}}