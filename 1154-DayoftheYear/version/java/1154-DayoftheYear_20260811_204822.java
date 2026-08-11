// Last updated: 8/11/2026, 8:48:22 PM
1class Solution {
2    public int dayOfYear(String date) {
3        String[] parts = date.split("-");
4        int year = Integer.parseInt(parts[0]);
5        int month = Integer.parseInt(parts[1]);
6        int day = Integer.parseInt(parts[2]);
7
8        int[] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
9
10        // Leap year adjustment
11        if (isLeapYear(year)) {
12            daysInMonth[1] = 29;
13        }
14
15        int dayOfYear = day;
16        for (int i = 0; i < month - 1; i++) {
17            dayOfYear += daysInMonth[i];
18        }
19
20        return dayOfYear;
21    }
22
23    private boolean isLeapYear(int year) {
24        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
25    }
26}
27