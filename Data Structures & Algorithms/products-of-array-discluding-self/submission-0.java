class Solution {
    public int[] productExceptSelf(int[] nums) {
        int totalProductWithoutZero = 1;
        int zeroCount = 0;

        for(int num : nums) {
            if(num != 0) {
                totalProductWithoutZero = totalProductWithoutZero * num;
            } else {
                zeroCount++;
            }
        }
        int[] list = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            int result = 0;
            if(nums[i] != 0) {
                if(zeroCount < 1) {
                    result = totalProductWithoutZero/nums[i];
                } else {
                    result = 0;
                }
            } else {
                if(zeroCount < 2) {
                                result = totalProductWithoutZero;
                } else {
                    result = 0;
                }
            }
            list[i] = result;
        }
        return list;
        
    }
}  
