profit,weight,cap=[10,10,12,18],[],25
bag,value,calweight,c,calprofit=[],[],0,0,0
for z in range(0,len(weight)):value.append(profit[z]/weight[z])
priority= sorted(value, reverse=True)
for i in range(len(weight)):
    try:
        if int(calweight+weight[c]) > cap:
            c=value.index(priority[i])
            ratio =  (cap -calweight) /weight[c]
            calprofit -= profit[value.index(priority[i-1])]
            calprofit+= profit[c]*ratio
            print(f"We have taken the index {c} in ratio of {ratio} to fill the remaining space of {cap-calweight}")
            break  
        c=value.index(priority[i])   
        calprofit+= profit[c]
        bag.append(str(f"Index: {c}, Profit: {profit[c]}, Weight: {weight[c]}"))
        calweight+=weight[c]
    except:
        print("We have filled everything, Remaining Space is:",cap-calweight)
        break
for i in bag:print(i)
print("Total Profit:",calprofit)