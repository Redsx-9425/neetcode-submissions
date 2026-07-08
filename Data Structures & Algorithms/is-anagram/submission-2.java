class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
           return false;
        }

        HashMap<Character,Integer> hs = new HashMap<>();
        HashMap<Character,Integer>  ts = new HashMap<>();
        
        for (int i = 0 ; i < s.length();i++){
            char c = s.charAt(i);

            if (hs.containsKey(c)){
                hs.put(c,hs.get(c)+1);
            }else{
                hs.put(c,1);
            }
                char a = t.charAt(i);
                 if (ts.containsKey(a)){
                ts.put(a,ts.get(a)+1);
            }else{
                ts.put(a,1);
            }
        }
        return hs.equals(ts);
    }
}
