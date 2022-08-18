n = int(input())

arr = [0]*n
dp = [0]*n
for i in range(n):
    arr[i] = int(input())
    if i == 0:
        dp[i] = arr[i]
    elif i == 1:
        dp[i] = dp[i-1] + arr[i]
    else:
        dp[i] = max(arr[i] + dp[i-2], arr[i] + arr[i-1] + dp[i-3], dp[i-1])
print(dp[n-1])