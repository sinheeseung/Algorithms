def solution(s):
    answer = ''
    is_blank = True
    for i in range(len(s)):
        if s[i].isalpha() and is_blank:
            answer += s[i].upper()
        else:
            answer += s[i].lower()
        if s[i] == ' ':
            is_blank = True
        else:
            is_blank = False

    return answer


s = "3people unFollowed me"
print(solution(s))
