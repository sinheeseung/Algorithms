n = int(input())

arr = list(map(int,input().split(" ")))
dp_1 = [0] * n
dp_2 = [0] * n

for i in range(n):
    j = i
    while j >= 0:
        j -= 1
        if arr[i] > arr[j]:
            dp_1[i] = max(dp_1[i], dp_1[j] + 1)
    if dp_1[i] == 0:
        dp_1[i] = 1

for i in range(1,n+1):
    j = n-i
    while j < n-1:
        j += 1
        if arr[n-i] > arr[j]:
            dp_2[n-i] = max(dp_2[n-i], dp_2[j] + 1)
    if dp_2[n-i] == 0:
        dp_2[n-i] = 1

dp = [0] * n
for i in range(n):
    dp[i] = dp_1[i] + dp_2[i] -1
print(max(dp))