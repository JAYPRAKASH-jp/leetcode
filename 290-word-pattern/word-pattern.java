class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map = new HashMap<>();
        int size = pattern.length();
        String[] str = s.split(" ");
        if(size  != str.length){
            return false;
        }
        for(int i = 0; i <  size; i++){
            char ch = pattern.charAt(i);
            String word = str[i];
            if (map.containsKey(ch)){
                if (!word.equals(map.get(ch)))
                    return false;
            }else{
                if(map.values().contains(word)){
                    return false;
                }
                map.put(ch,word);
            }
        }
        return true;
    }
}