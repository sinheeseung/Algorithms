from collections import deque


def solution(queue1, queue2):
    target_sum = (sum(queue1) + sum(queue2)) // 2
    left_sum = sum(queue1)
    queue1 = deque(queue1)
    queue2 = deque(queue2)

    answer = 0
    while queue1 and queue2:
        if left_sum < target_sum:
            tmp = queue2.popleft()
            left_sum += tmp
            queue1.append(tmp)
            answer += 1
        elif left_sum > target_sum:
            left_sum -= queue1.popleft()
            answer += 1
        else:
            return answer

    else:
        return -1


queue1 = [1, 1, 1]
queue2 = [5, 1, 1]
print(solution(queue1, queue2))
