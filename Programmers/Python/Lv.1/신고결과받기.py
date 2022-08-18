def solution(id_list, report, k):
    answer = [0] * len(id_list)
    ban_count = [0] * len(id_list)  # 신고 당한 횟수
    ban_id = []  # 신고당한 id list
    banned_id = [] # 정지된 id list
    report = list(set(report))
    for re in report:
        # 신고당한 id 수집
        ban_id.append(re.split()[1])
        
    for i in range(len(id_list)):
        ban_count[i] = ban_id.count(id_list[i])
        if ban_count[i] >= k:
            # 신고당한 횟수가 k 이상이면
            banned_id.append(id_list[i])
            
    for re in report:
        if re.split()[1] in banned_id:
            # 내가 신고한 사람이 정지된 id list에 있다면
            idx = id_list.index(re.split()[0])
            answer[idx] += 1
    return answer


id_list = ["muzi", "frodo", "apeach", "neo"]
report = ["muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"]
k = 2

solution(id_list, report, k)
