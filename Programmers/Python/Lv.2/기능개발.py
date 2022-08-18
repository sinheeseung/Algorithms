import math


def solution(progresses, speeds):
    day = []
    answer = []
    for i in range(len(speeds)):
        a = math.ceil((100 - progresses[i]) / speeds[i])
        day.append(a)
    pre = day[0]
    count = 1
    for i in range(1, len(day)):
        if day[i] > pre:
            answer.append(count)
            count = 1
            pre = day[i]
        else:
            count += 1
    answer.append(count)
    return answer


progresses = [93, 30, 55]
speeds = [1, 30, 5]

solution(progresses, speeds)
