from collections import deque


def solution(people, limit):
    answer = 0
    people = deque(sorted(people))

    while people:
        left = people[0]
        right = people.pop()
        if not people:
            return answer+1
        if left + right <= limit:
            people.popleft()
        answer += 1
    return answer


people = [70, 80, 50]
limit = 100
print(solution(people, limit))


