class Solution {
    public int lengthOfLastWord(String s) {
        int lastWordLength = 0;
        int lastSpaceIndex = -1;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                lastSpaceIndex = i;
            }else if(lastSpaceIndex != -1){
                lastWordLength = i - lastSpaceIndex;
            }else{
                lastWordLength++;
            }
        }
        return lastWordLength;
    }
}