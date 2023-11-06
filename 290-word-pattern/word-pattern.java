class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> patternValue = new HashMap<>();
        int patternSize = pattern.length();
        String[] str = s.split(" ");
        if(patternSize != str.length){
            return false;
        }
        for(int i = 0; i < patternSize; i++){
            char ch = pattern.charAt(i);
            if (patternValue.containsKey(ch)){
                if (!patternValue.get(ch).equals(str[i]))
                    return false;
            }else{
                if(patternValue.values().contains(str[i])){
                    return false;
                }else {
                    patternValue.put(ch,str[i]);
                }
            }
        }
        return true;
    }
}