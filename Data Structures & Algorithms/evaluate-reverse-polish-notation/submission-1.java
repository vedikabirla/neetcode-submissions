class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> nums = new Stack<>();
        for(String token : tokens) {
            if(token.equals("*"))  {
                int num1 = nums.pop();
                int num2 = nums.pop();
                nums.push(num2 * num1);

            } else if(token.equals("/")) {
                int num1 = nums.pop();
                int num2 = nums.pop();
                nums.push(num2 / num1);
            } else if(token.equals("-")) {
                int num1 = nums.pop();
                int num2 = nums.pop();
                nums.push(num2 - num1);
            } else if(token.equals("+")) {
                int num1 = nums.pop();
                int num2 = nums.pop();
                nums.push(num2 + num1);
            } else {
                nums.push(Integer.parseInt(token));
            }

        }
        return nums.pop();
        
    }
}
