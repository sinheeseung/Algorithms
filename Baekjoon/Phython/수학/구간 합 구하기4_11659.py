import sys
n,m = map(int, sys.stdin.readline().split(" "))
arr = list(map(int, sys.stdin.readline().split(" ")))
arr_sum = [0 for i in range(n+1)]
arr_sum[1] = arr[0]
for i in range(1,n):
    arr_sum[i+1] = arr[i] + arr_sum[i]
for k in range(m):
    i,j = map(int, sys.stdin.readline().split(" "))
    print(arr_sum[j] - arr_sum[i-1])