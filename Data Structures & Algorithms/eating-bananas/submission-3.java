class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxBananasInPile = 0;
        for(int num:piles) {
            maxBananasInPile = Math.max(maxBananasInPile,num);
        }
        int leftValue = 1;
        int rightValue = maxBananasInPile;
        while(leftValue < rightValue) {
            int midPoint = leftValue + (rightValue - leftValue)/2;
            int hours = 0; 
            for (int i = 0; i < piles.length; i++) {
                int bananasInPiles = piles[i];
                hours += (int)Math.ceil((double)bananasInPiles/midPoint);
            }
            if(hours > h) {
                leftValue = midPoint + 1; //1,2,3,4,5,6,7,8,9,10,11
            } else  {
                rightValue = midPoint;
            }
        }
        return leftValue;   
        
    }
}
