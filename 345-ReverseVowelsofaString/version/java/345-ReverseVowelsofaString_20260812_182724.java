// Last updated: 8/12/2026, 6:27:24 PM
1import java.util.*;
2
3class Solution {
4    public String reverseVowels(String s) {
5        Set<Character> vowels = new HashSet<>(Arrays.asList(
6            'a','e','i','o','u','A','E','I','O','U'
7        ));
8        
9        char[] arr = s.toCharArray();
10        int left = 0, right = arr.length - 1;
11        
12        while (left < right) {
13            while (left < right && !vowels.contains(arr[left])) left++;
14            while (left < right && !vowels.contains(arr[right])) right--;
15            
16            char temp = arr[left];
17            arr[left] = arr[right];
18            arr[right] = temp;
19            
20            left++;
21            right--;
22        }
23        
24        return new String(arr);
25    }
26}
27