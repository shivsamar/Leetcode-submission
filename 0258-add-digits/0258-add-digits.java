class Solution {
    public int addDigits(int num) {
        int sum =0 ;
        int r_sum= 0;
        while(num!=0)
        {
            sum += num%10;
            num = num/10;
        }
        if(sum/10==0)
            return sum;
        while(sum>0)
        {
            r_sum += sum%10;
            sum = sum/10;
        }
        if(r_sum/10==0)
            return r_sum;
        int f_sum = 0;
        while(r_sum>0)
        {
            f_sum += r_sum%10;
            r_sum = r_sum/10;
        }
        return f_sum;
    }
}