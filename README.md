# Expense Splitter Calculator

## Overview

The **Expense Splitter Calculator** is a simple Java application designed to manage and split expenses among group members, 
similar to applications like SplitWise. This project helps you keep track of who owes what in a shared expense situation, 
ensuring clarity and fairness in financial transactions.

## Features

- **Group Management**: Create groups with multiple users.
- **User Tracking**: Add users to groups and manage their individual balances.
- **Expense Management**: Record spendings and specify the payer and the users involved.
- **Balance Calculation**: Automatically calculate how much each user owes or is owed.
- **Detailed Balances**: Provide detailed balances for each user, showing who owes or receives money.

## Key Concepts

- **Object-Oriented Programming (OOP)**: 
  - **Classes and Objects**: The application uses classes like `User`, `Group`, and `Spending` to encapsulate data and behavior.
  - **Encapsulation**: Data is encapsulated within classes, providing methods to interact with and update information.

- **Data Structures**:
  - **Lists**: Used to store groups of users and expenses.
  - **Maps**: Utilized for tracking balances between users.

- **Java Collections Framework**: 
  - Leveraging Java's collection classes (`ArrayList` and `HashMap`) for efficient data management.

- **Design Patterns**:
  - **Model-View Pattern**: The core logic is separated into different classes (models), making the application more modular and easier to maintain.

- **Algorithm Design**:
  - Implemented a fair and accurate algorithm to split expenses and update balances.

## Classes

- **`User`**: Represents a user with a name and balance with other users.
- **`Group`**: Represents a group of users and manages expenses among them.
- **`Spending`**: Represents a spending event with details about the amount, payer, and involved users.
- **`Splitter`**: Contains utility methods for calculating and printing balances.
- **`App`**: The main class where the application runs, showcasing the use of other classes.

## How It Works

1. **Setup**: Initialize a group and add users to it.
2. **Add Expenses**: Record spending events, specifying who paid and who was involved.
3. **Calculate Balances**: Automatically computes balances showing how much each user owes or is owed.
4. **Print Balances**: Display detailed balances for each user.