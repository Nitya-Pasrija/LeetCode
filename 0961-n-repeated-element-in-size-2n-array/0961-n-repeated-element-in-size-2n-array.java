class Solution {
    public int repeatedNTimes(int[] nums) {
        int[] count = new int[10000];
        for (int a : nums)
            if (count[a]++ == 1)
                return a;
        return -1;
    }
}