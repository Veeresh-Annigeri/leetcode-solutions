// solution without converting int to String
class Solution {
    public boolean isPalindrome(int x) {
        
        if(x<0 || (x!=0 && x%10==0)) return false;
        
        int rev = 0 ;
        // reversing only until one half of the number
        while(x > rev) {
            rev = rev*10 + x%10;
            x = x/10;
        }
        
        // Handle both even-length and odd-length palindromes
        return x == rev || x == rev/10;
    }
}