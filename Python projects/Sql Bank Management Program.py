'''
import mysql.connector
con=mysql.connector.connect(host="localhost",user="root",password="1234",database="anmol")
cur=con.cursor()


def add_data():
    import mysql.connector
    con=mysql.connector.connect(host="localhost",user="root",password="1234",database="anmol")
    cur=con.cursor()
    acn=int(input("Enter Account Number:"))
    Name=input("Enter The Name of account holder:")
    phn=int(input("Enter The Phone Number:"))
    brb=input("Enter Branch name of the customer:")
    query="insert into regscust values({},'{}','{}',251{})".format(acn,Name,brb,phn)
    cur.execute(query)
    con.commit()




add_data()

def get_data():
    import mysql.connector
    con1=mysql.connector.connect(host="localhost",user="root",password="1234",database="anmol")
    cur1=con1.cursor()
    ac=int(input("Enter The Account Number To search:"))
    query="select * from regscust where acno={}".format(ac)
    cur1.execute(query)
    my_rec=cur1.fetchall()
    for x in my_rec:
        print(x)

get_data()
'''

def upd_data():
    import mysql.connector
    con1=mysql.connector.connect(host="localhost",user="root",password="1234",database="anmol")
    cur1=con1.cursor()
    nam=int(input("Enter The Account Number whose record has to be updated:"))
    query="select * from regscust where acno={}".format(nam)
    cur1.execute(query)
    up_rc=cur1.fetchall()
    up=input("Enter updated Name:")
    query1="update regscust set custname=%s where acno=nam".format(up)
    cur1.execute(query1,(up,))
    con1.commit()
    print("Account details Updated Successfully")
    print("Account is Not Present in database")
            



upd_data()