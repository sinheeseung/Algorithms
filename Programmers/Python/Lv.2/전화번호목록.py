
def solution(phone_book):
    phone_book = sorted(phone_book)
    answer = True
    idx = 0
    while answer and idx < len(phone_book)-1:
        if len(phone_book[idx]) <= len(phone_book[idx+1]):
            if phone_book[idx+1][:len(phone_book[idx])] == phone_book[idx]:
                answer = False
        idx += 1
    return answer




phone_book = ["119", "97674223", "1195524421"]
print(solution(phone_book))

