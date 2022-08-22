def to_binary(n, num):
    a = 2 ** (n - 1)
    bi = ''
    for i in range(n):
        if num // a == 1:
            bi += "1"
            num = num - a
        else:
            bi += "0"
        a /= 2
    return bi


def solution(n, arr1, arr2):
    answer = []
    for i in range(len(arr1)):
        bi = to_binary(n, arr1[i] | arr2[i])
        bi = bi.replace("1", "#").replace("0"," ")
        answer.append(bi)
    return answer

n = 5
arr1 = [9, 20, 28, 18, 11]
arr2 = [30, 1, 21, 17, 28]
print(solution(n, arr1, arr2))