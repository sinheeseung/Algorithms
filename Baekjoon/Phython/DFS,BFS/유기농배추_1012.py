import sys

sys.setrecursionlimit(100000)
dx = [-1,1,0,0]
dy = [0,0,1,-1]

def dfs(v,u,count):
    arr[v][u] = count
    for i in range(4):
        nx = dx[i] + u
        ny = dy[i] + v

        if m>nx>=0 and b>ny>=0:
            if arr[ny][nx] == -1:
                dfs(ny,nx,count)
t = int(input())

for i in range(t):
    m,b,k = map(int,input().split(" "))
    arr = [[0] * m for _ in range(b)]
    for j in range(k):
        x,y = map(int,input().split(" "))
        arr[y][x] = -1
    count = 0
    for v in range(b):
        for u in range(m):
            if arr[v][u] == -1:
                count += 1
                dfs(v,u,count)
                '''bfs(v,u,count)'''
    print(count)