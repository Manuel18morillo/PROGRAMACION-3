from flask import Flask,flash,redirect,request
from flask import render_template

app = Flask(__name__)

@app.route('/')
def index():
    return render_template('index.html',page='index')

@app.route('/mision')
def mision():
    return render_template('mision.html',page='mision')

@app.route('/vision')
def vision():
    return render_template('vision.html',page='vision')

@app.route('/contacto', methods=['GET','POST'])
def contacto():
    if request.method=='POST':
        nombre=request.form['nombre']
        email=request.form['email']
        mensaje=request.form['mensaje']

        print(f"Nombre: {nombre}")
        print(f"Email: {email}")
        print(f"Mensaje: {mensaje}")

        flash('!Gracias por contactarnos¡')

        return redirect('/contacto')

    return render_template('contacto.html')