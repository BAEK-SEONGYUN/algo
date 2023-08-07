# https://school.programmers.co.kr/learn/courses/30/lessons/176963

# 사진들을 보며 추억에 젖어 있던 루는 사진별로 추억 점수를 매길려고 합니다. 
# 사진 속에 나오는 인물의 그리움 점수를 모두 합산한 값이 해당 사진의 추억 점수가 됩니다. 
# 예를 들어 사진 속 인물의 이름이 ["may", "kein", "kain"]이고 각 인물의 그리움 점수가 
# [5점, 10점, 1점]일 때 해당 사진의 추억 점수는 16(5 + 10 + 1)점이 됩니다. 
# 다른 사진 속 인물의 이름이 ["kali", "mari", "don", "tony"]이고 
# ["kali", "mari", "don"]의 그리움 점수가 각각 [11점, 1점, 55점]]이고, 
# "tony"는 그리움 점수가 없을 때, 이 사진의 추억 점수는 3명의 그리움 점수를 합한 67(11 + 1 + 55)점입니다.

# 그리워하는 사람의 이름을 담은 문자열 배열 name, 
# 각 사람별 그리움 점수를 담은 정수 배열 yearning, 
# 각 사진에 찍힌 인물의 이름을 담은 이차원 문자열 배열 photo가 매개변수로 주어질 때, 
# 사진들의 추억 점수를 photo에 주어진 순서대로 배열에 담아 return하는 solution 함수를 완성해주세요.

def solution(name, yearning, photo):
    answer = []
    

    dic = { name:value for name, value in zip(name, yearning) }
    # print(dic)

    for people in photo:
        score = 0

        for person in people:
            score += dic.get(person, 0)

        answer.append(score)
    return answer

# 다른 사람의 답..
def solution_good(이름, 점수, 사진):
    return [sum(점수[이름.index(j)] for j in i if j in 이름) for i in 사진]

# 위의 답을 풀어써본것
def solution_copy(이름, 점수, 사진):
    사진별_점수_합계 = []
    for i in 사진:
        점수_합계 = 0
        for j in i:
            if j in 이름:
                # 이름 목록에 있는 이름일 경우 해당 이름의 점수를 가져와서 점수 합계에 더합니다.
                인덱스 = 이름.index(j)

                print(이름)
                점수_합계 += 점수[인덱스]
        사진별_점수_합계.append(점수_합계)
    

    # 각 사진별 점수 합계 출력 또는 활용
    for idx, 점수_합계 in enumerate(사진별_점수_합계):
        print(f"사진 {idx+1}의 점수 합계: {점수_합계}")

    return 0


if __name__ == '__main__':

    ans = solution_copy(["may", "kein", "kain", "radi"], [5, 10, 1], [["may"],["kein", "deny", "may"], ["kon", "coni"]])
    print(ans)