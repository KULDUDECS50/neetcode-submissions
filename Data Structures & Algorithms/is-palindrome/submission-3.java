class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        while(left < right){
            if(!Character.isLetterOrDigit(s.toCharArray()[left])){
                left++;
            }else if(!Character.isLetterOrDigit(s.toCharArray()[right])){
                right--;
            }else{
                if(Character.toLowerCase(s.toCharArray()[left]) != Character.toLowerCase(s.toCharArray()[right])){
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
}
