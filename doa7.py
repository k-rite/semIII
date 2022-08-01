list = [1,5,6,2,4,3]
msg = []
# 1 5 6 2 4 3 | 1 2 5 6 4 3 | 1 2 4 5 6 3 | 1 2 3 4 5 6  
solution=sorted(list)
def mover(a):
    try:
        while list[a] > list[a+1]:
            list[a],list[a+1] = list[a+1],list[a]
            if list[a-1]>list[a]:
                if list[a-1] == list(len(list)):
                    pass 
            else:
                mover(a-1)
        else:
            if list[a] > list[a+1]:
                
            mover(a+1)
    except:
        pass
while list != solution: #checks weather list is sorted or not
    a=0
    mover(a)  
else:
    print(msg)
    print(f"Sorted list {list}") #list is sorted :)