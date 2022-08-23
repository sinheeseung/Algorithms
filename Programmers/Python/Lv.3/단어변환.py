
def solution(begin, target, words):
    answer = 0
    visited = []
    if target not in words:
        return 0
    stack = [begin]
    while stack:
        pop = stack.pop()
        if pop == target:
            break
        for i in range(len(pop)):
            lost_a = pop[0:i] + pop[i+1:]
            for word in words:
                lost_b = word[0:i] + word[i+1:]
                if lost_a == lost_b and word not in visited:
                    stack.append(word)
                    visited.append(word)
        answer += 1
    return answer




begin = 'hit'
target = 'cog'
words = ["hot", "dot", "dog", "lot", "log", "cog"]
print(solution(begin, target, words))
