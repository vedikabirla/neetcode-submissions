class Solution {
    public int search(int[] nums, int target) {
        int length = nums.length;
        int leftPointer = 0;
        int rightPointer = length - 1; //5
        while(leftPointer <= rightPointer) {
            int mid = leftPointer + ((rightPointer - leftPointer)/2);//2,4
            if(nums[mid] == target) {
                return mid;
            } else if(nums[mid]>target) {
                rightPointer = mid - 1; //3
            } else if(nums[mid] < target) {
                leftPointer = mid + 1; //3
            }
        }
        return -1;
    }
}
