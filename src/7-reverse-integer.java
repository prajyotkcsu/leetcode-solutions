class Solution {
    public int reverse(int x) {
        int out=0;
        while(x!=0){
            int lastDigit=x%10;
            x=x/10;
            if(out > Integer.MAX_VALUE/10 || (out==Integer.MAX_VALUE && lastDigit > 7))
            {
                return 0;
            }
            if(out < Integer.MIN_VALUE/10 || (out==Integer.MIN_VALUE && lastDigit < -8))
            {
                return 0;
            }
        out=out*10+lastDigit;
        }
return out;
    }
}
