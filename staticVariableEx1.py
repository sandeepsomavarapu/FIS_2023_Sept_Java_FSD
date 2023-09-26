class Test:
	x=123
	def __init__(self):
		Test.y=111
	def m1(self):
		Test.z=897
	@staticmethod
	def m2(self):
		Test.a=789
Test.eid=198
t=Test()
print(t.y,'    ',Test.x)