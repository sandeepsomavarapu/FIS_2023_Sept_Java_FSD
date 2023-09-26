class DefaultEx1: 
	myvar = "" 

	# default constructor 
	def __init__(self): 
		self.myvar = "welcome to default constructor"

	# a method for printing data members 
	def print_myvar(self): 
		print(self.myvar) 


# creating object of the class 
obj = DefaultEx1() 

# calling the instance method using the object obj 
obj.print_myvar() 
