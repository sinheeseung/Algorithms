def solution(board, moves):
    arr = []
    count = 0
    for i in range(len(moves)):
        a = moves[i]
        for j in range(len(board[a - 1])):
            if board[j][a - 1] != 0:
                arr.append(board[j][a - 1])
                if len(arr) > 1:
                    if arr[-1] == arr[-2]:
                        arr.pop()
                        arr.pop()
                        count = count + 2
                board[j][a - 1] = 0
                break
    return count


board = [[0, 0, 0, 0, 0], [0, 0, 1, 0, 3], [0, 2, 5, 0, 1], [4, 2, 4, 4, 2], [3, 5, 1, 3, 1]]

moves = [1, 5, 3, 5, 1, 2, 1, 4]

solution(board, moves)
