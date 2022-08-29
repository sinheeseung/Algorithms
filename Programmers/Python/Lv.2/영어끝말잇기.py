def solution(n, words):
    answer = []
    for i in range(1,len(words)):
        if words[i] in words[0:i]:
            answer.append(i%n+1)
            answer.append(int(i/n)+1)
            break
        elif words[i-1][len(words[i-1])-1] != words[i][0]:
                answer.append(i % n + 1)
                answer.append(int(i / n) + 1)
                break

    if len(answer) == 0:
        answer.append(0)
        answer.append(0)
    return answer


n = 2
words =	["hello", "one", "even", "never", "now", "world", "draw"]
print(solution(n, words))