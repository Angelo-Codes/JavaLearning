import java.util.Arrays;
/*
Our startup has two databases containing important information,
 both sorted in non-decreasing order. We need to efficiently merge the
  two databases into a single sorted array to process the data. Can you write
  a function that takes in the two arrays and returns a merged
   array sorted in non-decreasing order?

Java Function Signature:

public static int[] mergeSortedArrays(int[] arr1, int[] arr2){}


Example 1:

    int[] arr1 = {1, 3, 5, 7};
    int[] arr2 = {2, 4, 6, 8};
    int[] mergedArr = mergeSortedArrays(arr1, arr2);
    // mergedArr should be {1, 2, 3, 4, 5, 6, 7, 8}


Example 2:

    int[] arr1 = {1, 2, 3, 4};
    int[] arr2 = {5, 6, 7, 8};
    int[] mergedArr = mergeSortedArrays(arr1, arr2);
    // mergedArr should be {1, 2, 3, 4, 5, 6, 7, 8}

    Create a new array to store the merged array. The length of the merged array
    will be the sum of the lengths of the two input arrays.

    Use two pointers to iterate through the two input arrays. Initialize the
    pointers to the first element of each array.

    Compare the values at the two pointers. Add the smaller value to the merged
     array and increment the corresponding pointer.

    Repeat step 3 until one of the pointers reaches the end of its array.

    Add the remaining elements of the other array to the merged array.

    Return the merged array.
*/
public class ArrayMerging {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};
        int[] mergeArr = mergeSortedArray(arr1, arr2);

        System.out.println(Arrays.toString(mergeArr));
    }

    private static int[] mergeSortedArray(int[] arr1, int[] arr2) {
        int[] mergeArr = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                mergeArr[k++] = arr1[i++];
            } else {
                mergeArr[k++] = arr2[j++];
            }
        }

        while (i < arr1.length) {
            mergeArr[k++] = arr1[i++];
        }

        while (j < arr2.length) {
            mergeArr[k++] = arr2[j++];
        }

        return mergeArr;
    }
}
   /* This method creates a new integer array called mergedArr with a length equal
   to the sum of the lengths of arr1 and arr2. This array will store the merged sorted array.

        Three variables i, j, and k are initialized to 0. These variables will be used
        as indices to track the positions in arr1, arr2, and mergedArr respectively.

        The code enters a while loop that continues as long as i is less than the
        length of arr1 and j is less than the length of arr2. This loop is responsible
         for merging the arrays by comparing elements from arr1 and arr2 and adding the
         smaller element to mergedArr. It uses the indices i, j, and k to access the
         elements of the arrays and update their positions accordingly.

        Inside the while loop, there is an if-else statement that compares the current
        elements arr1[i] and arr2[j]. If arr1[i] is smaller, it is added to mergedArr at index k,
         and both i and k are incremented. Otherwise, arr2[j] is added to mergedArr at index k,
         and both j and k are incremented.

        After the elements from either arr1 or arr2 have been exhausted (i.e., i reaches
        the end of arr1 or j reaches the end of arr2), the remaining elements from the other
        array are added to mergedArr using two separate while loops.

        Finally, the merged array mergedArr is returned as the result of the method.*/