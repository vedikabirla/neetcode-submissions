class Solution {
    public int longestConsecutive(int[] nums) {
        //create a hashmap of the numbers...iterate over each to find the max
        if(nums.length == 0) {
            return 0;
        }
        HashSet<Integer> freqMap = new HashSet<>();
        for(int n :nums) {
            freqMap.add(n);
        }
        int max = 1;
        for(int value : freqMap) {
            if(freqMap.contains(value-1)) {
                continue;
            }
            int sequence = 1;
            int nextNum = value+1;
            while(freqMap.contains(nextNum)) {
               sequence++;
               nextNum++;
            }
            max = Math.max(sequence,max);
        }
        return max;
    }
    
}
