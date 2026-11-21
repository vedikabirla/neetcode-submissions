class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> numSet = new HashSet<>();
        for(int num : nums) {
            if(numSet.contains(num)) {
                return num;
            } else {
                numSet.add(num);
            }
        }
        return -1;
        
    }
}
