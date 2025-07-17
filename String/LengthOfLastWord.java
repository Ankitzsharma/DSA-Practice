package String;
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int length = 0;
        int i = s.length() - 1;

        // Step 1: Skip any trailing spaces
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        // Step 2: Count the length of the last word
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }

    // Test the function
    public static void main(String[] args) {
        LengthOfLastWord sol = new LengthOfLastWord();
        System.out.println(sol.lengthOfLastWord("Hello World"));          // Output: 5
        System.out.println(sol.lengthOfLastWord("   fly me   to   the moon  ")); // Output: 4
        System.out.println(sol.lengthOfLastWord("a"));                    // Output: 1
        System.out.println(sol.lengthOfLastWord("a "));                   // Output: 1
    }
}
