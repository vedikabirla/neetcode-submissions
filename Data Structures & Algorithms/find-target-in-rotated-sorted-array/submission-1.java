class Solution {
    public int search(int[] nums, int target) {
        
        int leftPointer = 0;
        int rightPointer = nums.length - 1;
        while(leftPointer <= rightPointer) {
            int mid = leftPointer + (rightPointer - leftPointer)/2;
            if(leftPointer == rightPointer && nums[mid] != target) {
                return -1;
            }
            if(nums[mid] == target) {
                return mid;
            } else if(nums[mid] < nums[rightPointer] && target > nums[mid] && target <= nums[rightPointer] ){
                leftPointer = mid+1;
            } else if(nums[mid] < nums[rightPointer] && target > nums[rightPointer]) {
                rightPointer = mid-1;
            } else if(nums[mid] > nums[rightPointer] && (target <= nums[rightPointer] || target > nums[mid]) ) {
                leftPointer = mid+1;
            } else {
                rightPointer = mid -1;
            }
        }
        return -1;
    }
}
