class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        HashSet<Character> charSet = new HashSet<>();

        int leftPointer = 0;
        int rightPointer = 0;
        int maxLength = 0;
        //a,b,c,a,b
        for(int i = 0; i < chars.length; i++) {
            Character character = chars[i]; //a,b,c,a,b
            if(charSet.contains(character)) {
                while(charSet.contains(character)) {
                    charSet.remove(chars[leftPointer]);
                                        leftPointer++; //2

                }
            }
            charSet.add(character); //c,a,b
            rightPointer++; //1,2,3,4,5
            maxLength = Math.max(maxLength,rightPointer - leftPointer); //3

        }
        return maxLength;
        
    }
}
