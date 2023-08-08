# https://school.programmers.co.kr/learn/courses/30/lessons/161990


# ## 정확성 83.9 나옴 ㅠㅠ
# def solution(wallpaper):
#     lux, luy, rdx, rdy = 51, 51, 0, 0
#     for i, 가로 in enumerate(wallpaper):
#         if 가로.find('#') < luy and 가로.find('#') > -1:
#             luy = 가로.find('#')
#             if i < lux:
#                 lux = i
#         if 가로.rfind('#') > rdy:
#             rdy = 가로.rfind('#')        
#         if i > rdx:
#             rdx = i

#     answer = [lux, luy, rdx+1, rdy+1]
#     return answer

# 만족스러운 코드인듯.. 첨에 왜 어렵게 삽질을 했을까..?
def solution(wallpaper):
    x, y = [], []
    for i in range(len(wallpaper)):
        for j in range(len(wallpaper[i])):
            if wallpaper[i][j] == '#':
                x.append(i)
                y.append(j)

    answer = [min(x), min(y), max(x)+1, max(y)+1]
    return answer

if __name__ == '__main__':
    
    ans = solution([".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...", "....#...."])
    print(ans)