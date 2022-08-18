def solution(absolutes, signs):
    answer = 0
    for i in range(len(signs)):
        if signs[i]:
            answer = answer + absolutes[i]
        else:
            answer = answer - absolutes[i]
    return answer


absolutes = [4, 7, 12]
signs = [True, False, True]

solution(absolutes, signs)
