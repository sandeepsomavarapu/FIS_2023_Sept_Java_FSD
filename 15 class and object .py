class Employee:
	company = 'welcome to programming'#if there is no static keyword then it is instance var
	a=123
	def func_message(self,comapny):#self indicates current class object
		self.company=comapny
		print('Welcome to Python Programming')
	def  addition(self,x,y):
		res=x+y
		print(res)
	def __init__(self):# default constructor
		print('Hello World')	
emp1 = Employee() # Created an Instance
print(emp1.company)
emp1.func_message("fis global")
print(emp1.company)
emp1.addition(123,234)
