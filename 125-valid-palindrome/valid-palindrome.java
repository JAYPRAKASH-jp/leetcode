class Solution {
    public boolean isPalindrome(String s) {
        boolean isPalindrome = true;
        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        int j = 0;
        for(int i = s.length() - 1; i > -1; i--){
            if (s.charAt(i) != s.charAt(j)) return false;
            j++;
        }
        return isPalindrome;
    }
}