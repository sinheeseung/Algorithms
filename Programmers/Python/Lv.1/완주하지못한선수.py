def solution(participant, completion):
    participant.sort()
    completion.sort()
    for i in range(len(completion)):
        if participant[i] != completion[i]:
            return participant[i]
    return participant[len(participant) - 1]


participant = ["leo", "kiki", "eden"]
completion = ["eden", "kiki"]

solution(participant, completion)
