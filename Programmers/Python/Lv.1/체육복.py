def solution(n, lost, reserve):
    arr = [1] * n
    for i in range(n):
        if i + 1 in lost:
            arr[i] -= 1
        if i + 1 in reserve:
            arr[i] += 1
    for i in range(n):
        if i - 1 >= 0:
            if arr[i] == 0 and arr[i - 1] > 1:
                arr[i] = 1
                arr[i - 1] -= 1
        if i + 1 < n:
            if arr[i] == 0 and arr[i + 1] > 1:
                arr[i] = 1
                arr[i + 1] -= 1

    return n - arr.count(0)


n = 5
lost = [2, 4]
reserve = [1, 3, 5]

solution(n, lost, reserve)
