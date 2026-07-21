class Solution {
    public int numPermsDISequence(String s) {
        int n = s.length();
        int MOD = 1_000_000_007;
        
        int[] dp = new int[n + 1];
        
        dp[0] = 1;
        
        for (int i = 0; i < n; i++) {
            int[] nextDp = new int[n + 1];
            char c = s.charAt(i);
            
            if (c == 'D') {
                int curSum = 0;
                for (int j = i; j >= 0; j--) {
                    curSum = (curSum + dp[j]) % MOD;
                    nextDp[j] = curSum;
                }
            } else {
                int curSum = 0;
                for (int j = 0; j <= i; j++) {
                    curSum = (curSum + dp[j]) % MOD;
                    nextDp[j + 1] = curSum;
                }
            }
            dp = nextDp;
        }
        
        int totalWays = 0;
        for (int j = 0; j <= n; j++) {
            totalWays = (totalWays + dp[j]) % MOD;
        }
        
        return totalWays;
    }
}
