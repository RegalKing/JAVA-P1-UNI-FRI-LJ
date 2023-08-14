a = 2
b = 3
n = 10

def rec(a: int, b: int, n: int) -> int:
    if n == 0:
        return 1 
    return rec(a, b, n//a) + rec(a, b, n//b) + 1

print(rec(a, b, n))