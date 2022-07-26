list,swap = [5,1,6,2,4,3],0
# 1 5 6 2 4 3 | 1 2 5 6 4 3 | 1 2 4 5 6 3 | 1 2 3 4 5 6  
solution=sorted(list)
while list != solution: #checks weather list is sorted or not
    for a in range(1,len(list)):
        try:
            if list[a] < list[a+1]:
                # print(list,solution)
                # index = solution.index(list[a+1])
                # list.insert(index,list[a+1])
                # print(list)
                # newlist = []
                # for i in list:
                #     if i not in newlist:
                #         newlist.append(i)
                # list = newlist.copy()
                # while list[a]<list[a+1]:
                #     newlist.clear()
                #     index = index -1
                #     list.insert(index,list[a])
                #     for i in list:
                #         if i not in newlist:
                #             newlist.append(i)
                # list = newlist.copy()
                # newlist.clear()
                # print(list) 
                # print(index)
                if list[a+1] < list[a+2]:
                    
        except:
            swap=swap+1
else:
    print(f"Sorted list {list}, Number of swaps:{swap}") #list is sorted :)