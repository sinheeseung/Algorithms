n = int(input())
arr = [[0]*2 for _ in range(n)]
dp = [0]*n
for i in range(n):
    a,b = map(int,(input().split()))
    arr[i][0] = a
    arr[i][1] = b
arr.sort()
for i in range(n):
    j = i
    while j >= 0:
        j -= 1
        if arr[i][1] > arr[j][1]:
            dp[i] = max(dp[i], dp[j] + 1)
    if dp[i] == 0:
        dp[i] = 1
print(n - max(dp))
