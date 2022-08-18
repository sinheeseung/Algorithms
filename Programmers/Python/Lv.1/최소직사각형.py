def solution(sizes):
    width = []
    height = []
    for i in range(len(sizes)):
        width.append(max(sizes[i][0], sizes[i][1]))
        height.append(min(sizes[i][0], sizes[i][1]))

    return max(width) * max(height)

sizes = [[60, 50], [30, 70], [60, 30], [80, 40]]
solution(sizes)