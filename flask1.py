from flask import Flask, jsonify, request, render_template
app= Flask(__name__)
stores =[{"name":'My wonderful store','items':[{"name":'my item','price':15.99}]}]
@app.route('/')
def home():
    return render_template('index.html')
@app.route('/store', methods=['POST'])
def create_store():
    request_data = request.get_json()
    new_store={"name":request_data['name'], "items":[]}
    stores.append(new_store)
    return jsonify(new_store)
@app.route('/store/<string:name>')
def get_stores(name):
    for store in stores:
        if store['name'] == name:
            return jsonify(store)

    else:
        return jsonify({"message": "No store with that name"})


@app.route('/store')
def get_store():
    return jsonify({"stores":stores})
@app.route('/store/<string:name>/items', methods=['POST'])
def get_item_in_store(name):
    for store in stores:
        if store['name'] == name:
            return jsonify({'items':store['items']})
    return jsonify({'message':'store with that name not found'})

@app.route('/store/<string:name>/item', methods=['POST'])
def create_item_in_store(name):
    for store in stores:
        request_data = request.get_json()

        if store['name'] == name:
            new_item = {"name":request_data['name'],'price':request_data['price']}
            store['items'].append(new_item)
            return jsonify(new_item)
    return jsonify({'message':'store with that name not found'})
app.run(port=8000)
