import requests

from flask import Flask, jsonify

from api.requests_app import RequestsApi

app = Flask(__name__)
app.secret_key = "jjpb1208*"

@app.route('/list')
def listall():
    res = RequestsApi.getAll_api()
    print(res) 
    return jsonify(res)

@app.route('/list/<string:id_employe>')
def listOne(id_employe):
    res = RequestsApi.getOne_api(id_employe)
    return jsonify(res)

if __name__ == '__main__':
    app.run(port=8081, debug=True)
