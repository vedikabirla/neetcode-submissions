class Solution {
    public int characterReplacement(String s, int k) {
        char[] chars = s.toCharArray();
        HashMap<Character,Integer> freqMap = new HashMap<>();
        int leftPointer = 0;
        int rightPointer = 0;
        int length = 0;
        int maxLength = 0;

        for(int i =0; i < s.length(); i++) {
            freqMap.put(chars[i], freqMap.getOrDefault(chars[i],0)+1);
            int maxFrequent = getMostFrequentCharacer(freqMap);
            if((rightPointer - leftPointer + 1) - maxFrequent <= k) {
                length++;
                maxLength = Math.max(maxLength, length);
            } else {
                freqMap.put(chars[leftPointer], freqMap.get(chars[leftPointer])-1);
                leftPointer++;
                
            }
            rightPointer++;

        }
        return maxLength;
        
    }

    // char maxChar = freqMap.entrySet()
    // .stream()
    // .max(Map.Entry.comparingByValue())
    // .get()
    // .getKey();

    public int getMostFrequentCharacer(HashMap<Character,Integer> freqMap) {
        return Collections.max(freqMap.values());
    }

  
}
