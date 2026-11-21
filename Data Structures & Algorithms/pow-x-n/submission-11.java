class Solution {
    public double myPow(double x, int n) {
        double result = calculatePower(x, Math.abs((long) n));
        return n >= 0 ? result : (1/result);
    }
    public double calculatePower(double x, long power) {
        if(power == 0 || x == 1) {
            return 1;
        }
        double result = calculatePower(x, power/2);
        if(power % 2 == 0) {
            return result*result;
        } else {
            return x * result * result;
        }
    }
}
