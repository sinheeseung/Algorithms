import heapq


def solution(scoville, K):
    heapq.heapify(scoville)
    answer = 0
    while scoville[0] < K:
        if len(scoville) < 2:
            answer = -1
            break
        a1 = heapq.heappop(scoville)
        a2 = heapq.heappop(scoville)
        new = a1 + a2 * 2
        heapq.heappush(scoville, new)
        answer += 1
    return answer


scoville = [1, 2, 3, 9, 10, 12]
K = 7
solution(scoville, K)
