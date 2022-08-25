def solution(n):
    arr = [[1] * n for x in range(n)]
    answer = []
    x = 0
    y = -1
    count = 1
    for i in range(n):
        if i % 3 == 0:
            for j in range(n - i):
                y += 1
                arr[y][x] = count
                count += 1
        elif i % 3 == 1:
            for j in range(n - i):
                x += 1
                arr[y][x] = count
                count += 1
        else:
            for j in range(n - i):
                x -= 1
                y -= 1
                arr[y][x] = count
                count += 1
    for i in range(n):
        for j in range(i+1):
            answer.append(arr[i][j])
    return answer

n = 2
print(solution(n))
