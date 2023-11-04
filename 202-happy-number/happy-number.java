class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> hashSet = new HashSet<>();
        while(hashSet.add(n)){
            n = sumOfSquare(n);
        }
        if (n == 1)
            return true;
        else return false;
    }

    public int sumOfSquare(int n){
        int sum = 0;
        while (n > 0){
            sum += (n % 10) *  (n % 10);
            n = n / 10;
        }
        return sum;
    }
}