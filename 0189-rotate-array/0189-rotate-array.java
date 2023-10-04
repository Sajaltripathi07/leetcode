class Solution {
    public void rotate(int[] a, int k) {
      k%=a.length;
        if(k==0){return ;}
        reverse(0,a.length-1,a);
        reverse(0,k-1,a);
        reverse(k,a.length-1,a);
        }
    private void reverse(int start,int end,int[] a){
     while(start<end){
         int temp= a[start];
         a[start++]=a[end];
         a[end--]=temp;
}
    }
    }
