# Lists
List1 = [23, 35, 64, 72, 75, 93]
List2 = [24, 64, 78, 65, 97, 10, 92]

print("First list is", List1)
print("Second list is", List2)
List3 = []

for number in List1:
    if(number%2 > 0) :
        List3.append(number)
for number in List2:
    if(number%2 == 0) :
        List3.append(number)
print("Third list is",List3)