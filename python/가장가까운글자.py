#https://school.programmers.co.kr/learn/courses/30/lessons/142086

def solution(s):
    answer = []
    # print('s : ', s)
    dic_a = {key : -1 for key in s}
    # print(dic_a)

    for i, a in enumerate(s):
        # print('i : ', i)
        # print('a : ', a)
        # print('dic_a : ', dic_a)
        if dic_a[a] == -1:
            answer.append(-1)
            dic_a[a] = i

        elif dic_a[a] != -1:
            answer.append(i -dic_a[a])
            dic_a[a] = i
        
        # print('dic_a : ', dic_a)
        # print('answer : ',answer)
        # print('---------------')
    return answer

# 방법은 나랑 같은데 코드가 다음

## 다른 답안
def solution(s):
    answer = []
    dic = dict()
    for i in range(len(s)):
        if s[i] not in dic:     # not in 을 사용했음
            answer.append(-1)   # 없으면 -1 넣어주고
        else:
            answer.append(i - dic[s[i]])    # 있으면 i - dic[s[i]]
        dic[s[i]] = i                       # 그 다음 i 로 바꿔줌

    return answer

if __name__ == '__main__':
    ans = solution('bananananan')

    print(ans)