def binary_search(arr,start,end,k,length):
    mid = (start + end) // 2
    if start > end or mid == 0:
        return length
    m = 0
    for i in range(len(arr)):
        m = m + arr[i] // mid
    if m >= k:
        length = max(length,mid)
        return binary_search(arr,mid+1,end,k,length)
    else:
        return binary_search(arr,start,mid-1,k,length)



n,k = map(int,input().split(" "))
arr = [0] * n

for i in range(n):
    arr[i] = int(input())
length = 1
print(binary_search(arr,0,max(arr),k, length))
