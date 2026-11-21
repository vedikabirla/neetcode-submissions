class Solution {
    public int maxArea(int[] heights) {
        int maxContainerArea = 0;
        int leftPointer = 0;
        int rightPointer = heights.length - 1;
        while(leftPointer < rightPointer) {
            int area = (rightPointer - leftPointer ) * (Math.min(heights[leftPointer], heights[rightPointer]));
            if (area > maxContainerArea) {
                maxContainerArea = area;
            }
            if(heights[leftPointer] < heights[rightPointer]) {
                leftPointer++;
            } else {
                rightPointer--;
            }

            
            
        }
        return maxContainerArea;
        
    }
}
