class Solution {
     public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] alpharCount= new int[26];
        for(int i=0; i < s.length(); i++){
            alpharCount[s.charAt(i) - 'a']++;
        }
        for(int i=0; i < t.length(); i++){
            if(alpharCount[t.charAt(i) - 'a'] == 0){
                return false;
            }else {
                alpharCount[t.charAt(i) - 'a']--;
            }
        }
        return true;
    }
}