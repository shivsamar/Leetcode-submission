class Solution {
    public boolean judgeSquareSum(int c) {
        long a =(long) Math.sqrt(c);
        long b = 0;
        while(b<=a)
        {
            long sum = a*a+b*b;
            if(sum==c)
                return true;
            else if(c>sum)
                b++;
            else
                a--;

        }
        return false;
    }
}