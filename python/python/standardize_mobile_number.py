# https://www.hackerrank.com/challenges/standardize-mobile-number-using-decorators
# Enter your code here. Read input from STDIN. Print output to STDOUT

def standardize_number(num):
    if len(num) == 10:
        num = '+91'+num 
    elif num.startswith('+'):
        pass
    elif num.startswith('0'):
        num = '+91'+num[1::]
    else:
        num = '+'+num
    return '+{} {} {}'.format(num[1:3], num[3:8], num[8::])

def standardize_deco(func):
    def standardize(*args, **kwargs):
        return func([standardize_number(num) for num in args[0]])
    return standardize

@standardize_deco
def sort_numbers(nums):
    return sorted(nums)

input_numbers = [raw_input() for i in range(int(raw_input()))]
for num in sort_numbers(input_numbers):
    print num
