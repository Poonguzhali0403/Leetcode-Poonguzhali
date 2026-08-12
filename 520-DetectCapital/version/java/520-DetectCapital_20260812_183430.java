// Last updated: 8/12/2026, 6:34:30 PM
1class Solution {
2    public boolean detectCapitalUse(String word) {
3        return word.equals(word.toUpperCase()) || 
4               word.equals(word.toLowerCase()) || 
5               (Character.isUpperCase(word.charAt(0)) && 
6                word.substring(1).equals(word.substring(1).toLowerCase()));
7    }
8}
9