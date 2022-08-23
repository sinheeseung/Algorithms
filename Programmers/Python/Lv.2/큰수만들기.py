def solution(number, k):
    answer = ''
    j = i = len(number) - k
    while len(answer) < i:
        m = len(number) - j
        number_a = number[:m + 1]
        max_num = "0"
        for a in range(len(number_a)):
            if number_a[a] > max_num:
                max_num = number_a[a]
            if max_num == "9":
                break
        idx = number.index(max_num)
        answer += str(max_num)
        number = number[idx + 1:]
        j -= 1
    return answer


number = "1231234"
k = 3
print(solution(number, k))
