class Solution {
    public int firstSearch(int[] arr, int k) {
        // Code Here
        int l = 0 , h=arr.length-1,ind = -1;
        while(l<=h){
            int mid = l+(h-l)/2;
            if(arr[mid] == k){
                ind = mid;
                h=mid-1;
            }
            else if( arr[mid] < k){
                l= mid+1;
            }
            else{
                h = mid - 1;
            }
        }
        return ind;
        
    }
}