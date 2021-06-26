from collections import deque

n, k = map(int, input().split(" "))
q = deque()
q.append((0,n))
visited = [0] * 100001
while q:
    time,n = q.popleft()
    visited[n] = time
    arr = [n-1,n+1,n*2]
    if n == k:
        print(time)
        break

    for i in range(3):
        if 0 <= arr[i] < 100001 and visited[arr[i]] == 0:
            q.append((time+1, arr[i]))
