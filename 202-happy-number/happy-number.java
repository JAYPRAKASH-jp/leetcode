class Solution {
    public boolean isHappy(int n) {
        int i=0;
        while(i++ < 10){
            int sum = 0;
            while (n > 0){
                sum += ( n % 10) * (n % 10);
                n = n / 10;
            }
            if(sum == 1) return true;
            n = sum;
        }
        return false;
    }
}