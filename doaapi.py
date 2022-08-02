from flask import Flask, jsonify
app= Flask(__name__)
@app.route('/v1/<string:name>/bubble', methods=['GET'])
def game(name):
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
app.run(port=8080)