class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>> solList= new HashSet<>();
        for(int i = 0; i < nums.length - 2; i++) {
            int target = 0 - nums[i];
            int leftPointer = i+1;
            int rightPointer = nums.length - 1;
            if(i > 0 && nums[i] == nums[i-1] || nums[i] > 0) {
                continue;
            }
         
            while(leftPointer < rightPointer) {
                if(nums[leftPointer] + nums[rightPointer] == target) {
                    List<Integer> solution = List.of(nums[leftPointer],nums[rightPointer], nums[i] );
                    solList.add(solution);
                    leftPointer++;
                    rightPointer--;
                } else if(nums[leftPointer] + nums[rightPointer] > target) {
                    rightPointer = rightPointer -1;
                } else if(nums[leftPointer] + nums[rightPointer] < target) {
                    leftPointer = leftPointer +1;
                }
            }

        }
        return new ArrayList<>(solList);
     

        
    }
}
