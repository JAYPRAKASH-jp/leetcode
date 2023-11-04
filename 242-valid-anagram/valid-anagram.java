class Solution {
     public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int size = s.length();
        int[] alpharCount= new int[26];
        for(int i=0; i < size; i++){
            alpharCount[s.charAt(i) - 'a']++;
        }
        for(int i=0; i < size; i++){
            char ch = t.charAt(i);
            if(alpharCount[ch - 'a'] == 0){
                return false;
            }else {
                alpharCount[ch - 'a']--;
            }
        }
        return true;
    }
}