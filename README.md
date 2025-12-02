# Array Mastery Project

## Project Description

This project is a hands-on exercise designed to build a deep and practical understanding of one-dimensional arrays in Java. It covers the fundamental operations and common problem-solving scenarios involving arrays, implemented from scratch. The primary goal is to gain full proficiency in managing and manipulating arrays.

## Key Learning Objectives

*   Understanding array structure and basic principles.
*   Implementing core array operations: creation, reading, writing, searching, and logical deletion.
*   Developing robust methods with input validation (e.g., index bounds checking).
*   Solving common array-based challenges like reversing, copying, finding min/max, and counting element frequencies.
*   Practicing method design principles (e.g., return values, single responsibility).

## Implemented Features (Methods in `Main.java`)

1.  **`initiateArrays()`**: Initializes the `numbers` (int) and `words` (String) arrays with predefined sizes.
2.  **`addSpecificElement(int index, int value)`**: Inserts a specific `value` at a given `index`, with robust index validation. Returns `true` on success, `false` otherwise.
3.  **`fillWithRandomNumber(int min, int max)`**: Fills the `numbers` array with random integers within a specified range `[min, max)`.
4.  **`getElement(int index)`**: Retrieves the element at a specific `index`, with robust index validation. Returns the element or `-1` if the index is invalid.
5.  **`searchElement(int targetValue)`**: Searches for a `targetValue` in the `numbers` array using a linear search. Returns the index of the first occurrence or `-1` if not found.
6.  **`deleteElement(int targetIndex)`**: Logically "deletes" an element at `targetIndex` by shifting subsequent elements and setting the last element to `0`. Includes index validation. Returns `true` on success, `false` otherwise.
7.  **`modifyElement(int index, int newValue)`**: Updates the value of an element at a given `index` with `newValue`, including index validation. Returns `true` on success, `false` otherwise.
8.  **`reverseArray()`**: Reverses the order of elements in the `numbers` array in-place.
9.  **`findMinMax()`**: Finds and prints the minimum and maximum values present in the `numbers` array.
10. **`copyArray()`**: Creates a shallow copy of the `numbers` array and returns the new array.
11. **`countFrequencies(int maxValuePossible)`**: Counts the occurrences of each number in the `numbers` array, assuming numbers are within `[0, maxValuePossible]`. Prints a frequency report.

## How to Run

Assuming the project structure is `ArrayMastery/src/Main.java`:

1.  Clone this repository: `git clone https://github.com/boeani05/ArrayMastery.git`
2.  Navigate to the `src` directory: `cd ArrayMastery/src`
3.  Compile the Java code: `javac Main.java`
4.  Run the application from the `src` directory: `java Main`

The `main` method in `Main.java` contains a sequence of calls to demonstrate each implemented array operation.

## Technologies Used

*   Java
*   IntelliJ IDEA (or any other Java IDE/compiler)

## Author

boeani05