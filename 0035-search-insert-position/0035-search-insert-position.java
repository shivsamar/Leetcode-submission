class Solution {
    public int searchInsert(int[] nums, int target) {
        int beg = 0;
        int end = nums.length-1;
        int mid=0;
        while(beg<=end)
        {
            mid = (beg+end)/2;

            if(target == nums[mid])
            {
                return mid;
            }
            else if(target>nums[mid])
            {
                beg = mid+1;
            }
            else
            {
                end = mid-1;
            }
        }
        return beg;
    }
}