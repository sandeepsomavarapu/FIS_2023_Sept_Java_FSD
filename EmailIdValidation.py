import re
email=input("Enter Email Id : " )
matcher=re.fullmatch("\w[a-zA-Z0-9_.]*@gmail[.]com",email)
print(matcher)
if matcher!=None:
    print("Valid Email")
else:
    print("Invalid Email Please Check")