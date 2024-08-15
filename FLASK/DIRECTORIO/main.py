from flask import Flask
from flask import render_template

app = Flask(__name__)

@app.route('/')
def home():
    return 'Welcome to the Flask App!'

@app.route('/hello')
def system():
    return 'Bienvenido!'

@app.route('/html')
def html():
    return render_template('index.html')