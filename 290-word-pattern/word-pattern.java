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
            String word = str[i];
            if (patternValue.containsKey(ch)){
                if (patternValue.get(ch).equals(word));
                else return false;
            }else{
                if(patternValue.values().contains(word)){
                    return false;
                }else {
                    patternValue.put(ch,word);
                }
            }
        }
        return true;
    }
}