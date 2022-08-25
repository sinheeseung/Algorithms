def solution(n):
    answer = n+1
    while True:
        b = str(format(answer, 'b'))
        a = str(format(n, 'b'))
        if b.count("1") == a.count("1"):
            break
        answer += 1
    return answer


n = 15
print(solution(n))
