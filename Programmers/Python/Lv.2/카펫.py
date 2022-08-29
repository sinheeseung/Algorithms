def solution(brown, yellow):
    answer = []
    sum = brown + yellow
    width = height = 3
    while True:
        if sum % width == 0:
            height = int(sum / width)
            if (width+height-2
            ) * 2 == brown and (width-2) * (height-2) == yellow:
                    answer.append(height)
                    answer.append(width)
                    break
        width += 1
    return answer

brown = 24
yellow = 24

print(solution(brown,yellow))