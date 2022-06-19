import tensorflow as tf
from tensorflow import keras
from flask import Flask,render_template, request
from flask_mysqldb import MySQL
import pandas as pd
import numpy as np
import pickle

app = Flask(__name__)

app.config['MYSQL_HOST'] = 'localhost'
app.config['MYSQL_USER'] = 'root'
app.config['MYSQL_PASSWORD'] = ''
app.config['MYSQL_DB'] = 'survival_covid'
#mysql = MySQLdb.connect( host='localhost', user='root', passwd='', db='survival_covid' )
#cur = conn.cursor()

mysql = MySQL(app)

@app.route('/')
def index():
    return render_template('survival.html')

@app.route('/predict', methods=['POST'])
def predict(): 
  #if (request.method == 'POST'):   
    #data = {
    JK = int(request.form['JK'])
    JP = int(request.form['JP'])
    Intubasi = int(request.form['Intubasi'])
    Pneumonia = int(request.form['Pneumonia'])
    Umur = int(request.form['Umur'])
    Hamil = int(request.form['Hamil'])
    Diabetes = int(request.form['Diabetes'])
    COPD = int(request.form['COPD'])
    Asma = int(request.form['Asma'])
    Hipertensi = int(request.form['Hipertensi'])
    PB = int(request.form['PB'])
    Obesitas = int(request.form['Obesitas'])
    Renal = int(request.form['Renal'])
    Tobacco = int(request.form['Tobacco'])
    Contact = int(request.form['Contact'])
    ICU = int(request.form['ICU'])
    #}
    
    model18 = keras.models.load_model('DataBalanceKFold0,1.h5')
    data18 = pd.DataFrame([[JK,JP,Intubasi,Pneumonia,Umur,Hamil,Diabetes,COPD,Asma,Hipertensi,PB,Obesitas,Renal,Tobacco,Contact,ICU]])
    prediksi = model18.predict([data18])
    output = np.round(prediksi, 0)

    cur = mysql.connection.cursor()
    cur.execute("INSERT INTO survival (JK, JP, Intubasi, Pneumonia, Umur, Hamil, Diabetes, COPD, Asma, Hipertensi, PB, Obesitas, Renal, Tobacco, Contact, ICU, Result) VALUES (%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s)",(JK, JP, Intubasi, Pneumonia, Umur, Hamil, Diabetes, COPD, Asma, Hipertensi, PB, Obesitas, Renal, Tobacco, Contact, ICU, output))
    mysql.connection.commit()
    cur.close()

  #return render_template('isSurvival.html', data=data, isSurvival=prediksi[0])

    return render_template('isSurvival.html', result=output, JK=JK, JP=JP, Intubasi=Intubasi, Pneumonia=Pneumonia, Umur=Umur, Hamil=Hamil, Diabetes=Diabetes, COPD=COPD, Asma=Asma, Hipertensi=Hipertensi, PB=PB, Obesitas=Obesitas, Renal=Renal, Tobacco=Tobacco, Contact=Contact, ICU=ICU)
  #    return Response(pred(), mimetype='text/event-stream')

if __name__ == '__main__':
    app.run(debug=True)
