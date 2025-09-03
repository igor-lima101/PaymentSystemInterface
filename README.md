💳 Payment System Exercise

This project is an exercise to model a Payment System using interfaces and polymorphism in Java.
The idea is to demonstrate how a single method (processPayment) can work with different payment methods interchangeably.

🏗️ Expected Structure
1. Interface PaymentMethod

Method:

void pay(double amount);

2. Class CreditCard implements PaymentMethod

Attributes:

cardNumber

cardHolder

Implementation of pay:
Prints something like:

Paid [amount] with Credit Card [****1234].

3. Class Pix implements PaymentMethod

Attribute:

pixKey

Implementation of pay:
Prints something like:

Paid [amount] via PIX (key: xxxxx).

4. Class Cash implements PaymentMethod

No extra attributes.

Implementation of pay:
Prints:

Paid [amount] in cash.

5. Class PaymentProcessor

Method:

public void processPayment(PaymentMethod method, double amount) {
    method.pay(amount);
}

6. Class Main

Create objects of CreditCard, Pix, and Cash.

Use PaymentProcessor to process payments with different methods.

🎯 Extra Challenge

Create a DebitCard class implementing PaymentMethod.

Add balance verification: if there is not enough balance, the payment should not be processed.

🚀 Goal

By completing this exercise, you will practice:

Interfaces and implementation

Polymorphism (the same method processPayment works with any payment type)

Designing flexible and extensible code
