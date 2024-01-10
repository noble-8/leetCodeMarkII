class Solution:
    def coinChange(self, coins: List[int], amount: int) -> int:
        if amount==0:
            return 0
        ans = [float('inf')]*(amount+1)
        ans[0]=0
        for i in range(1,amount+1):
            mini = float('inf')
            for coin in coins:
                if (i-coin)>=0 and ans[i-coin]!=float('inf'):
                    mini = min(mini,ans[i-coin]+1)
            ans[i] = mini
        return -1 if ans[amount]==float('inf') else ans[amount]
