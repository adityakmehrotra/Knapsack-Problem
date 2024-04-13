# Knapsack-Problem
This project implements an optimal solution to the Knapsack problem using dynamic programming in Java. The solution is designed to be efficient in terms of time and space, handling multiple problem instances from input data.

## Problem Description

The Knapsack problem is a classic in combinatorial optimization, where the goal is to determine the number of each item to include in a collection so that the total weight is less than or equal to a given limit and the total value is as large as possible. 

### Input Format
- The first line contains an integer `N`, the number of instances.
- For each instance:
  - A line containing two integers `n` (number of items) and `W` (capacity).
  - `n` lines follow, each containing two integers representing the weight and value of the items.

### Sample Input
  ```java
  2
  1 3
  4 100
  3 4
  1 2
  3 3
  2 4
  ```

### Output Format
- For each instance, output a single line with the maximum value possible within the given capacity.

### Sample Output
  ```java
  0
  6
  ```

### Explanation of Sample
- The first instance has one item with weight 4 and value 100 but a capacity of only 3, so no items can be taken.
- The second instance has three items, where the optimal solution is to take the first and third items, giving a total value of `6`.

## Technical Details

### Time Complexity
The dynamic programming approach to solving the Knapsack problem has a time complexity of `O(n * W)`, where `n` is the number of items and `W` is the capacity.

## Getting Started

### Prerequisites
- Java JDK 8 or higher.

### Running the Code

#### Using an IDE
1. Clone the repository:
  ```bash
  git clone https://github.com/your-username/knapsack-problem.git
  ```

2. Open the project in your IDE (e.g., Eclipse, IntelliJ) and run the `knapsack.java` file.

#### Using the Command Line
1. Navigate to the project directory:
  ```bash
  cd knapsack-problem
  ```

2. Compile the Java program:
  ```bash
  javac knapsack.java
  ```

3. Run the compiled program:
  ```bash
  java knapsack
  ```

Follow the prompts in the console to enter input or pipe input from a file.

#### Using Makefile
1. If a `Makefile` is provided, you can build and run the program with:
  ```bash
  make
  ```

This command compiles and runs the `knapsack.java` file as specified in the Makefile.

### Contributing
Contributions to this project are welcome! Please fork the repository, make your changes, and submit a pull request for review.

### Time Complexity
The time complexity of the optimal knapsack problem is **O(n * W)**, where n is the number of items and W is the capacity.

### Last Updated: 04/13/2024
