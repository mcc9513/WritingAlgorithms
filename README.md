# WritingAlgorithms
Description
This project contains Java implementations of two fundamental sorting algorithms: Bubble Sort and Counting Sort. These algorithms are designed to sort arrays of integers and characters, respectively.

Implementations
1. Bubble Sort
Bubble Sort is a comparison-based sorting algorithm that repeatedly steps through the array, compares adjacent elements, and swaps them if they are in the wrong order. The process continues until the array is fully sorted.

Function Signature:
public static void bubblesort(int[] arr, int N);

Parameters:
arr: The array of integers to be sorted.
N: The size of the array.

Example Usage:
int[] arr = {64, 34, 25, 12, 22, 11, 90};
Solution.bubblesort(arr, arr.length);


2. Counting Sort
Counting Sort is a non-comparison-based sorting algorithm suitable for sorting an array of characters (lowercase English letters). It works by counting the occurrences of each character and then constructing the sorted array based on these counts.

Function Signature:
public static String countSort(String arr);

Parameters:
arr: The string of lowercase English letters to be sorted.

Example Usage:
String sortedStr = Solution.countSort("geeksforgeeks");
Complexity

Bubble Sort:
Time Complexity: O(N^2)
Space Complexity: O(1)

Counting Sort:
Time Complexity: O(N)
Space Complexity: O(N)
