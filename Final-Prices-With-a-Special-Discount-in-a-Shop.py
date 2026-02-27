1class Solution:
2    def finalPrices(self, prices):
3        n = len(prices)
4        answer = prices[:]  # Copy original prices
5        stack = []  # Store indices
6
7        for i in range(n):
8            # Apply discount to previous items if possible
9            while stack and prices[i] <= prices[stack[-1]]:
10                index = stack.pop()
11                answer[index] -= prices[i]
12
13            stack.append(i)
14
15        return answer