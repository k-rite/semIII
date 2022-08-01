list=[7,6,5,8,3]
sublist = []
sublistcollection={}
length=len(list)/2
for i in range(0,1):
    if int(length)%2==1:
        for a in range (0,int(length)):
            print(a)
            sublist.append(list[a])
        sublistcollection[f'{len(sublistcollection)+1}'] = sublist
        print(sublistcollection)
        sublist.clear()
        print(list[1+int(length/2)])
        for b in range (int(length)+1,length):
            print(b)
            sublist.append(list[b+int(length)])
        sublistcollection[{len(sublistcollection)+1}] = sublist
        print(sublistcollection)
    else:
        print("Even is running")
