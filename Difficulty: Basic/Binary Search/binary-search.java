class Solution {
    public boolean binarySearch(int[] arr, int k) {
        // code here
        int l = 0, h = arr.length-1;
        while(l<=h){
            int mid = l +(h-l)/2;
            if(arr[mid] < k ){
                l = mid+1;
            }
            else if(arr[mid] > k){
                h = mid-1;
            }
            else {
                return true;
            }
        }
        return false;
    }
}