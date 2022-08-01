from flask import Flask, jsonify
app= Flask(__name__)
@app.route('/ttt/v1/<string:name>', methods=['GET'])
def game(name):
    list = name.split('-')
    boxes = ["[1]","[2]","[3]","[4]","[5]","[6]","[7]","[8]","[9]"]
    markedboxes = []
    for s in list:
        s = int(s)
        markedboxes.append(s)
        boxes.pop(s)
        if len(markedboxes)%2 == 0:
            x = "[X]"
        else:
            x = "[O]"
        boxes.insert(s,x)
    for i in range(0,7,3):
        if boxes[i] == "[O]" and boxes[i+1] == "[O]" and boxes[i+2] == "[O]":
            return jsonify({"message":"PLayer 1 WON Congo!!"})
        elif boxes[i] == "[X]" and boxes[i+1] == "[X]" and boxes[i+2] == "[X]":
            return jsonify({"message":"PLayer 2 WON"})
    for i in range(0,3):
        if boxes[i] == "[O]" and boxes[i+3] == "[O]" and boxes[i+6] == "[O]":
            return jsonify({"message":"PLayer 1 WON Congo!!"})
        elif boxes[i] == "[X]" and boxes[i+3] == "[X]" and boxes[i+6] == "[X]":
            return jsonify({"message":"PLayer 2 WON"})
        
    if boxes[0] == "[O]" and boxes[4] == "[O]" and boxes[8] == "[O]":
        return jsonify({"message":"PLayer 1 WON Congo!!"})
    elif boxes[0] == "[X]" and boxes[4] == "[X]" and boxes[8] == "[x]":
        return jsonify({"message":"PLayer 2 WON"})
    elif boxes[2] == "[X]" and boxes[4] == "[X]" and boxes[6] == "[X]":
        return jsonify({"message":"PLayer 2 WON"})
    elif boxes[2] == "[O]" and boxes[4] == "[O]" and boxes[6] == "[O]":
        return jsonify({"message":"PLayer 1 WON Congo!!"})
    elif len(markedboxes) > 7:
        return jsonify({"message":"OwO, Seems like all places are filled now!!"})
    else:
        return jsonify({"message":"Invalid entry"})            
app.run(debug=False,port=8080)