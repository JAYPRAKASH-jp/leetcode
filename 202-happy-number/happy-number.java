class Solution {
    public boolean isHappy(int n) {
        int i=0;
        int rem;
        while(i++ < 10){
            int sum = 0;
            while (n > 0){
                rem = n % 10;
                sum += rem * rem;
                n = n / 10;
            }
            if(sum == 1) return true;
            n = sum;
        }
        return false;
    }
}