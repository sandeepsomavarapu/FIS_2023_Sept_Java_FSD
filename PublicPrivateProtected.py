class Test:
	a=10  #public
	_b=20 #protected
	__c=90#private
	def m1(self):
		print(Test.a)
		print(Test._b)
		print(Test.__c)

t=Test()
t.m1()
print(Test.a)
print(Test._b)
print(Test.__c)
