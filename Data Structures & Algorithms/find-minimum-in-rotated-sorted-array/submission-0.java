class Solution {
    public int findMin(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int leftPointer = 0; //0
        int rightPointer = nums.length - 1; //5
        //5,6,7,8,1,2
        while(leftPointer < rightPointer) {
            int midPointer = leftPointer + (rightPointer - leftPointer)/2; //4
            if(nums[midPointer] > nums[rightPointer]) {
                leftPointer = midPointer+1; //4
            } else {
                rightPointer = midPointer; //4
            }
        }
        return nums[leftPointer];
        
    }
}
