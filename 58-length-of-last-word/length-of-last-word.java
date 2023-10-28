class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        // Start Loop from last index if the last index is not space then start length count once space found the if count is not 0 and then return count.
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