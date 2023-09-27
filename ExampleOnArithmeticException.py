
try:
	a=int(input('enter the value for a'))
	b=int(input('enter the value for b'))
	print('statement 1')
	res=a/b
	print(res)
except ZeroDivisionError: 
	print('denominator cannot be zero')
except ValueError: 
	print('Enter Only Numbers....')
print('last statement')