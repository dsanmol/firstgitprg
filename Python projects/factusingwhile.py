'''
a=int(input("Enter a no=")) 
for i in range(1,11):
    s=a*i    
    print(s)


for i in range(1,6):
    for j in range(i):
        print("*",end=' ')
    print("\r")
'''
n=int(input("Enter the number"))
n1=0
n2=1
if(n==0 or n==1):
    print("0,1")
else:
    print(n1)
    print(n2)
    for i in range(2,n):
        
        n3=n1+n2
        
        n1=n2
        n2=n3
        print(n3)    