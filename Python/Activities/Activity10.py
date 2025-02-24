numbers = tuple(map(int,input("enter the tuple of numbers: ").split(",")))

for i in numbers:
    if i%5==0:
        print(i)
else:
    print("given tuple has no numbers which are divisible by 5")