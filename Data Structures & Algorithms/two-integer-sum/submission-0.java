class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length;i++) {
            int numNeeded = target - nums[i];
            int potentialIndex = map.getOrDefault(numNeeded, -1);
            if(potentialIndex != -1) {
                return new int[]{potentialIndex,i};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[]{};
        
    }
}
