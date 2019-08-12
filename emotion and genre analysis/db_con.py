import mysql.connector
import combined_final

mydb = mysql.connector.connect(host="localhost",user="root",passwd="sankalp",database="tek")

mycursor = mydb.cursor()
mycursor.execute("select * from info")

myresult = mycursor.fetchall()

for x in myresult:
  s = x[2]
  t = x[1]
  ans=combined_final.func(s)
  rand="sports"
  sql = "INSERT INTO com VALUES (%s, %s,%s)"
  val = (t, ans,rand)
  mycursor.execute(sql, val)
  mydb.commit()
  
  
  