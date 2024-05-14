numberList = list(input("Enter values: ").split(", "))
#numberList = [10, 50, 70, 90, 50]
print("given list is", numberList)

firstElement = numberList[0]
lastElement =  numberList[-1]

if (firstElement == lastElement):
    print(True)
else:
    print(False)