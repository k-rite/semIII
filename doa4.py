list,swap = [6,2,11,7,5],0
solution = sorted(list)
def sort(a):
    global swap #to overwite swap variable in def()
    if list[a] != solution[a]: #checking if elements in ascending order
        swap_index = list.index(solution[a])
        list[a],list[swap_index] = list[swap_index],list[a] #swapping elements
        swap = swap+1 #counting number of swaps
        print(f'Swap:{swap} \n{list}')
while list != solution: #checks weather list is sorted or not
    for a in range(len(list)):
        sort(a)
else:
    print(f"Sorted list {list}, Number of swaps:{swap}") #list is sorted :)