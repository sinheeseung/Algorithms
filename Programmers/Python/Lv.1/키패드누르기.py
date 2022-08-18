def solution(numbers, hand):
    left_a = 3
    left_b = 1
    right_a = 3
    right_b = 3
    answer = ''
    for i in range(len(numbers)):
        if numbers[i] == 0:
            cur_a = 3
            cur_b = 2
        elif numbers[i] % 3 == 1:
            left_a = numbers[i] // 3
            left_b = numbers[i] % 3
            answer += "L"
            continue
        elif numbers[i] % 3 == 0:
            right_a = numbers[i] // 3 - 1
            right_b = 3
            answer += "R"
            continue
        else:
            cur_a = numbers[i] // 3
            cur_b = numbers[i] % 3
        dif_l = abs(cur_a - left_a) + abs(cur_b - left_b)
        dif_r = abs(cur_a - right_a) + abs(cur_b - right_b)

        if dif_l == dif_r:
            if hand == "right":
                answer += "R"
                right_a = cur_a
                right_b = cur_b
            else:
                answer += "L"
                left_a = cur_a
                left_b = cur_b
        elif dif_l < dif_r:
            answer += "L"
            left_a = cur_a
            left_b = cur_b
        else:
            answer += "R"
            right_a = cur_a
            right_b = cur_b
    return answer

numbers = [1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5]
hand = 'right'

solution(numbers,hand)