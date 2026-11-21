class Solution {
    public boolean isPalindrome(String t) {
        ArrayList<Character> list = new ArrayList();
        char[] chars = t.toCharArray();
        int length = 0;
        
        for(char s : chars) {
            if(Character.isLetterOrDigit(s)) {
                list.add(Character.toLowerCase(s));
                length++;
            }
        }

      
        int leftPointer = 0; 
        int rightPointer = length - 1;
        while(leftPointer < rightPointer) {
            if(!list.get(leftPointer).equals(list.get(rightPointer))) {
                return false;
            }
            leftPointer++; 
            rightPointer--; 
        }
        return true;
        
    }
}
