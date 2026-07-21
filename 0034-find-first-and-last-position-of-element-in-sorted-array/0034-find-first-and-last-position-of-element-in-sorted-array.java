class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l = 0, h= nums.length-1;
        int ind1=-1,ind2=-1;
        while(l<=h){
            int mid = l +(h-l)/2 ;
            if(nums[mid]==target){
                ind1=mid;
                h = mid-1;
            }
            else if(target < nums[mid]){
                h= mid-1;;
            }
            else{ l = mid+1; }
        }
        l = 0; 
        h= nums.length-1;
        while(l<=h){
            int mid = l +(h-l)/2 ;
            if(nums[mid]==target){
                ind2=mid;
                l = mid+1;
            }
             else if(target < nums[mid]){
                h= mid-1;;
            }
            else{ l = mid+1; }
        }
        return new int[]{ind1,ind2};
    }
}