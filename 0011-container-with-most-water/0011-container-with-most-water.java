class Solution {
    public int maxArea(int[] height) {
        int max_pdt = 0;
        int j = height.length-1;
        int i = 0;
        int pdt;
        while(j>i)
        {
            pdt = 1;
            if(height[i]>=height[j])
            {
                pdt=height[j]*(j-i);
                j--;
            }
            else
            {
                pdt=height[i]*(j-i);
                i++;
            }
            max_pdt = Math.max(max_pdt,pdt);
        }
        return max_pdt;
    }
}