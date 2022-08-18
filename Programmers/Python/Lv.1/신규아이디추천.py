import re


def solution(new_id):
    # 1단계
    new_id = new_id.lower()
    # 2단계
    new_id = re.sub('[^0-9a-z_.\-]+', '', new_id)
    # 3단계
    while '..' in new_id:
        new_id = new_id.replace('..', '.')
    # 4단계
    new_id = new_id.strip('.')
    # 5단계
    if len(new_id) == 0:
        new_id = 'a'
    # 6단계
    if len(new_id) >= 16:
        new_id = new_id[0:15]
        new_id = new_id.strip('.')
    # 7단계
    if len(new_id) <= 2:
        for i in range(len(new_id), 3):
            new_id = new_id + new_id[len(new_id) - 1]
    answer = new_id
    return answer


new_id = "...!@BaT#*..y.abcdefghijklm"
solution(new_id)
