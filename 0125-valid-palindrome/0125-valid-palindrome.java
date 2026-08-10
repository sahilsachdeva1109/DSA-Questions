class Solution {
    public boolean isPalindrome(String s) {

        if(s== null){
            return false;
        }

        int left = 0 ; 
        int right = s.length()-1;

        while(left <= right){
            char currFirst = s.charAt(left);
            char currLast = s.charAt(right);

            if(!Character.isLetterOrDigit(currFirst)){
                left++;
            }

            else if(left < right && !Character.isLetterOrDigit(currLast)){
                right--;
            }

            else{
                if(Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)){
                return false;
            }

            left++;
            right--;
        }
        }

        return true;
    }
}