public class SearchString {
    public static void main(String[] args) {
        String s1 = "world";
        String s2 = "hello world";
        int result = searchString(s1, s2);
        System.out.println(result);
    }

    private static int searchString(String s1, String s2) {
        int index = s2.indexOf(s1);
        return index;
    }

    /*We are developing a search engine for a new product. We need to implement a function that can search for a specific string within a larger string and return the index of its first occurrence. This function will take in two strings as parameters, s1 and s2. If s1 is found within s2, the function should return the index of the first occurrence of the substring. Else return -1*/


    /*Inside the method, the line int index = s2.indexOf(s1); is executed. The indexOf method is a built-in method in Java's String class that searches for the first occurrence of a specified substring (s1) within another string (s2). It returns the index of the first occurrence of the substring if found, or -1 if the substring is not present in the string.*/
}
