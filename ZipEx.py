from zipfile import *
f=ZipFile("ThreadsEx1.zip",'w',ZIP_DEFLATED)
f.write("thread1.py")
f.write("thread2.py")
f.write("thread3.py")
f.write("thread4.py")
f.close()
print("threadsexamples.zip file created successfully") 