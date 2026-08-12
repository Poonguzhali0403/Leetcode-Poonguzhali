// Last updated: 8/12/2026, 8:39:00 PM
1import java.util.LinkedList;
2import java.util.Queue;
3
4class RecentCounter {
5    private Queue<Integer> q;
6
7    public RecentCounter() {
8        q = new LinkedList<>();
9    }
10
11    public int ping(int t) {
12        q.offer(t); // add new request
13        // remove requests older than t - 3000
14        while (q.peek() < t - 3000) {
15            q.poll();
16        }
17        return q.size();
18    }
19}
20