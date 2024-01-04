//03. Valid-Anagram
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        char[] str = s.toCharArray();
        char[] str1 = t.toCharArray();
        Arrays.sort(str);
        Arrays.sort(str1);
        return Arrays.equals(str,str1);
    }
}
