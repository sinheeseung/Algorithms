from collections import deque


def solution(skill, skill_trees):
    answer = 0
    for skill_tree in skill_trees:
        arr = deque()
        for i in range(len(skill)):
            if skill_tree.find(skill[i]) != -1:
                if len(arr) != i:
                    arr.append(-1)
                    break
                arr.append(skill_tree.find(skill[i]))
        while arr:
            if min(arr) == arr[0] and min(arr) >= 0:
                arr.popleft()
            else:
                break
        if not arr:
            answer += 1
    return answer


skill = "CBDK"
skill_trees = ["CB", "CXYB", "BD", "AECD", "ABC", "AEX", "CDB", "CBKD", "IJCB", "LMDK"]
print(solution(skill, skill_trees))
