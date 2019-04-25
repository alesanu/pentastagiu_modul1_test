# pentastagiu_modul1_test
	## First test
	

	1. What is regression? What is retesting?
	Re-Testing: After a defect is detected and fixed, the software should be retested to confirm that the original defect has been successfully removed. This is done to make sure that the tests cases which failed in last execution are passing after the defects against those failures are fixed.
	Regression testing is a type of software testing that tests all area of code or functionalities which can be affected during the solving of a bug. Also, it ensures that the new code has not affected other parts of the software.
	

	2. What is the relationship between the following: error, bug, defect, fault, failure?
	These terms are an integral part of the software testing process and without detecting and identifying them testers cannot validate the quality and functionality of a software.
	During the process of software testing, errors are the most basic discrepancies found by the team of testers while they are preparing the code, having as a result changing the functionality of the software. 
Bugs usually impact the performance and the functionality of the software and can cause it to deliver incorrect and unexpected results.
Defects are deviations or irregularities from the specifications required by a customer.
Faults are caused by an introduction of an incorrect process or data definition and makes the software behave in an incorrect way.
Failure appears when a software is incapable of performing the required functions and is offering results that are not adequate and far from the expected results.
	

	3. Name the difference between agile & v-model. (Please specify some roles and cycles for these)
Agile 
- an iterative method
- software is released after each iteration
- reduces testing cycle time as the testing is done parallel to the development activities
- features are delivered incrementally, enabling some benefits to be realized early as the product continues to develop
- testing is integrated throughout the lifecycle
- regular inspection
- adjustments if it's necessary 
- - Roles: project manager, product owner/business analyst, tester, designer, developer.


V-model
- cascading method, step by step
- it is also called as verification and validation Model
- this means the verification and validation will be done side by side.
- it emphasis the strict process flow to develop a quality product
- the errors occurred in any phase will be corrected in that phase itself
- parallel activities can be done
- Cycles: requirements specifications, functional specifications, design, coding
- Roles: project manager, product owner, tester, designer, developer.

In conclusion, the biggest difference between these two is that in v-model each phase must be completed before the next phase begin, while in agile methodology, developers write different small parts of code, test them, and can change them if it's required. Also, they can deliver these small parts to the customer in order to receive a feedback.


	4. Please state what is black box testing? How about white box testing? You can also give an example
Black Box Testing is a software testing method in which testers evaluate the functionality of the software without looking at the code. Here we can talk about acceptance testing and system testing.For example, when we test the interface of a website page, we check if some fields can receive different kinds of data (numeric, alfanumeric, characters).
White Box Testing is a software testing method in which the internal structure/ design/ implementation of the item being tested is known to the tester. He will divide the code in small parts and analyze them in order to check, verify and trying to find some problems which can appear. Here we can talk about unit testing an dintegration testing.

	

	5. In the images folder you have a login form. Create Test Cases for the given form.
	

	Please state the testing types(functional, non-functional, black box, white box, design technique) for each TC created.
Functional tests: 
Check if the SIGN UP button will take user on another form – CREATE USER
Check if pressing FACEBOOK icons will take the user on his facebook page
Check if pressing GOOGLE+ icons will take the user on his google account
Check if pressing LINKEDIN icons will take the user on his linkedin account


Check results on entering valid User Id & Password
Check if registration can be done with name field blank, or containing numbers, or special characters
Check if registration can be done with email field blank or invalid email adress format
Check if registration can be done with password field blank or contaiing less than 8 characters
Check results on entering Invalid User ID & Password
Check response when a User ID is Empty & Login Button is pressed, and many more
Check if ewgistration can be done twice with the same adress email
Check if login is validated with an invalid email adress format 
Check if login is validated with an invalid username

GUI tests (black box)
Check is form resolution are displayed properly
Check if all the fields are aligned
Checj if the company logo is correct
Check if the company logo has the correct resolution
Check how it is displayed on multiple screen, on different resolutions

Non-functional (black box)
stress testing – how the website reacts when are trying to sign in/ sign up a lot of users
security testing – after a number of attempts, the account is blocked
load testing – how the website reacts at different numbers of users
compability testing – if it’s accesible from different browsers


		6. Consider that you have found a defect in the form for the previous exercise. Create a bug report for it

Category	Label	    Value
Bug ID	  ID number   	#1
	      Name	        SIGN UP - Unable to sign up
	      Reporter	    Nechifor Denisa 
	      Submit Date	25.04.2019
Overview  Summary	    After I complete the registration form and I try to click on a SIGN UP button, but I’m unable to create account
	      URL	        www.example.com/signup
          Screenshot	photo.png
Details	  Reproduce	   Try to sign up, after introducing Name, Email, Password
          Expected result	I should can acces my account
	      Actual result	Nothing happening
Tracking  Severity	    High
	      Priority	    High
          Notes	        	







