			------------					
			Introduction
			------------
In this lab, we designed a library for student management application.
We used two design patterns in the design of this application, one is
factory pattern while the other is the singleton pattern.

Factory pattern was used to create student objects based on the input
from user, singleton pattern was used to create database file. We used
Jackson library for storing and reading, java objects in json format.

			--------
			Approach
			--------
My approach to solve this problem consists of creating four java classes
namely Student, StudentFactory, StudentDatabase and Main.
 
1. Student class contains all the necessary information about the 
   Student object. All the properties and methods of this class are 
   provided with minimum visibility.

2. StudentFactory class is incorporating factory pattern for creating
   objects of Student class, it has only one method that creates Student
   object and returns it.

3. StudentDatabase class incorporates the singleton pattern and it creates
   only one database (json) file which is then used again and again due to the
   pattern. It checks if the file has already been created, if yes then it uses
   that file else it creates a new file for one time.

4. Main class is the driver class of the program, it has a main method which just
   calls other methods. It also contains some other methods like displayMenu, getChoice,
   getStudentData, removeStudent and printAllStudents.
   The above mentioned methods are just for API and they do not have a very detailed
   implementation. They just in turn call the actual methods of their classes.
   Main class also has a Scanner, StudentDatabase and currentStudent fields.

5. Please refer to the class diagrams in design document for further understanding.

			----------
			How to Run
			----------

Using this application is quite simple, just execute the main method and the program will start.

1. It will display a menu which will show whether you want to add a student, remove a student,
   print current students, or exit.

2. For first run the json file will be created and it will be empty, so remove and print options
   will produce nothing, except for a message telling that no record was found.

3. If you select add a student option, you have to enter the first name, last name, date of birth,
   address and the class name of the student and it will successfully enter student in database.

4. Now for removing an existing student you just have to enter his/her first name and last name.
   Program will find exact match and delete it from the database.

5. If you select the print all students option then all the students in database will be printed
   to the console in pretty format.

6. Exit option will terminate the program.

			--------
			Analysis
			--------
1. The program performs all the required functionality in an elegent and clean manner.

2. It was more of a design problem and the logic in building the application was close
   to none.

3. Except from jackson's api, application runs in O(n) complexity because of using ArrayLists
   and single for loop.
