class Employee: #constructor overloading not supported by python
    def __init__(self,name):#constructor
        print("am from param constructor"+name)
    def welcomeMsg(self):#instance method
        print("am from default function")
emp=Employee("sandeep")
emp.welcomeMsg()
emp1=Employee("accenture")