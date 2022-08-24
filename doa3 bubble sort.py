list,swap,iterations = [4,3,2,5,6,1],0,0
def sort(a):
    global swap #to overwite swap variable in def()
    try:# iterations
        if list[a]>list[a+1]: # b a c
            list.insert(a+2,list[a]) # b a b c
            list.pop(a) # a b c
            swap = swap+1
    except:
        global iterations  #to overwite iterations variable in def()
        iterations=iterations+1
        print(f"iteration {iterations} {list}")
        pass
while list != sorted(list): #checks weather list is sorted or not
    for a in range(len(list)):
        sort(a)
else:
    print(f"Sorted list {list}, Number of swaps:{swap}, Number of iterations:{iterations}")