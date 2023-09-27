'''
a=[1,2,3,4,5,6,7,8,9,10]

for i in range(len(a)):                   #Extracting even and odd numbers using for loop
    
    if (a[i]%2==0):
        print(a[i])
        
    if(a[i]%2!=0):
        print(a[i])         
'''  
i=0
b=False
while i<10:                                #Extracting even and odd numbers using while loop
    if i % 2 == 0:
        b = True
        print("This is even number")
        print(i)
    else:
        print("This is odd number")
        print(i)    
    i+=1    
