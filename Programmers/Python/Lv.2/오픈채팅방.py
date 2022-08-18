def solution(record):
    answer = []
    mapping = {}
    for re in record:
        if "Leave" not in re:
            mapping[re.split()[1]] = re.split()[2]
    for re in record:
        name = mapping.get(re.split()[1])
        if "Enter" in re:
            answer.append(name + "님이 들어왔습니다.")
        if "Leave" in re:
            answer.append(name + "님이 나갔습니다.")
    return answer


record = ["Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"]

solution(record)