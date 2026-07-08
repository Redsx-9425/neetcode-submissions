class Solution {
    public boolean isPalindrome(String s) {
        int i = 0 ;
        int j = s.length() - 1;

        while (i < j){
            char c = Character.toLowerCase(s.charAt(i));
            char a = Character.toLowerCase(s.charAt(j));

            if ( !Character.isLetterOrDigit(a) ){
                j--;
               
            }else if ( !Character.isLetterOrDigit(c) ){
                i++;  
            }else{
            if (c != a){
                return false;
            }
            i++;
            j--;
            }

        }
        return true;
        
    }
}
