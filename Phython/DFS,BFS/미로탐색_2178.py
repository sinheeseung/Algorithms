from collections import deque

dx = [-1,1,0,0]
dy = [0,0,-1,1]
#왼쪽 오른쪽 아래쪽 위쪽
def bfs(x,y):
    queue = deque()
    queue.append((x,y))
    while queue:
        x,y = queue.popleft()
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]

            if n > nx >= 0 and m > ny >= 0:
                if graph[nx][ny] == 1:
                    graph[nx][ny] = graph[x][y] + 1
                    queue.append((nx,ny))

    return graph[n-1][m-1]
n,m = map(int, input().split(" "))
graph = []
for i in range(n):
    graph.append(list(map(int,input())))
print(bfs(0,0))