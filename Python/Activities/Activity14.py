def fibonacciNum(number):
    if number <= 1:
        return number
    else:
        return (fibonacciNum(number-1)+fibonacciNum(number-2))

iteration_number = int(input("Enter a number: "))
if iteration_number <= 1:
    print("please enter a valid nunber")
else:
    print("Fibonacci sequence: ")
    for i in range(iteration_number):
        print(fibonacciNum(i))
