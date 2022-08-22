def solution(survey, choices):
    answer = ''
    answer_1 = [0] * 4
    list_a = ['R','C','J','A']
    list_b = ['T','F','M','N']
    for i in range(len(survey)):
        if "A" in survey[i]:
            if survey[i][0] == "A":
                answer_1[3] = answer_1[3] + choices[i] - 4
            else:
                answer_1[3] = answer_1[3] + 4 - choices[i]

        if "C" in survey[i]:
            if survey[i][0] == "C":
                answer_1[1] = answer_1[1] + choices[i] - 4
            else:
                answer_1[1] = answer_1[1] + 4 - choices[i]

        if "M" in survey[i]:
            if survey[i][0] == "J":
                answer_1[2] = answer_1[2] + choices[i] - 4
            else:
                answer_1[2] = answer_1[2] + 4 - choices[i]

        if "R" in survey[i]:
            if survey[i][0] == "R":
                answer_1[0] = answer_1[0] + choices[i] - 4
            else:
                answer_1[0] = answer_1[0] + 4 - choices[i]

    for i in range(len(answer_1)):
        if answer_1[i] <= 0:
            answer = answer + list_a[i]
        else:
            answer = answer + list_b[i]
    return answer

survey = ["AN", "CF", "MJ", "RT", "NA"]
choices = [5, 3, 2, 7, 5]
print(solution(survey, choices))
