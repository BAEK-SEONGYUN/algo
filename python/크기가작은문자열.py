

def solution(t, p):
    answer = 0

    # print(len(p))

    for i in range(len(t)):
        # print(i)
        # print('t : ', t[i:i+len(p)])
        # print('p : ', p)
        if int(t[i:i+len(p)]) <= int(p):
            answer += 1
            # print('answer : ', answer)
        if i+len(p) == len(t):
            break

    return answer

## 더 간단한 코드
def solution_good(t, p):
    answer = 0

    for i in range(len(t) - len(p) + 1):
        if int(p) >= int(t[i:i+len(p)]):
            answer += 1

    return answer


if __name__ == '__main__':

    ans = solution("500220839878", "7")
    # ans = solution("3141592", "271")
    print(ans)