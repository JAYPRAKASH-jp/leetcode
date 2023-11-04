class Solution {
     public boolean isAnagram(String s, String t) {
                if(s.length() != t.length()){
            return false;
        }
        HashMap<Character , Integer> count = new HashMap<Character, Integer>(s.length());
        for(char c: s.toCharArray()){
            if (count.containsKey(c)) count.put(c,count.get(c) + 1);
            else count.put(c,1);
        }
        for(char c: t.toCharArray()){
            if(count.containsKey(c)){
                if(count.get(c) == 0){
                    return false;
                }else {
                    count.put(c,count.get(c) - 1);
                }
            }else {
                return false;
            }
        }
        return true;
    }
}