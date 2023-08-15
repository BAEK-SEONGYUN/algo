# https://school.programmers.co.kr/learn/courses/30/lessons/92334

# # 정확성: 66.7 - 시간초과가 나버림..
# def solution(id_list, reports, k):
#     answer = []

#     dic_id = {key : [] for key in id_list}
#     dic_stop = {key : 0 for key in id_list}

#     one_report = []
#     for i in range(len(reports)):
#         tmp = reports[i].split(' ')

#         # print(tmp)
#         # print(one_report)
#         if tmp in one_report:
#             # print('passs')
#             pass
#         else: 
#             one_report.append(tmp)
            
#             dic_id[tmp[0]].append(tmp[1])
#             dic_stop[tmp[1]] += 1

#     dic_stop = {key: value for key, value in dic_stop.items() if value >= k}
#     dic_stop = set(dic_stop.keys())
#     for key, value in dic_id.items():
#         answer.append(len(set(value) & dic_stop))

#     return answer

# 다시 풀이
def solution(id_list, reports, k):
    answer = []

    dic_id = {key : [] for key in id_list }
    dic_reported = {key: 0 for key in id_list}
    
    reports = list(set(reports))

    for report in reports:
        name, reported = report.split()

        dic_id[name].append(reported)
        dic_reported[reported] += 1

    # print(dic_reported)
    for val in dic_id.values():
        result = 0
        for v in val:
            if dic_reported[v] >= k:
                result += 1
        answer.append(result)

    return answer

if __name__ == '__main__':
    ans = solution(["muzi", "frodo", "apeach", "neo"], ['muzi frodo','muzi frodo','muzi frodo',"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"], 2)
    # ans = solution(["con", "ryan"],["ryan con", "ryan con", "ryan con", "ryan con"],3)
    print(ans)