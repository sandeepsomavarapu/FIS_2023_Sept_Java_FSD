class Employee:
      
    def add(self, a, b):
        print('parent class')
        print('The Sum of Two = ', a + b)
  
class Department(Employee):
  
    def add(self, a, b):
        print('The Sum of two = ', a + b )
        print('child class')
         
emp = Employee()
emp.add(10, 20)
  
print('------------')
dept = Department()
dept.add(50, 130)
