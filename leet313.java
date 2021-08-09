class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
       Set<Long> set = new HashSet<>();
       PriorityQueue<Long> queue = new PriorityQueue<>();
       set.add(1L);
       queue.add(1L);
       while (n-- > 0) {
           long num = queue.poll();
           if (n == 0) {
               return (int) num;
           }
           for (int value : primes) {
               if (!set.contains(value * num)) {
                   set.add(value * num);
                   queue.add(value * num);
               }
           }
       }
       return -1;
    }
}
