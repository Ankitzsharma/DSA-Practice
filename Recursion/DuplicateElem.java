package Recursion;
public class DuplicateElem {

    public static int countDuplicates(int arr[], int n, int i, int count) {
        // Base case: if we have reached the end of the array
        if (i >= n) {

            return count;
        }

        
        // Check if the current element is a duplicate
        for (int j = i + 1; j < n; j++) {
            if (arr[i] == arr[j]) {
                count++;
                break; // No need to check further for this element
            }
        }

        // Recursive call to the next element
        return countDuplicates(arr, n, i + 1, count);
    }

    public static void main(String[] args){
        int arr[] = {1, 2, 3, 2, 4, 5, 3, 6, 7, 8, 1};
        int n = arr.length;

        // Start counting duplicates from the first element
        int duplicateCount = countDuplicates(arr, n, 0, 0);

        System.out.println("Number of duplicate elements: " + duplicateCount);
    }
}

// This code defines a method to count the number of duplicate elements in an array using recursion.
// The `countDuplicates` method takes the array, its length, the current index, and