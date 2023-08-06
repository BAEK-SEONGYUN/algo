# https://school.programmers.co.kr/learn/courses/30/lessons/178871?language=python3

# 얀에서는 매년 달리기 경주가 열립니다. 해설진들은 선수들이 자기 바로 앞의 선수를 추월할 때 추월한 선수의 이름을 부릅니다.
# 예를 들어 1등부터 3등까지 "mumu", "soe", "poe" 선수들이 순서대로 달리고 있을 때, 해설진이 "soe"선수를 불렀다면 2등인 
# "soe" 선수가 1등인 "mumu" 선수를 추월했다는 것입니다. 즉 "soe" 선수가 1등, "mumu" 선수가 2등으로 바뀝니다.

# 선수들의 이름이 1등부터 현재 등수 순서대로 담긴 문자열 배열 players와 해설진이 부른 이름을 담은 문자열 배열 callings가 매개변수로 주어질 때, 
# 경주가 끝났을 때 선수들의 이름을 1등부터 등수 순서대로 배열에 담아 return 하는 solution 함수를 완성해주세요.


## 내가 푼 풀이
def solution(players, callings):
    answer = []

    player_dict = {player: rank for rank, player in enumerate(players)}
    rank_dict = {rank: player for rank, player in enumerate(players)}

    # print(player_dict)
    # print(rank_dict)

    for calling in callings:
        change = player_dict[calling]

        player_dict[rank_dict[change]], player_dict[rank_dict[change-1]] = player_dict[rank_dict[change-1]], player_dict[rank_dict[change]]
        rank_dict[change], rank_dict[change-1] = rank_dict[change-1], rank_dict[change] 

    # print(player_dict)
    # print(rank_dict)

    return list(rank_dict.values())


## 풀이 중 맘에 드는거
# dict을 하나로 사용했음
# 
def solution_good(players, callings):
    pla_dic = {key: i for i, key in enumerate(players)}
    print(pla_dic)
    
    for p in callings:
        c = pla_dic[p]
        pla_dic[p] -= 1
        pla_dic[players[c-1]] += 1
        players[c-1], players[c] = players[c], players[c-1]

    return players

if __name__ == '__main__':
    # print('hello')
    ans = solution_good(["mumu", "soe", "poe", "kai", "mine"], ["kai", "kai", "mine", "mine"])
    print(ans)