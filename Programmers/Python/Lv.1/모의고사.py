def solution(answers):
    a1 = [1, 2, 3, 4, 5]
    a2 = [2, 1, 2, 3, 2, 4, 2, 5]
    a3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]
    s1 = s2 = s3 = 0
    for i in range(len(answers)):
        if answers[i] == i % 5 + 1:
            s1 = s1 + 1
        if answers[i] == a2[i % 8]:
            s2 = s2 + 1
        if answers[i] == a3[i % 10]:
            s3 = s3 + 1
    max_s = max(s1, s2, s3)
    answer = []
    if s1 == max_s:
        answer.append(1)
    if s2 == max_s:
        answer.append(2)
    if s3 == max_s:
        answer.append(3)
    return answer


answer = [1, 2, 3, 4, 5]
solution(answer)
