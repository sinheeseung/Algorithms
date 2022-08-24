from collections import deque


def solution(priorities, location):
    priorities = deque(priorities)
    count = 0
    while True:
        pop = priorities.popleft()
        if len(priorities) == 0:
            count += 1
            break
        if max(priorities) > pop:
            priorities.append(pop)
            if location == 0:
                location = len(priorities) - 1
            else:
                location -= 1
        else:
            count += 1
            if location == 0:
                return count
            location -= 1
    return count


priorities = [1]
location = 0
print(solution(priorities, location))
