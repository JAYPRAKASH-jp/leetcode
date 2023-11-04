class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> hashSet = new HashSet<>();
        while(hashSet.add(n)){
            int sum = 0;
            while (n > 0){
                sum += (n % 10) *  (n % 10);
                n = n / 10;
            }
            n = sum;
        }
        if (n == 1)
            return true;
        else return false;
    }

    public int sumOfSquare(int n){
        int sum = 0;

        return sum;
    }
}