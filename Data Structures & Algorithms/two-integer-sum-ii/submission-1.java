class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int leftPointer = 0;
        int rightPointer = numbers.length -1;
        while(leftPointer < rightPointer) {
            int firstNum = numbers[leftPointer];
            int secondNum = numbers[rightPointer];
            int sum = numbers[leftPointer] + numbers[rightPointer];
            if(sum == target) {
                return new int[]{leftPointer+1, rightPointer+1};
            }else if(sum > target) {
                rightPointer--;
            } else if(sum < target) {
                leftPointer++;
            }
        }
        return new int[]{};
    }
}
