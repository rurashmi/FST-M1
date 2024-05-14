fruitList = {
    "apple": 200,
    "watermelon": 70,
    "orange": 120,
    "mango": 500
}
keyCheck = input("Which fruit you are looking for? ").lower()

print(keyCheck)
if keyCheck in fruitList:
    print("Fruit is available")
else:
    print("This fruit is not in stock")