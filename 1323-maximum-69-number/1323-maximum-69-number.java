class Solution {
    public int maximum69Number (int num) {
        int reversed = 0 ;
        while (num != 0)
        {
            int digit = num % 10;          
            reversed = reversed * 10 + digit; 
            num /= 10;                    
        }
        int bool = 0;
        while(reversed != 0)
        {
            int temp = reversed%10;
            if(temp == 6&& bool == 0)
            {
                temp = 9;
                bool++;
            }
            num = num * 10 + temp;
            reversed /= 10; 
        }
        return num;
    }
}