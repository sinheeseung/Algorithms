def solution(s):
    answer = len(s)
    for i in range(1, int(len(s) / 2)+1):
        pre = ''
        a = ''
        count = 1
        for j in range(0, len(s), i):
            if j == 0:
                pre = s[j:j + i]
            else:
                if pre == s[j:j + i]:
                    count += 1
                else:
                    if count != 1:
                        a += str(count)
                    a += pre
                    pre =  s[j:j + i]
                    count = 1
        if count != 1:
            a += str(count)
        a += pre
        if len(a) < answer:
            answer = len(a)
    return answer


s = "abcabcdede"
print(solution(s))