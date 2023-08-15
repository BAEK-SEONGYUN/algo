
def solution(survey, choices):

    answer = ''

    order = dict({
        'R':  0,'T' : 0,
        'C' : 0,'F' : 0,
        'J' : 0,'M' : 0,
        'A' : 0,'N' : 0
        }
    )
    # order = [
    #     [{'R':  0},{'T' : 0}],
    #     [{'C' : 0},{'F' : 0}],
    #     [{'J' : 0},{'M' : 0}],
    #     [{'A' : 0},{'N' : 0}]
    # ]
    for surv, choice in zip(survey, choices):
        if choice > 4:
            order[surv[1]] += abs(choice-4)
        elif choice < 4:
            order[surv[0]] += abs(choice-4)
    
    order_key = list(order.keys())
    order_val = list(order.values())
    
    for index in range(0,7):
        if index%2 != 0:
            print(index%2 != 0)
            pass
        else:
            answer = answer + (order_key[index] if order_val[index] > order_val[index+1] or order_val[index] == order_val[index+1] else order_key[index+1])
    # print(order[0])

    return answer

# 동점인 경우 사전순으로 빠른거 선택
if __name__ == '__main__':
    ans = solution(["AN", "CF", "MJ", "RT", "NA"], [5, 3, 2, 7, 5])

    print(ans)