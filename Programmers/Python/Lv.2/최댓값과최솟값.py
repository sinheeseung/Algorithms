def solution(s):
    list = s.split(" ")
    list_num = []
    for li in list:
        list_num.append(int(li))
    answer = str(min(list_num)) + " " + str(max(list_num))
    return answer

s = "-1 -2 -3 -4"
print(solution(s))
