from collections import deque


def dfs(idx, visited, computers):
    queue = [idx]
    while queue:
        q = queue.pop()
        for i in range(len(computers[q])):
            if i != q and computers[q][i] == 1 and not visited[i]:
                queue.append(i)
        visited[q] = 1


def solution(n, computers):
    visited = [0] * n
    count = 0
    for i in range(n):
        if visited[i] == 0:
            dfs(i, visited, computers)
            count += 1
    return count


n = 3
computers = [[1, 1, 0], [1, 1, 1], [0, 1, 1]]
print(solution(n, computers))
