# AtmMachine-Java-Oops-project
# ATM Machine Project

This project is a simple implementation of an ATM machine in Java. It allows users to create an account, check balance, deposit money, and withdraw money.

## Getting Started

To use the ATM machine, follow these steps:

1. Clone the repository to your local machine.
2. Open the project in your Java IDE.
3. Run the `ATM` class.

## Features

- **Account Creation**: If the entered ATM pin does not exist, it allows users to set up a new account with a pin.
- **Menu Options**: Provides a menu with options such as checking balance, depositing money, withdrawing money, checking another account, and exiting.
- **Balance Check**: Allows users to check their account balance.
- **Deposit Money**: Allows users to deposit money into their account.
- **Withdraw Money**: Allows users to withdraw money from their account.

## Usage

1. Enter the ATM pin to log in.
2. If the pin exists, it will display the menu options.
3. Choose the desired option by entering the corresponding number.
4. Follow the prompts for each option to perform actions such as checking balance, depositing, or withdrawing money.

## Example

```java
// Example of using the ATMop class
public class Main {
    public static void main(String[] args) {
        ATMop atm = new ATMop();
    }
}
