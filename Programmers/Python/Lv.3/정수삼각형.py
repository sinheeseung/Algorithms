def solution(triangle):
    dp = [[0] * len(triangle) for i in range(len(triangle[len(triangle) - 1]))]
    dp[0][0] = triangle[0][0]
    for i in range(1, len(triangle)):
        for j in range(len(triangle[i])):
            if j != 0:
                dp[i][j] = max(triangle[i][j] + dp[i - 1][j], triangle[i][j] + dp[i - 1][j - 1])
            else:
                dp[i][j] = triangle[i][j] + dp[i - 1][j]
    return max(dp[len(triangle)-1])


triangle = [[7], [3, 8], [8, 1, 0], [2, 7, 4, 4], [4, 5, 2, 6, 5]]
print(solution(triangle))
