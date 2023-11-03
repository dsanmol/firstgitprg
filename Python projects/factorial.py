n=int(input("Enter the number to find the factorial"))
n1=1
for i in range(1,n+1):
    if(n==1):
        print("Factorial is:",n)
    elif(n==0):
        print("Factorial is 1")
    else:
        n1=n1*i
        
        
print(n1)    
        

'''
i=0
while(i<=n):
    i+=1
    if(n==1):
        print("Factorial is:",n)
    elif(n==0):
        print("Factorial is 1")
    else:
        n1=n*(n-1)
        
        
print(n1)
'''            
