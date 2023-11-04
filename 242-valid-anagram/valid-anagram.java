class Solution {
     public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] alpharCount= new int[26];
        for(char c: s.toCharArray()){
            alpharCount[c - 'a']++;
        }
        for(char c: t.toCharArray()){
            if(alpharCount[c - 'a'] == 0){
                return false;
            }else {
                alpharCount[c - 'a']--;
            }
        }
        return true;
    }
}