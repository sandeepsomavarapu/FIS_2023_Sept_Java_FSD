class Student:
    def __init__(self,name,rollno,marks):
        print("param constructor")
        self.name=name  #instance 
        self.rollno=rollno
        self.marks=marks
    def display(self):
        print(self.name," ",self.rollno," ",self.marks)
student= Student("mahesh",123,300)
student1= Student("sandeep",234,400)
student.email="mahesh@gmail"
print(student.email)
student.display()
student1.display()

#instance,static,local