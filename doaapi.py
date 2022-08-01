from flask import Flask, jsonify
app= Flask(__name__)
@app.route('/v1/<string:name>/bubble', methods=['GET'])
def game(name):
    msg = ""
    list= []
    lista = int(name.split('-'))
    for a in lista:
        a= int(a)
        if a not in list:
            list.append(int(lista))

    swap,iterations =0,0
    while list != sorted(list): #checks weather list is sorted or not
        for a in range(len(list)):
            try:# iterations
                if list[a]>list[a+1]: # b a c
                    list.insert(a+2,list[a]) # b a b c
                    list.pop(a) # a b c
                    swap = swap+1
            except:
                iterations=iterations+1
                msg = f'{msg} \n,  iteration {iterations} {list}'
                pass
            else:
                a=f'{msg}, \n Sorted list {list}, Number of swaps:{swap}, Number of iterations:{iterations}'
                return jsonify({"message":a})

app.run(port=8080)