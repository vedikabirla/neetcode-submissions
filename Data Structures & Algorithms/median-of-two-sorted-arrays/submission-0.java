class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int newLength = nums1.length + nums2.length;
        int[] nums3 = new int[newLength];
        int num1Pointer = 0;
        int num2Pointer = 0;
        for(int i = 0; i < newLength; i++) {
            if(num1Pointer < nums1.length && (num2Pointer >= nums2.length || (nums1[num1Pointer] < nums2[num2Pointer]))) {
                nums3[i] = nums1[num1Pointer];
                num1Pointer++;
            } else {
                nums3[i] = nums2[num2Pointer];
                num2Pointer++;
            }
        }
        int midPoint = newLength / 2;
        if(newLength %2 != 0) {
            return (double) nums3[midPoint];
        } else {
            double firstNum = nums3[midPoint];
            double secondNum = nums3[midPoint-1];
            return (firstNum + secondNum)/2;

        }
        
    }
}
