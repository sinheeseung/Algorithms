from itertools import combinations


def is_prime(n):
    for i in range(2, int(n / 2) + 1):
        if n % i == 0:
            return 0
    return 1


def solution(nums):
    answer = 0
    a = []
    for i in combinations(nums, 3):
        a.append(i)
    for b in a:
        answer = answer + is_prime(sum(b))
    return answer


nums = [1, 2, 3, 4]
solution(nums)
