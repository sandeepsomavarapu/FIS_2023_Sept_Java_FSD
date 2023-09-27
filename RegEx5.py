import re
matcher=re.finditer("a{2,4}","abbaaxaaab")
for match in matcher:
    print(match.start(),"....",match.group())
# m=re.fullmatch("sandeepsomavarapu","sandeepsomavarapu")
# if m!=None:
#     print("exactly matched")
# else:
#     print("failed to match")