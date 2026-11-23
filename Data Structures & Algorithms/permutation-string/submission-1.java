class Solution {
    public boolean checkInclusion(String s1, String s2) {
       char[] lettersNeeded = s1.toCharArray(); //a,d,c
       char[] lettersInLongerString = s2.toCharArray(); //d,c,d,a
       if(lettersInLongerString.length < lettersNeeded.length) {
        return false;
       }
       
       HashMap<Character,Integer> freqMap = new HashMap<>();
       for(char letter : lettersNeeded) {
        freqMap.put(letter, freqMap.getOrDefault(letter, 0) + 1); //a:1,d: 1, c: 1
       }
       HashMap<Character,Integer> substringMap = new HashMap<>();

       int lastWindowStart = lettersInLongerString.length - lettersNeeded.length;
       for(int i = 0; i <=  lastWindowStart; i++) {
         int count = lettersNeeded.length;
         int startIndex = i;
         substringMap = new HashMap<>();
         while(count > 0) {
            char charInWindow = lettersInLongerString[startIndex];
            substringMap.put(charInWindow,substringMap.getOrDefault(charInWindow, 0) + 1 );

            count--;
            startIndex++;
         }
         boolean isAnagram = true;
         for(char letter : freqMap.keySet()) {
            if(!Objects.equals(substringMap.get(letter),freqMap.get(letter))) {
                isAnagram = false;
            }
         }
         if(isAnagram == true) {
            return true;
         }
       }
       return false;


    }
}
