class Solution {

    public String encode(List<String> strs) {
        StringBuffer buffer = new StringBuffer();
        for(String str : strs) {
            buffer.append(String.valueOf(str.length()));
            buffer.append("#");
           buffer.append(str);

        }
        return buffer.toString();
    }

    public List<String> decode(String str) {
   
        char[] chars = str.toCharArray();
        ArrayList<String> list = new ArrayList<String>();
        StringBuffer buffer = new StringBuffer();
        int index = 0;
        
        while( index < chars.length) {

            if(chars[index] == '#') {
                String bufferString = buffer.toString();
                int lengthOfNum = bufferString.length();
                int length = Integer.parseInt(bufferString);
                list.add(str.substring(index + 1,index + length+1));
                buffer.setLength(0);
                index +=  length + 1;
                
            }  else {
                buffer.append(chars[index]);
                index++;
            }
        }
        return list;
    }
}
