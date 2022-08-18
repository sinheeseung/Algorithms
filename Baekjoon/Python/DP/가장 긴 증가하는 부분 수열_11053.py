n = int(input())

arr = [0] * n
dp = [0] * n

arr = list(map(int,input().split(" ")))
for i in range(n):
    if i == 0:
        dp[i] = 1
    else:
        j = i
        while(j >= 0):
            j -= 1
            if arr[i] > arr[j]:
                dp[i] = max(dp[i], dp[j]+1)
        if dp[i] == 0:
            dp[i] = 1
print(max(dp))