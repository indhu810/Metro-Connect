METRO CONNECT

CORE JAVA METRO CARD AND JOURNEY MANAGEMENT SYSTEM

1. PROJECT TITLE

Metro Connect – Core Java Metro Card and Journey Management System

2. PROJECT OVERVIEW

Metro Connect is a console-based Metro Card and Journey Management System developed using Core Java.

The project simulates a metro card system where passengers can manage their metro card, recharge their balance, search for available routes, book one or multiple tickets, calculate travel distance and fare, verify payment using OTP, and maintain transaction history.

The main purpose of this project is to apply Core Java concepts in a practical real-world application instead of practicing each concept separately.

3. PROJECT OBJECTIVE

The objective of Metro Connect is to develop a practical metro card management system using Core Java.

The project focuses on implementing user input, card management, recharge operations, route searching, station validation, distance calculation, fare calculation, ticket booking, balance management, OTP verification, and transaction management.

4. TECHNOLOGY USED

Programming Language

Java

Development Environment

IntelliJ IDEA

Application Type

Console-Based Application

Main Java APIs Used

Scanner

ArrayList

Random

Date and Time API

Math

5. MAIN FEATURES

Metro Card Management

Card Recharge

Balance Management

Multiple Metro Routes

Station Validation

Route Searching

Automatic Distance Calculation

Distance-Based Fare Calculation

Multiple Ticket Booking

Payment Method Selection

OTP Verification

Balance Validation

Recharge Transactions

Travel Transactions

Transaction History

Date and Time Display

Input Validation

6. HOW THE SYSTEM WORKS

The application follows a sequence of operations.

The passenger first provides the metro card number.

The system searches for the card and verifies whether the card exists.

After the card is found, the passenger can perform a recharge operation or continue with the travel operation.

For travel, the passenger enters the starting station and destination station.

The system searches the available routes and checks whether both stations are available on the same route.

After finding the route, the system calculates the distance between the selected stations.

The fare is then calculated according to the distance.

The passenger enters the number of tickets required.

The system calculates the total fare.

The available card balance is checked.

If the balance is sufficient, the payment process continues.

The passenger selects a payment method.

An OTP is generated for payment verification.

The passenger enters the OTP.

If the OTP is correct, the fare is deducted from the card balance and the journey ticket is generated.

The travel transaction is also stored.

If the OTP is incorrect, the payment is not completed. The passenger can choose to receive another OTP.

The transaction history can be viewed after performing the required operations.

7. METRO CARD MANAGEMENT

The MetroCard class stores the details of a metro card.

The card contains:

Card Number

Passenger Name

Balance

The system searches for the card using the entered card number.

If the card number is invalid, the system displays an invalid card message.

8. RECHARGE OPERATION

The recharge operation allows passengers to add money to their metro card.

The system performs the following operations:

Card number validation

Passenger information display

Current balance display

Recharge amount input

Recharge amount validation

Balance update

Recharge transaction storage

Multiple recharge support

Updated balance display

The system does not allow zero or negative recharge amounts.

9. ROUTE MANAGEMENT

The project contains multiple metro routes.

Each route contains a list of stations.

Each station contains its station name and distance position within the route.

The RouteFinder class searches the available routes and checks whether the selected starting and destination stations belong to the same route.

If both stations are available on the same route, the route is selected for the journey.

If a direct route is not available, the journey is rejected.

10. STATION VALIDATION

The system validates the station names entered by the passenger.

The input is cleaned before comparison by removing unnecessary spaces and handling uppercase and lowercase differences.

For example, different forms of a station name can be matched with the stored station name.

This helps the application handle user input more effectively.

11. DISTANCE CALCULATION

Each station contains a distance position within its route.

The distance between the starting station and destination station is calculated using their stored positions.

For example:

Starting station position = 5 km

Destination station position = 12 km

Calculated distance = 7 km

The calculated distance is then used for fare calculation.

12. FARE CALCULATION

The project uses distance-based fare calculation.

The current fare structure is:

Distance from 1 to 5 km

Fare = ₹20 per ticket

Distance above 5 km up to 10 km

Fare = ₹35 per ticket

Distance above 10 km up to 15 km

Fare = ₹45 per ticket

Distance above 15 km up to 25 km

Fare = ₹55 per ticket

Distance above 25 km up to 50 km

Fare = ₹60 per ticket

13. MULTIPLE TICKET BOOKING

The passenger can book multiple tickets in a single operation.

The system asks the passenger for the required number of tickets.

The total fare is calculated using the fare per ticket and the number of tickets.

Example:

Fare per ticket = ₹35

Number of tickets = 3

Total fare = ₹105

The total amount is deducted from the card only after successful OTP verification.

