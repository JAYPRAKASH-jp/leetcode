class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] alphabetCount = new char[26];
        for(char c : magazine.toCharArray()){
            alphabetCount[c - 'a']++;
        }

        for(char c : ransomNote.toCharArray()){
            if(alphabetCount[c - 'a'] == 0){
                return false;
            }else {
                alphabetCount[c - 'a']--;
            }

        }
        return true;
    }
}