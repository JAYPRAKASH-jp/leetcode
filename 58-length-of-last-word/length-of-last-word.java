class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        for(int i = s.length() - 1 ; i > -1 ; i--){
            if(s.charAt(i) != ' '){
                count++;
            }else{
                if (count > 0) return count;
            }
        }
        return count;
    }
}