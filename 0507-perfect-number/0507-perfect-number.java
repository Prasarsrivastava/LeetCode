class Solution {
    public boolean checkPerfectNumber(int num) {
        if (num == 1) return false; // 1 is not a perfect number
        
        int sum = 1; // 1 is always a divisor (except for num=1)
        int sqrt = (int) Math.sqrt(num);
        
        for (int i = 2; i <= sqrt; i++) {
            if (num % i == 0) {
                sum += i;
                int otherDiv = num / i;
                if (otherDiv != i) {
                    sum += otherDiv;
                }
            }
        }
        
        return sum == num;
    }
}
