class Solution {
    public int myAtoi(String s) {
        int num = 0;
	int prevNum;
	int coefficient = 1;
	var numStarted = false; // a numeric character has been encountered
	for (int i = 0; i < s.length(); i++) {
	    char c = s.charAt(i);
	    if (c >= 48 && c <= 57) {
		prevNum = num;
		num = num * 10 + c - 48;
		if ((num + 48 - c) / 10 != prevNum || num < 0) return coefficient < 0 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
		numStarted = true;
	    } else if (numStarted) break;
	    else {
		if (c == '-') {
		    numStarted = true;
		    coefficient = -1;
		} else if (c == '+') numStarted = true;
		else if (c != ' ') {
		    break;
		}
	    }
	}
	return num * coefficient;
    }
}