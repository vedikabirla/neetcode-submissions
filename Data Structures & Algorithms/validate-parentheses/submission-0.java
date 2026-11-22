class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        char[] perenthesis = s.toCharArray();
        for(char c : perenthesis) {
            if(c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if(stack.isEmpty()) {
                    return false;
                }
                Character popped = stack.pop(); 
                if(c == ')' && popped != '(') {
                    return false;
                } else if( c == ']' && popped != '[') {
                    return false;
                } else if( c == '}' && popped != '{') {
                    return false;
                }
        
                
            }
        }
        if(stack.isEmpty()) {
            return true;
        }
        return false;
        
    }
}
