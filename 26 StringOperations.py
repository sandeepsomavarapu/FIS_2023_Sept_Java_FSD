# s=input('enter some string...')
# i=0
# for x in s:
#     print(s[i],':',i)
#     i=i+1

    # strip method
	# strip-->to remove space before and after string 
	# lstrip-->to remove space only before the string
	# rstrip-->to remove space only after string

# city=input('enter your city name :')
# scity=city.rstrip()
# if scity=='hyderabad':
#     print('hello hyderabadhi...')
# elif scity=='banglore':
#     print('hello banglorian...')
# elif scity=='delhi':
#     print('hello delhi...')
# else:
#     print('invalid city...')

#find(),index(),rfind(),rindex()

# orgName='excelr india from excelr group learning java from excelr'
# print(orgName.find('from'))
# print(orgName.find('from',18,50))
# print(orgName.rfind('from'))
# print(orgName.index('excelr'))
# print(orgName.rindex('excelr'))
# print(orgName.count('excelr'))
# print(orgName.count('from'))
# print(orgName.replace('excelr','fisglobal'))

#split

# orgName='excelr india from excelr group learning java from excelr'
# result=orgName.split()
# for x in result:
#     print(x)

# dob='22/07/2023'
# result=dob.split('/')
# for x in result:
#     print(x)

# names=('sunny','bunny','chinny')
# data=':'.join(names)
# print(data)

# companyname="excelR indIa hyderaBad"
# print(companyname.upper())
# print(companyname.lower())
# print(companyname.swapcase())
# print(companyname.title())
# print(companyname.capitalize())

# schoolname="hyderabad public school"
# print(schoolname.startswith('hyderabad'))
# print(schoolname.endswith('school'))
# print(schoolname.endswith('hyderabad'))

print('Excelr123'.isalnum())# anyone from this .... a-z A-Z 0-9
print('Excelr123'.isalpha())# anyone from this .... a-z A-Z 
print('Excelr'.isalpha())# anyone from this .... a-z A-Z 
print('excelr'.isdigit())# anyone from this .... 0-9
print('12345'.isdigit())# anyone from this .... 0-9
print('excelr'.islower())# anyone from this .... a-z
print('EXCELR'.isupper())# anyone from this .... a-z
print('Excelr India'.istitle())# anyone from this .... a-z
print('excelr'.isspace())