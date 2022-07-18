import os

from sqlalchemy import true
stack = []
size=3
def push(a):
    print(stack)
    if len(stack) > (size-1):
        print(f'Stack is Overflow, {a} cant be appended')
    else:
        stack.append(a)
        print(stack)

def pop(a):
    print(stack)
    while a in stack:
        stack.pop()
        print(stack)
    if len(stack) == 0:
        print("Stack is empty")
    else:
        print(stack)
while True:
    input()
    os.system("cls")
    print(stack)
    response = input("1:pop,2:push")
    value = input("which value you want to push/pop")
    if response == 1:
        pop(value)
    elif response == 2:
        push(value)
# push(5)
# push(4)
# push(6)
# push(7)
# pop(5)
1