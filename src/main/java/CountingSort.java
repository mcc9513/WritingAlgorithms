public class CountingSort {
    public static String countSort(String arr) {
        // Step 1: Create a count array to store the frequency of each character.
        // an array of size 26 since there are 26 letters in the lowercase English alphabet.
        int[] count = new int[26];

        // Step 2: Fill the count array by iterating through each character in the input string.
        // For each character, increase the count at the corresponding index.
        for (char c : arr.toCharArray()) {
            // 'c - 'a'' gives the index corresponding to the character in the count array.
            // For example, 'a' - 'a' = 0, 'b' - 'a' = 1, ..., 'z' - 'a' = 25.
            count[c - 'a']++;
        }

        // Step 3: Construct the sorted string based on the count array.
        // StringBuilder to efficiently build the result string.
        StringBuilder sortedString = new StringBuilder();

        // Step 4: Iterate through the count array.
        // For each index in the count array, append the corresponding character
        // (index + 'a') to the sortedString as many times as its count indicates.
        for (int i = 0; i < 26; i++) {
            // While there are occurrences of the character corresponding to this index...
            while (count[i] > 0) {
                // Append the character (i + 'a') to the sortedString.
                sortedString.append((char) (i + 'a'));
                // Decrease the count since we've added one occurrence to the sorted string.
                count[i]--;
            }
        }

        // Step 5: Convert the StringBuilder to a string and return it as the result.
        return sortedString.toString();
    }
}
