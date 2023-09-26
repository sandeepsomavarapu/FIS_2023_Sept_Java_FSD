class Test:
	@classmethod
	def m1(cls,name):
		Test.a=123
		print(cls.a)
t=Test()
Test.m1('sandeep')
