import sys

n, m, b = map(int, sys.stdin.readline().split())
arr = [list(map(int, sys.stdin.readline().split())) for _ in range(n)]
time = 1e9
max_height = 0
min_height = 501
for i in range(n):
    max_height = max(max_height,max(arr[i]))
    min_height = min(min_height,min(arr[i]))
for i in range(min_height,max_height+1):
    bot = top = 0
    for j in range(n):
        for k in range(m):
            if arr[j][k] < i:
                bot += i-arr[j][k]
            else:
                top += arr[j][k]-i
    if bot > top + b:
        continue
    t = bot + top*2
    if t <= time:
        time = t
        height = i
print(time, height)
