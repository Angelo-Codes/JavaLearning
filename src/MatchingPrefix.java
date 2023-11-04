public class MatchingPrefix {
    public static void main(String[] args) {
        String[] input = {"leetcode", "leet", "leeds", "leedscode"};
        String ouput = longestCommonPrefix(input);
        System.out.println(ouput);
    }

    private static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
}


/*    Matching prefixes

    You have a database of user inputted strings to be processed and analyzed.
    You need to find a way to efficiently determine the longest common prefix among
    all the strings in the database. Write a function that takes in an array of strings
    and returns the longest common prefix string. If none is found return """"

    Start by checking if the input array is empty or null. If it is, return an empty string.
    Initialize a variable `prefix` to be the first string in the input array.
    Loop through the remaining strings in the input array and compare each character of the
    `prefix` string with the corresponding character of the current string. If the characters do
    not match, update the `prefix` string to be the substring of `prefix` up to the index of the non-matching character.
    After looping through all the strings, return the `prefix` string.

    The method first checks if the strsarray is null or empty. If it is,
    meaning there are no strings to compare, the method immediately returns an empty string "".

    Assuming the strs array is not empty, the code initializes a variable called prefix
    with the value of the first string in the array (strs[0]). This sets the initial
    common prefix to be the first string.

    The code then enters a loop that iterates over the remaining strings in the strs array,
     starting from the second string (strs[1]) and going up to the last string.

    Within the loop, there is a while loop that continues as long as the current string (strs[i])
    does not start with the prefix. The startsWith method is used to check if the current s
    tring begins with the prefix.

    If the current string does not start with the prefix, it means that the common prefix
    needs to be shortened. The code reduces the length of the prefix by one character
    using the substring method and removing the last character each time (prefix.length() - 1).

    After shortening the prefix, the code checks if it has become empty (prefix.isEmpty()).
    If it has, there is no common prefix among the strings, and the method
    returns an empty string "".

    If the while loop ends, it means that the current string starts with the prefix,
     and the while loop moves on to the next string in the strs array.

    Once the loop completes, the method returns the prefix, which represents the
     longest common prefix among all the strings in the strs array.

    */
