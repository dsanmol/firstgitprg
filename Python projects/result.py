eng=int(input("Enter Marks Scored in English out of 100:"))
hin=int(input("Enter Marks Scored in Hindi out of 100:"))
sci=int(input("Enter Marks Scored in Science out of 100:"))
mat=int(input("Enter Marks Scored in Maths out of 100:"))
sst=int(input("Enter Marks Scored in Social Science out of 100:"))
add=eng+hin+sci+mat+sst
per=(add/500)*100
print("% Gained by in the exam Student is:",per)
