// Last updated: 8/12/2026, 6:44:39 PM
1class Solution {
2    public String reverseOnlyLetters(String s) {
3        char[] arr = s.toCharArray();
4        int left = 0, right = arr.length - 1;
5
6        while (left < right) {
7            if (!Character.isLetter(arr[left])) {
8                left++;
9            } else if (!Character.isLetter(arr[right])) {
10                right--;
11            } else {
12                char temp = arr[left];
13                arr[left] = arr[right];
14                arr[right] = temp;
15                left++;
16                right--;
17            }
18        }
19
20        return new String(arr);
21    }
22}
23