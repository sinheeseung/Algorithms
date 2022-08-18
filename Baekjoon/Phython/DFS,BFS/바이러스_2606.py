def search(start):
    visited[start] = 1
    for i in range(len(visited)):
        if arr[start][i] == 1 and visited[i] == 0:
            search(i)

n = int(input())
m = int(input())
arr = [[0] * (n) for _ in range(n)]
visited = [0] * n
for i in range(m):
    x,y = map(int,input().split(" "))
    arr[x-1][y-1] = arr[y-1][x-1] = 1
search(0)
print(sum(visited)-1)