// Last updated: 8/12/2026, 6:42:46 PM
1class Solution {
2    public String multiply(String num1, String num2) {
3        if (num1.equals("0") || num2.equals("0")) return "0";
4
5        int m = num1.length(), n = num2.length();
6        int[] result = new int[m + n];
7
8        for (int i = m - 1; i >= 0; i--) {
9            for (int j = n - 1; j >= 0; j--) {
10                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
11                int sum = mul + result[i + j + 1];
12
13                result[i + j + 1] = sum % 10;
14                result[i + j] += sum / 10;
15            }
16        }
17
18        StringBuilder sb = new StringBuilder();
19        for (int num : result) {
20            if (!(sb.length() == 0 && num == 0)) {
21                sb.append(num);
22            }
23        }
24        return sb.toString();
25    }
26}
27