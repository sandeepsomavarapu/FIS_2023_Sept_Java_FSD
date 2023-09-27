class Test:
	def m1(self):
		print('Test class m1 method')
	def m2(self):
		print('Test class m2 method')
class A(Test):
	def m3(self):
		print('A class m3 method')
	def m2(self):
		print('A class m2 method')
		
a=A()
a.m1()		
a.m2()
a.m3()	
a1=Test()
a1.m2()
		
		
		