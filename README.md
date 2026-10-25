# CS-320-Portfolio
Portfolio artifacts for CS 320 Software Testing, Automation, and Quality Assurance.
# CS-320 Software Testing Portfolio

## Project Overview

This repository contains my work from CS 320: Software Testing, Automation, and Quality Assurance at Southern New Hampshire University.

For this course, I developed a contact management service using Java and created automated tests with JUnit 5. The goal was to make sure the application followed its requirements, handled information correctly, and responded appropriately when invalid data was entered.

The repository includes my Contact Service files from Project One and my course reflection.

## Project Files

- **Contact.java** – Defines the contact information and validates the required fields.
- **ContactService.java** – Handles adding, updating, deleting, and retrieving contacts.
- **ContactTest.java** – Contains unit tests for the Contact class.
- **ContactServiceTest.java** – Tests the functionality of the contact management service.

## Testing Approach

I used JUnit 5 to test different parts of the contact management service. I wanted to check more than whether the program ran without errors. I also needed to make sure it responded correctly when information was changed, deleted, or entered incorrectly.

My ContactServiceTest.java file includes seven tests covering:

- Adding a new contact
- Preventing duplicate contact IDs
- Deleting an existing contact
- Updating first and last names
- Updating phone numbers
- Updating addresses
- Checking expected exceptions when an operation should not be allowed

For example, I used `assertThrows()` to verify that the service rejects duplicate contact IDs and that a deleted contact cannot be retrieved. I also used `assertEquals()` to confirm that updates saved the correct information.

These tests helped me understand why both successful operations and invalid situations need to be considered when testing software.

## Course Reflection

### How can I ensure that my code, program, or software is functional and secure?

I start by reviewing the requirements and making sure I understand what the program is supposed to do. From there, I use testing to check that each part works as expected. This includes testing normal operations, invalid inputs, and situations where something could go wrong.

In this project, I used JUnit to check the contact service and verify that it handled information correctly. I also learned the importance of input validation and catching errors before software is released.

### How do I interpret user needs and incorporate them into a program?

I try to understand what the user actually needs the program to accomplish instead of focusing only on writing the code.

For this project, users needed a way to create, update, and delete contact information while following specific rules for each field. I used those requirements to guide how the program was written and what needed to be tested.

I learned that understanding the user's expectations is important because a program can run without errors and still fail to do what the user needs.

### How do I approach designing software?

When I start a project, I break it into smaller parts so I can understand what needs to be done. I look at the requirements, decide what each class should handle, and think about how the different parts of the program will work together.

I also consider what could go wrong and how I can test those situations. Working on this project helped me see why testing should be part of the development process rather than something left until the end.

## What I Took Away From This Project

One of the biggest things I learned in CS 320 is that software testing involves more than checking whether a program works once. It means checking whether it consistently follows its requirements and responds correctly to different situations.

Writing tests for the contact service gave me more experience with Java, JUnit, input validation, and finding problems in application logic. It also helped me become more comfortable reading requirements and using them to decide what should be tested.

This project is part of my Computer Science portfolio and represents the testing skills I've developed throughout my coursework at Southern New Hampshire University.
