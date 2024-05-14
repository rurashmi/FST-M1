# Get the user names
user1 = input("What is the name of player 1")
user2 = input("What is the name of player 2")

# User's choice
user1_ans = input(user1 + "Do you want to choose rock, paper or scissors? ").lower()
user2_ans = input(user2 + "Do you want to choose rock, paper or scissors? ").lower()

# Rules
if user1_ans == user2_ans:
    print("Its a tie!")
elif user1_ans == 'rock':
    if user2_ans == 'scissors':
        print("Rock Wins!")
    else:
        print("Paper wins!")
elif user1_ans == 'scissors':
    if user2_ans == 'paper':
        print("Scissor wins!")
    else:
        print("Rock Wins")
elif user1_ans == 'paper':
    if user2_ans == 'rock':
        print("Paper Wins!")
    else:
        print("Scissor wins")
else:
    print("Invalid input, please try again")
