class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        int rem;
        int newx = 0;
        int originalx = x;
        while(x != 0){
            rem = x%10;
            newx = (newx*10) + rem;
            x /= 10;
        }
        if(newx == originalx){
            return true;
        }
        return false;
    }
}