# Java Beginner Projects: Dive into Java with Hands-on Examples!

![Java Logo](https://upload.wikimedia.org/wikipedia/de/e/e1/Java-Logo.svg)

Welcome to my Java Programming Project repository! This GitHub repository serves as a dedicated space for storing my little Java projects as I embark on my journey to learn the Java programming language.

## Project Description

As a novice Java programmer, I am working on various small projects to grasp the fundamentals of Java and enhance my programming skills. This repository contains multiple Java programs, each addressing different concepts and functionalities.

## Table of Contents

1. [BMI Calculation](#bmi-calculation)
2. [Leap Year Checker](#leap-year-checker)
3. [Lottery game](#Lottery)
4. [Zodiac finder](#zodiac)
5. [Quadratic Equations Solver](#quadraticEquationsSolver)
6. [Angle Computation for a Triangle](#ComputeAngles)
7. [Full Name Separator](#FullNameSeparator)
8. [Multiplication Table](#MultiplicationTable)
9. [GreatestCommonDivisor](#greatestCommonDivisor)
10. [Palindrome Checker](#Palindrome)
11. [Prime Numbers Display](#PrimeNumberDisplay)
12. [Average And Count Above](#AverageAndCountAbove)
13. [Card Deck Shuffle](#CardDeckShuffle)
14. [Test Swap Array](#TestSwapArray)
15. [Contributing](#contributing)
16. [License](#license)

## BMI Calculation

The `BMI_Calculation` Java program calculates the Body Mass Index (BMI) of a person. It prompts the user to input their weight (in kilograms) and height (in meters) and then calculates and displays the BMI value. This simple program can be a helpful tool for health-conscious individuals who want to keep track of their BMI.

## Leap Year Checker

The `LeapYear` Java program checks whether a given year is a leap year or not. It asks the user to input a year, and based on the leap year rules, it determines if the provided year is a leap year or a common year.

## Lottery Game

The `Lottery` Java program generates a random 2 digits number. The user will input a number of his/her choice, if the number matches the lottery, the user will be rewarded €30,000, if only one digit matches, the user will be rewarded €3,000, if one digit match even in a different order, the user will be rewarded €1,000.

## Zodiac Finder

The `zodiac` program to find out the Chinese Zodiac sign for a given year. The Chinese Zodiac is based on a 12-year cycle, with each year represented by an animal—monkey, rooster, dog, pig, rat, ox, tiger, rabbit, dragon, snake, horse, or sheep.

## Quadratic Equations Solver

The `quadraticEquationsSolver` is a simple Java program that allows users to solve quadratic equations of the form ax^2 + bx + c = 0. The program takes input for coefficients 'a', 'b', and 'c' from the user and then calculates the discriminant to determine the nature of the roots of the quadratic equation. Based on the discriminant, the program outputs the results indicating the number and values of the roots.

## Angle Computation for a Triangle

The `ComputeAngles` is a Java program computes the angles of a triangle given the coordinates of its three vertices. The user is prompted to enter the x and y coordinates for each point, and the program calculates the lengths of the sides and subsequently the angles using trigonometric formulas.

## FullNameSeparator

The `FullNameSeparator` program is a simple Java application that takes user input for a full name (first name and last name) and separates it into individual components. It utilizes the Scanner class to read user input, finds the index of the space character to identify the separation between first and last names, and then extracts and displays both components. This program demonstrates basic string manipulation and input handling in Java.

## MultiplicationTable

The `MultiplicationTable` program generates a multiplication table and prints it to the console. It's a simple yet educational example that showcases nested loops and formatting in Java programming. The program starts by printing the header and column labels, followed by a formatted grid of multiplication results from 1x1 to 9x9. It serves as a great introductory code snippet for those learning about loops and basic formatting in Java.

Key features:

Demonstrates the use of nested loops for table generation.
Utilizes printf for neatly formatting the multiplication results.
Enhances understanding of control structures and console output manipulation in Java.

## GreatestCommonDivisor

The `greatestCommonDivisor` program prompts the user to input two integers and calculates their Greatest Common Divisor (GCD). The GCD of two integers is the largest positive integer that divides both numbers without a remainder. This program employs a simple iterative method to find the GCD.

Key features:

Demonstrates the use of nested loops for table generation.
Utilizes printf for neatly formatting the multiplication results.
Enhances understanding of control structures and console output manipulation in Java.

## Palindrome Checker

This program prompts the user to input a string and then checks if the entered string is a palindrome. A palindrome is a word, phrase, number, or other sequences of characters that reads the same forward and backward (ignoring spaces, punctuation, and capitalization). If the input string qualifies as a palindrome, the program will print "[input string] is a palindrome", otherwise it will print "[input string] is not a palindrome".

Features:

Utilizes a two-pointer approach to compare characters from the beginning and end of the string.
Efficiently breaks out of the loop as soon as a non-matching character pair is found.
Simple and easy-to-understand code structure.

Perfect for beginners trying to understand string manipulations and basic algorithms in Java.

## Prime Numbers Display

This program displays the first 50 prime numbers neatly formatted in rows of 10 numbers each. Prime numbers are integers greater than 1 that have only two positive divisors: 1 and themselves. For instance, the first six prime numbers are 2, 3, 5, 7, 11, and 13. The purpose of this repository is to provide a simple, understandable demonstration of prime number identification and display in Java.

Features:

Utilizes a basic while loop to find the prime numbers.
Implements an efficient primality test by checking divisibility only up to half of the number.
Flexible: Easily adjustable for the number of primes displayed (NUMBER_OF_PRIMES) and the number of primes per line (NUMBER_OF_PRIMES_PER_LINE).
Outputs the prime numbers in a neat and organized format.

## Average And Count Above

This Java program calculates the average of a set of numbers and then determines how many of those numbers are above the average. The program first prompts the user to enter the number of items, then takes each number as input and calculates the sum. After that, it computes the average and iterates through the numbers again to count how many numbers are above the average. Finally, it prints out the average and the count of numbers above the average.

## Card Deck Shuffle

This Java program simulates the shuffling of a deck of cards and then displays the first four cards from the shuffled deck. The deck is represented as an array of integers, where each integer corresponds to a card. The program also contains arrays for the four suits (♠,♥,♦,♣) and the thirteen ranks (Ace, 2, 3, ..., King). The program starts by initializing the deck so that the integer at each position corresponds to the order of the cards (0 for the first card, 1 for the second, etc.). It then shuffles the deck by randomly swapping the cards. Finally, it prints out the first four cards of the shuffled deck by calculating the suit and rank corresponding to each integer in the deck array.

## Test Swap Array

**Description:**

The provided code serves as an educational illustration for understanding the concept of passing by value and passing by reference, and introducing how the stack and the heap memory spaces operate in Java.

**Breakdown:**

1. **Main Class and the Main Method**: 
   - `int[] a = { 6, 9};` : An integer array named 'a' is created with two elements: 6 and 9.

   - The initial values of the array are printed.

   - The `swap` method is called with the two integer values of the array. The purpose is to demonstrate that, in Java, primitive data types (like int) are passed by value. This means that the method will get copies of the values and any changes made inside the method will not reflect outside of it.

   - After the swap method invocation, the original values of the array 'a' are printed again to prove that they remain unchanged.

   - The `swapFirstTwoInArray` method is then called with the entire array. This demonstrates that, in Java, arrays are objects and are passed by reference. This means that the method will get a reference to the original array and any changes made inside the method will reflect outside of it.

   - After the `swapFirstTwoInArray` method invocation, the modified values of the array 'a' are printed to show that they have been swapped.

2. **swap Method**: 
   - Takes in two integers, n1 and n2.
   
   - The values of n1 and n2 are swapped inside the method. But since the method received copies (because of pass-by-value), the original values outside the method remain unchanged.
   
   - This demonstrates the usage of the stack, where local primitive variables reside. 

3. **swapFirstTwoInArray Method**: 
   - Takes in an integer array.
   
   - The first two elements of this array are swapped. Since arrays are passed by reference, these changes will be seen outside the method as well.
   
   - This introduces the heap space concept, where objects (like arrays) reside in memory.


## Contributing

I'm using this repository primarily for my personal learning journey in Java programming, and I am not actively seeking contributions at this time. However, if you have suggestions, improvements, or found any issues in the code, you're welcome to open an issue or reach out to me via email (zhongm@tcd.ie).




## License

This project is licensed under the [MIT License](LICENSE). Feel free to fork this repository and build upon it for your own learning purposes.

Happy coding! :rocket:
