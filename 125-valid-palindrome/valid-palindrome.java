class Solution {
    public boolean isPalindrome(String s) {
        int startIndex = 0;
        int lastIndex = s.length() - 1;
        while(startIndex <= lastIndex){
            if(!Character.isLetterOrDigit(s.charAt(startIndex))){
                startIndex++;
            }else if(!Character.isLetterOrDigit(s.charAt(lastIndex))){
                lastIndex--;
            }else{
                if(Character.toLowerCase(s.charAt(startIndex)) != Character.toLowerCase(s.charAt(lastIndex))){
                    return false;
                }
                startIndex++;
                lastIndex--;
            }
        }
        return true;
    }
}