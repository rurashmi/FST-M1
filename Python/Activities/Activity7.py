numbers = list(input("Enter values: ").split(", "))
#numbers = list((5, 8, 10))
sum = 0
for number in numbers:
    sum += int(number)
print(sum)