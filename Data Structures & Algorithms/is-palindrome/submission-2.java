class Solution {
    public boolean isPalindrome(String s) {
        int lef = 0;
        int r = s.length()-1;
        char arr[] = s.toCharArray();
        if(s.length() == 1){    
            return true;
        }
        while (lef < r){
            if(!Character.isLetterOrDigit(arr[lef])){
                lef++;
            }
            else if(!Character.isLetterOrDigit(arr[r])){
                r--;
            }
            else{
                if(Character.toLowerCase(arr[lef]) != Character.toLowerCase(arr[r])){
                    return false;
                }
                lef++;
                r--;
            }
            
            
        }
        

        return true;
    }
}
