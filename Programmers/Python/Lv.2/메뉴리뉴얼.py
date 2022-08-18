from itertools import combinations


def solution(orders, course):
    answer = []
    for i in course:
        li = []
        for j in range(len(orders)):
            st = ''.join(sorted(orders[j]))
            com = list(combinations(st, i))
            for c in com:
                li.append(c)
        set_li = sorted(set(li))
        if len(set_li) == 0:
            break
        count = [0] * len(set_li)
        for j in range(len(set_li)):
            count[j] = li.count(set_li[j])
        max_c = max(count)
        if max_c < 2:
            continue
        try:
            while True:
                idx = count.index(max_c)
                count[idx] = -1
                answer.append(''.join(set_li[idx]))
        except:
            continue
    return sorted(answer)


orders = ["ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"]
course = [2, 3, 4]

solution(orders, course)
