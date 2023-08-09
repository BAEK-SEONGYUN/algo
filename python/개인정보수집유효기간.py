
# https://school.programmers.co.kr/learn/courses/30/lessons/150370

def convert_day(date):
    year, month, day = map(int, date.split('.'))
    return (year * 12 * 28) + (month * 28) + day

def solution(today, terms, privacies):
    answer = []

    today = convert_day(today)

    term_dict = {}
    for i in range(len(terms)):
        term_dict[terms[i].split(' ')[0]] = int(terms[i].split(' ')[1]) * 28

    for i, privacie in enumerate(privacies):
        start, term = privacie.split()
        
        convert_start = convert_day(start)
       
        if term in term_dict:
            convert_start = convert_start + term_dict[term]

        if convert_start <= today:
            answer.append(i+1)

    return answer

if __name__ == "__main__":
    
    # ans = solution( "2022.05.19",  ["A 6", "B 12", "C 3"], ["2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"])
    ans2 = solution( "2020.01.01", ["Z 3", "D 5"] , ["2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"])
    print(ans2)