class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> groups = new HashMap();
        for(String str : strs) {
            char[] stringInChars = str.toCharArray();
            Arrays.sort(stringInChars);
            String sortedString = new String(stringInChars);
            if(groups.get(sortedString) != null) {
                ArrayList<String> anagrams = groups.get(sortedString);
                anagrams.add(str);
            } else {
                ArrayList<String> newList = new ArrayList<String>();
                newList.add(str);
                groups.put(sortedString, newList);
            }
        }
        return new ArrayList<>(groups.values());
        
    }
}
