def solution(lottos, win_nums):
    arr = [0 for i in range(46)]
    count = 0
    count_z = lottos.count(0)
    for i in range(len(win_nums)):
        arr[win_nums[i]] = 1
    for i in range(len(lottos)):
        if arr[lottos[i]] == 1:
            count = count + 1
    answer = [7-max(count+count_z,1), 7-max(count,1)]
    return answer

lottos = [44, 1, 0, 0, 31, 25]
win_nums = [31, 10, 45, 1, 6, 19]

solution(lottos, win_nums)