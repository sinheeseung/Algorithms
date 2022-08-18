def solution(numbers):
    result = 0
    for i in range(1, 10):
        if numbers.count(i) == 0:
            result = result + i
    return(result)

numbers = [1,2,3,4,6,7,8,0]

solution(numbers)