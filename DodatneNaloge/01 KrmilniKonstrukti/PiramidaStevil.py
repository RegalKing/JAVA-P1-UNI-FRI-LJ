n=5
x=1
for i in range(n):
    for _ in range(n-1-i):
        print(" ",end="")
    x=i+1
    for _ in range(2*i+1):
        print(x%10,end="")
        x+=1
    print()