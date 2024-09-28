// Problem: Find the missing element in a permutation array
// Input: n - size of the permutation (with one missing element)
//        arr - array of distinct integers in the range [1, n] with one element missing
// Output: Return the missing element

public class FindMissingElement {

    public static void main(String[] args) {
        // Test case 1
        int n1 = 5;
        int[] arr1 = {1, 2, 3, 5};
        System.out.println(findMissingElement(n1, arr1));  // Expected Output: 4

        // Test case 2
        int n2 = 2;
        int[] arr2 = {1};
        System.out.println(findMissingElement(n2, arr2));  // Expected Output: 2
    }

    public static int findMissingElement(int n, int[] arr) {
        int totalSum = n * (n + 1) / 2;

        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }

        // The missing element is the difference between the total sum and the actual sum
        return totalSum - actualSum;
    }
}
