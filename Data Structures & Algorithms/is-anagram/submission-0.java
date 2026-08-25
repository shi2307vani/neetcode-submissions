class Solution {
    public boolean isAnagram(String s, String t) {
       char c[] = s.toCharArray();
       Arrays.sort(c);
       String res = new String(c);

       char ch[] = t.toCharArray();
       Arrays.sort(ch);
       String res1 = new String(ch);

        if(res.equals(res1)){
            return true;
        }
        else{
            return false;
        }
    }
}
