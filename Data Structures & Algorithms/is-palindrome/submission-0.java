class Solution {
    public boolean isPalindrome(String s) {
        int i = 0 ;
        String ss = "";



        for (int k = 0 ; k < s.length(); k++){
            char c = s.charAt(k);
            c = Character.toLowerCase(c);
            if (Character.isLetterOrDigit(c))
                ss += c;
        }
        
        for (int j = ss.length()-1; j > (ss.length()-1)/2;j--){
            if (ss.charAt(i) != ss.charAt(j)){
                return false;
            }
            i++;
        }
        return true;
        
    }
}
