class Solution {
    public static List<List<Integer>> combine(int n, int k) {
       List<List<Integer>> result = new ArrayList<>();
       List<Integer> current = new ArrayList<>();

       combineHelper(n, k, 1, current, result);

       return result;
   }
   private static void combineHelper(int n, int k, int start, List<Integer> current, List<List<Integer>> result) {
       if (k == 0) {
           result.add(new ArrayList<>(current));
           return;
       }
       for (int i = start; i <= n - k + 1; i++) {
           current.add(i);
           combineHelper(n, k - 1, i + 1, current, result);
           current.remove(current.size() - 1);
       }
   }
}