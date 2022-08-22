def solution(dartResult):
    answer = []
    c_s = 0
    i = 0
    while i < len(dartResult):
        current = dartResult[i]
        if current.isdigit():
            if i + 1 < len(dartResult):
                if dartResult[i + 1].isdigit():
                    current = dartResult[i:i + 2]
                    i += 1
            c_s = int(current)
        elif current == 'S':
            answer.append(c_s)
        elif current == 'D':
            answer.append(c_s ** 2)
        elif current == 'T':
            answer.append(c_s ** 3)
        elif current == '*':
            p = len(answer) - 1
            if p != 0:
                answer[p - 1] = answer[p - 1] * 2
            answer[p] = answer[p] * 2
        elif current == '#':
            p = len(answer) - 1
            answer[p] = answer[p] * -1
        i += 1
    return sum(answer)

dartResult = "1S2D*3T"
solution(dartResult)