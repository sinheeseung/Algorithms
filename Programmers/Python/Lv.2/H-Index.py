def solution(citations):
    answer = 0
    citations.sort(reverse=True)
    for i in range(len(citations)):
        if citations[i] < i + 1:
            break
        else:
            answer += 1
    return answer


citations = [1, 1, 5, 7, 6]
print(solution(citations))
