# CS-320-Portfolio
Portfolio artifacts for CS 320 Software Testing, Automation, and Quality Assurance.
# CS-320 Software Testing Portfolio

## Project Overview

This repository contains my work from CS 320: Software Testing, Automation, and Quality Assurance at Southern New Hampshire University.

For this project, I developed a contact management application in Java and used JUnit 5 to test its functionality. The application allows contacts to be added, updated, and deleted while following specific requirements for the information being stored.

My goal was to make sure the application worked as expected, including situations where someone entered incorrect information or attempted an operation that shouldn't be allowed.

## Project Files

- **Contact.java** – Stores contact information and validates the required fields.
- **ContactService.java** – Handles adding, updating, deleting, and retrieving contacts.
- **ContactTest.java** – Contains 12 unit tests for the Contact class.
- **ContactServiceTest.java** – Contains 7 unit tests for the ContactService class.

## Software Testing

I created 19 automated tests using JUnit 5. The tests cover both the individual contact fields and the operations performed by the contact service.

### Contact Class Testing

I tested whether contacts were created with the correct information and how the application responded to invalid data.

My tests included:

- Creating a contact with valid information.
- Rejecting contact IDs that exceed the allowed length.
- Checking for missing or null values in required fields.
- Rejecting first and last names that exceed their length limits.
- Checking phone numbers that are too short or contain letters.
- Rejecting addresses that exceed the allowed length.

### Contact Service Testing

I also tested the operations used to manage contact records.

These tests covered:

- Adding a new contact.
- Preventing duplicate contact IDs.
- Deleting a contact and verifying it could no longer be retrieved.
- Updating first and last names.
- Updating phone numbers.
- Updating addresses.

I used `assertEquals()` to check whether the actual results matched what I expected. I also used `assertThrows()` to make sure the application rejected invalid operations by throwing the correct exception.

Testing both valid and invalid situations helped me understand how problems can be caught before an application reaches its users.

## Course Reflection

### How can I ensure that my code, program, or software is functional and secure?

I start by reviewing the requirements and making sure I understand what the program is supposed to do. From there, I test the different parts of the application to see whether they behave as expected.

In this project, I used JUnit to test normal operations, invalid inputs, and situations where the application should reject an action. I also worked with input validation to prevent incorrect information from being accepted.

I learned that testing is important because a program might appear to work correctly while still having problems that are only discovered under certain conditions. Although unit testing does not guarantee that software is completely secure, it can help identify problems with validation and application behavior.

### How do I interpret user needs and incorporate them into a program?

I try to understand what the user needs the program to accomplish before deciding how to build it.

For the contact management application, users needed a way to add, update, and delete contact information. They also needed the information to follow specific rules, such as character limits and phone number requirements.

I used those requirements to decide how the application should handle contact information and which situations needed to be tested.

This course helped me understand that software development isn't just about writing code. The application also needs to work in a way that makes sense for the person using it.

### How do I approach designing software?

When I begin a project, I break the requirements into smaller parts. I think about what each class needs to do, how the different parts will work together, and what might happen if something goes wrong.

For this project, I worked with separate classes for storing contact information and managing contact records. I then used unit tests to check that both parts behaved correctly.

I also learned the importance of considering testing during development instead of leaving it until everything is finished. It makes problems easier to identify and gives me a better understanding of how the application works.

## What I Learned

One of my biggest takeaways from CS 320 was that software testing involves more than checking whether a program runs.

I had to consider what should happen when someone enters invalid information, tries to create a duplicate record, or deletes information that should no longer be available.

Writing these tests helped me become more comfortable working with Java, JUnit, input validation, and software requirements.

This project is part of my Computer Science portfolio and shows the testing experience I've gained through my coursework at Southern New Hampshire University.
