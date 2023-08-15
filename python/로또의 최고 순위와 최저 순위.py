

# 66.7 점... -> rank를 수정해서 100점
def solution(lottos, win_nums):
    answer = []
    rank = [6,6,5,4,3,2,1]

    lotto = set(lottos)
    win_num = set(win_nums)

    ans = lotto & win_num
    print(len(ans))

    if lottos.count(0) == 6:
        answer = [1,6]
    elif lottos.count(0) == 0:
        answer = [rank[len(ans)], rank[len(ans)]]
    else:
        answer = [rank[len(ans) + lottos.count(0)], rank[len(ans)], ]


    return answer

## 다른사람풀이
# 방법은 같나..? 하여튼 더 짧다..
def solution_good(lottos, win_nums):

    rank=[6,6,5,4,3,2,1]

    cnt_0 = lottos.count(0)
    ans = 0
    for x in win_nums:
        if x in lottos:
            ans += 1
    return rank[cnt_0 + ans],rank[ans]



if __name__ == '__main__':
    # ans = solution(	[1, 2, 3, 4, 5, 6], [7, 8, 9, 10, 11, 12])
    # ans = solution([45, 4, 35, 20, 3, 9],	[20, 9, 3, 45, 4, 35])
    ans = solution([0, 0, 0, 0, 0, 0],	[38, 19, 20, 40, 15, 25])
    print(ans)