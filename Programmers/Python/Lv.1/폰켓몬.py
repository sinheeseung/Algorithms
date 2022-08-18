def solution(nums):
    set_nums = set(nums)
    if len(nums) / 2 > len(set_nums):
        answer = len(set_nums)
    else:
        answer = len(nums) / 2
    return answer


nums = [3, 1, 2, 3]
solution(nums)
