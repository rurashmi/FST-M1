def sum(numbers):
    sum = 0
    for number in numbers:
        sum +=number
    return sum
    #List of numbers
numberList =[10, 15, 23, 82]
Sum_total = sum(numberList)
print("The sum of all the elements is: " + str(Sum_total))