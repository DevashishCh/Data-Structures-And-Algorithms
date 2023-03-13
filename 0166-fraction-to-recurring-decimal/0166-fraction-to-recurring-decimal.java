class Solution {
    StringBuilder sb;
    public String fractionToDecimal(int numerator, int denominator) {

        if(numerator == 0){
            return "0";
        }   
        sb = new StringBuilder();
        
        addSign(numerator,denominator);
        divideNumbers(numerator,denominator);

        return sb.toString();
    }
    private void addSign(int a , int b){
        
        if((a > 0 && b > 0) || (a < 0 && b < 0)){
            return;
        }    
        sb.append("-");
    }
    private void divideNumbers(int a,int b){
        
        long num = Math.abs((long)a);
        long den = Math.abs((long)b);

        sb.append(num/den);
        num %= den;
        if(num == 0){
            return;
        } 
        appendDecimalPart(num,den);
    }
    private void appendDecimalPart(long num, long den){

        HashMap<Long,Integer> map = new HashMap<>();
        sb.append(".");
        while(num !=0){

            num *= 10;
            sb.append(num/den);
            num %= den;

            if(map.containsKey(num)){
                sb.insert(map.get(num),"(");
                sb.append(")");
                return;
            }
            else{
                map.put(num,sb.length());
            }
        }
    }
}