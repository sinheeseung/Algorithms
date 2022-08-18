n,m = map(int,input().split(" "))
arr = list(map(int,input().split(" ")))
start = 0
end = max(arr)
height = 0
while start <= end:
    mid = (end + start) // 2
    tree = 0
    for i in range(n):
        if arr[i] - mid > 0:
            tree = tree + arr[i] - mid
    if tree >= m:
        height = max(height,mid)
        start = mid + 1
    else:
        end = mid - 1
print(height)