/**
 * StringManipulator
 */
public class StringManipulator {

    /*
     * Trim both input strings and then concatenate them. Return the new string
     * Feel free to use the trim method of the String class.
     */
    public String trimAndConcat(String str1, String str2) {
        return str1.trim() + str2.trim();
    }

    /*
     * Get the index of the character and return either the index or null. If the
     * character appears multiple times, return the first index. Feel free to use
     * the indexOf method of the String class
     */
    public Integer getIndexOrNull(String str, char ch) {
        Integer result;
        int tmp = str.indexOf(ch);
        if (tmp != -1) {
            result = new Integer(tmp);
        } else {
            result = null;
        }
        return result;
    }

    /*
     * Get the index of the start of the substring and return either the index or
     * null. Feel free to use the indexOf method of the String class.
     */
    public Integer getIndexOrNull(String str1, String str2) {
        Integer result;
        int tmp = str1.indexOf(str2);
        if (tmp != -1) {
            result = new Integer(tmp);
        } else {
            result = null;
        }
        return result;
    }

    /*
     * Get a substring using a starting and ending index, and concatenate that with
     * the second string input to our method. Feel free to use the substring method
     * of the String class
     */
    String concatSubstring(String str, int start, int end, String append) {

        return str.substring(start, end) + append;

    }

}