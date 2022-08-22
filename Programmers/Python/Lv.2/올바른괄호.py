def solution(s):
    arr = []
    for i in range(len(s)):
        if s[i] == "(":
            arr.append(0)
        else:
            if len(arr) == 0:
                return False
            else:
                arr.pop()
    return len(arr) == 0
s = ")()("
print(solution(s))