import re
number=input("Enter Number : " )
matcher=re.fullmatch("[7-9]\d{9}",number)
print(matcher)
if matcher!=None:
    print("Valid Indian Contact")
else:
    print("Invalid contact")