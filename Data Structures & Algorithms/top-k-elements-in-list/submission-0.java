class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap();
        for(int num : nums) {
            int count = map.getOrDefault(num, 0);
            map.put(num, count + 1);
        }
        List<Integer> keys = new ArrayList<Integer>(map.keySet());

        keys.sort((a,b) -> map.get(b).compareTo(map.get(a)));

        int[] topKElements = new int[k];
        for(int i = 0; i < k; i++) {
            topKElements[i] = keys.get(i);
        }
        return topKElements;


        
    }
}