14. BALANCE VALIDATION

Before completing the payment, the system checks the available balance.

If the card balance is greater than or equal to the total fare, the payment process continues.

If the card balance is less than the total fare, the payment is rejected.

In case of insufficient balance:

The balance is not deducted.

The journey ticket is not generated.

The travel operation is treated as unsuccessful.

15. OTP PAYMENT VERIFICATION

The project includes OTP-based payment verification.

A random OTP is generated when the passenger proceeds with payment.

The passenger must enter the correct OTP to complete the payment.

If the entered OTP is incorrect, the payment is not completed.

The passenger is given the option to request another OTP.

If the passenger chooses to resend, a new OTP is generated.

The OTP verification process continues until the correct OTP is entered or the passenger chooses not to resend the OTP.

The balance is deducted only after successful OTP verification.

16. TRANSACTION MANAGEMENT

The project records transactions generated by actual operations.

The transaction types include:

Recharge

Travel

Each transaction contains:

Card Number

Transaction Type

Amount

Status

Example transaction information:

Card Number = 3

Transaction Type = Recharge

Amount = ₹500

Status = Success

Travel transactions can also contain successful or failed status information.

17. TRANSACTION HISTORY

Transaction information is stored using an ArrayList.

Transactions are added when the passenger performs actual recharge or travel operations.

The system can display the stored transaction history.

This allows the passenger to view the operations performed on the metro card.

18. DATE AND TIME

The travel operation uses the Java Date and Time API.

The journey ticket records the date and time of the travel operation.

This provides additional information about when the ticket was generated.

19. DATA OPERATIONS

The project performs several data operations.

Add Operation

Recharge and travel transactions are added to the transaction list after the corresponding operations.

Search Operation

The system searches for metro cards, stations, and routes.

Update Operation

The metro card balance is updated after successful recharge and successful travel payment.

Read Operation

The system reads card details, passenger information, balance information, route information, station information, and transaction information.

Validation Operation

The system validates card numbers, station names, routes, recharge amounts, ticket counts, balance availability, and OTP values.

20. JAVA CONCEPTS USED

The project uses the following Core Java concepts:

Classes and Objects

Constructors

Methods

Variables

Data Types

Conditional Statements

Loops

String Handling

ArrayList

Scanner

Random

Math Operations

Static Data

Date and Time API

Input Validation

Multiple Classes

Object Creation

Method Calls

21. PROJECT CLASSES

Main.java

Starts the application and calls the required operations.

MetroCard.java

Stores metro card information such as card number, passenger name, and balance.

metrocarddata.java

Stores metro card information using an ArrayList.

Recharge.java

Handles card searching, recharge operations, amount validation, balance updates, and recharge transactions.

Travel.java

Handles the complete journey booking process including station selection, route searching, distance calculation, fare calculation, ticket booking, balance validation, payment selection, OTP verification, balance deduction, ticket generation, and travel transactions.

station.java

Stores station information and its distance position.

TrainRoute.java

Stores the available metro routes and their stations.

RouteFinder.java

Searches routes, validates stations, and finds station distance information.

Transaction.java

Represents an individual transaction and stores transaction details.

transactiondata.java

Stores and displays transaction history.

22. APPLICATION FLOW

Metro Connect

Card Number Entry

Card Validation

Recharge or Travel

Starting Station Selection

Destination Station Selection

Route Search

Station Validation

Distance Calculation

Fare Calculation

Ticket Count

Total Fare Calculation

Balance Validation

Payment Method Selection

OTP Generation

OTP Verification

Payment Processing

Balance Deduction

Transaction Storage

Journey Ticket Generation

Transaction History

23. PROJECT BENEFITS

This project provides practical experience in developing a console-based Java application.

It helps in understanding how multiple classes communicate with each other and how different Core Java concepts can be combined to implement a real-world use case.

The project also provides practice in handling user input, validating data, performing calculations, managing collections, controlling application flow, and handling different user scenarios.

24. FUTURE ENHANCEMENTS

The project can be further developed by adding:

JDBC database connectivity

MySQL or PostgreSQL integration

Persistent transaction storage

REST API integration

Spring Boot backend

User authentication

Web-based user interface

Admin management

Advanced transaction reports

Online ticket booking

25. CONCLUSION

Metro Connect is a practical Core Java project that demonstrates the implementation of a Metro Card and Journey Management System.

The project combines card management, recharge, route searching, station validation, distance calculation, fare calculation, multiple ticket booking, balance management, OTP verification, transaction management, and date and time handling.

The project was developed as a learning project to strengthen Core Java programming skills through practical implementation and problem solving.

    AUTHOR
    Indhu K



https://github.com/indhu810
