from flask import Flask, jsonify
app= Flask(__name__)
@app.route('/v1/<string:name>/bubble', methods=['GET'])
def bubble(name):
    list= []
    iterations =[]
    lista = name.split('-')
    c= sorted(list)
    for i in range (0,len(lista)):
        list.append(int(lista[i]))
    swap = 0
    def sort(a):
        global swap
        try:# iterations
            if list[a]>list[a+1]: # b a c
                list.insert(a+2,list[a]) # b a b c
                list.pop(a) # a b c
                swap = swap+1
        except:
            iterations.append(list)
            pass
    while list != c:
        for a in range(len(list)):
            sort(a) #checks weather list is sorted or not
    else:
        a=f'Sorted list {iterations} , Number of swaps:{swap}, Number of iterations:{len(iterations)}'
    return jsonify({"message":a})
@app.route('/v1/<string:name>/selection', methods=['GET'])
def selection(name):
    list=[]
    a=name.split('-')
    for i in range (0,len(a)):
        list.append(int(a[i]))
    solution=sorted(list)
   # swap = int(0)
    msg = ''
    def sort(a):
        global msg
        global swap
         #to overwite swap variable in def()
        if list[a] != solution[a]: #checking if elements in ascending order
            swap_index = list.index(solution[a])
            list[a],list[swap_index] = list[swap_index],list[a] #swapping elements
            #swap = swap+1 #counting number of swaps
            msg = msg + f'Swap:{swap} \n{list}'
    while list != solution: #checks weather list is sorted or not
        #global swap
        for a in range(len(list)):
            sort(a)
    else:
        return jsonify({msg:f"Sorted list {list}, Number of swaps:swap"}) #list is sorted :)
app.run(port=8080,debug=True)