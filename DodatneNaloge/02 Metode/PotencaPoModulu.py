a = 5
b = 2
m = 7

def rec(a: int, b: int, m: int) -> int:
    if b%2 != 0:
        return int((a**b)%m)
    return (rec(a, b/2, m) * rec(a, b/2, m)) % m

print(rec(a, b, m))