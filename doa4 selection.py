# Selection Sort Algorithm
# 1. While check weather list is sorted or not
#     a. If sorted then it displays the answer
#     b. Step1: FINd the minimum element of the list
#        Step2: Check weather list is ascending order(0-9), 
#        Step3: Wherever the element is not sorted, it will swap with minimum element of the list
#        Step4: For every Swap done, Swap var gets +1
#        Step4: Keeps on doing it, once list is sorted it will break the loop and show the answer 
#        and number of swaps
list,swap = [8,3,2,7,9,1,4],0
print(list)
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