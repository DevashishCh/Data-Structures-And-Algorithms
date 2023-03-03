class Solution {
    public int divide(int dividend, int divisor) {
 
    if (dividend == -2147483648 && divisor == -1) {
        return (2147483647);
    }
    return Helper (dividend, divisor);       
}
  static int Helper(int x, int y) {

    if (x == 0) {
        return 0;
    }

	if (x < 0 && y < 0) {
		int res = Math.abs(x / y);
		if (res > 2147483647) {
			return 2147483647;
		}
		return res;
	 }

    if (x < 0 || y < 0) {
        int res =  -Math.abs(x / y);
        if (res < -2147483648) {
            return -2147483648;
        }
        return res;
    }
    return Math.abs(x / y);
    }
}