class Solution {
    public int reverse(int x) {
        int reversed = x;        
        int result = 0;
   
        while(reversed != 0) { 
            int digit = reversed % 10; 
            reversed = reversed/10; 
            if (result > Integer.MAX_VALUE / 10 ||
                result < Integer.MIN_VALUE / 10) {
                return 0;
            }
            result = result * 10 + digit; 

        }
        return result;

          
    }
}
