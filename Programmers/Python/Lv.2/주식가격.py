def solution(prices):
    answer = []
    for i in range(len(prices)):
        count = 0
        for j in range(i+1,len(prices)):
            count += 1
            if prices[j] < prices[i]:
                break
        answer.append(count)
    return answer

prices = [1, 2, 3, 2, 3]
print(solution(prices))