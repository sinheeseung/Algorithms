def solution(n):
    fibo = [0] * (n+2)
    fibo[0] = 0
    fibo[1] = 1
    for i in range(2,2+n):
        fibo[i] = fibo[i-1] + fibo[i-2]
    return fibo[n] % 1234567

n = 3
print(solution(n))