def Calc(a, ACT, b):
    if ACT=='+':
        R = a+b
    if ACT=='-':
         R = a-b
    if ACT=='*':
        R = a*b
    if ACT=='/':
        R = a/b
        R = round(R, 2)
    return R
A = int(input('A = '))
B = int(input('B = '))
print('Выберите арифметическое действие', '\n', '[ + ] [ - ] [ * ] [ / ]')
act = str(input())
act = act.replace(' ', '')
act = act.replace('[', '')
act = act.replace(']', '')
print(f'{A} {act} {B} = {Calc(A, act, B)}')